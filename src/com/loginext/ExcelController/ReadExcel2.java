package com.loginext.ExcelController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.loginext.*;
import com.loginext.Executor.Configuration;
/*
import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;
*/
public class ReadExcel2 {

	public String idKey="";
	public String idValue="";
	private int indexOfKey;

	/**
	 * readTestData - This function is responsible to provide all the records from Excel File to be used as Test Data
	 * Will Return All Key Value Pairs of Header and Corresponding Value present in Test DataSheet
	 * TestData RecordSets Example sending HashMap of TestRecords within a HashMa of TestData
	 * Key      Value
	 * Record1
	 *     Key       Value
	 * 1 : TestID : Value1
	 *     TestClassName : Value2
	 *     TestMethodName : Value3
	 *     UserName : Value4
	 *     Headers...
	 *     
	 * Record2
	 *      Key       Value
	 * 2 : TestID : Value1
	 *     TestClassName : Value2
	 *     TestMethodName : Value3
	 *     UserName : Value4
	 *     Headers...
	 *     
	 * @param sheetName
	 * @return
	 */
	@SuppressWarnings("null")
	public  LinkedHashMap <String, LinkedHashMap <String, String>> readTestData (String sheetName)  {

		Configuration configuration = Configuration.getConfigurationInstance();
		LinkedHashMap <String, LinkedHashMap<String, String>> testData = new LinkedHashMap<String, LinkedHashMap<String, String>> ();

		try {

			InputStream XlsxFileToRead = null;
			XSSFWorkbook workbook = null;
			//Class<?> c = Class.forName("com.loginext.Databin."+sheetName);
			//List<LinkedHashMap<String, String>> testData = new ArrayList<LinkedHashMap<String, String>> ();
			try {
				File file = new File(configuration.getDatasource());
				XlsxFileToRead = new FileInputStream(file.getCanonicalPath());

				//Getting the workbook instance for xlsx file
				workbook = new XSSFWorkbook(XlsxFileToRead);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			//getting the first sheet from the workbook using sheet name. 
			// We can also pass the index of the sheet which starts from '0'.

			XSSFRow row;
			XSSFCell cell = null;

			XSSFSheet sheet = workbook.getSheet(sheetName);

			//Iterating all the rows in the sheet
			Iterator rows = sheet.rowIterator();
			List <String> headers=new ArrayList<String>();
			List <String> values=new ArrayList<String>();

			while (rows.hasNext()) {

				//Adding row to TestData LinkedHashMap
				LinkedHashMap<String, String> testDataRow = new LinkedHashMap<>();

				row = (XSSFRow) rows.next();
				Iterator cells = row.cellIterator();
				//System.out.println("Reading - "+row.getRowNum());
				if (row.getRowNum()!=0) {

					//Iterating all the cells of the current row
					int cellNum = 0;
					for(int i=0; i<headers.size(); i++) {
						cell = row.getCell(i,Row.CREATE_NULL_AS_BLANK);
						String strValue = "";
						if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
							strValue = cell.getStringCellValue();
							//header.add(cell.getStringCellValue());
						} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
							strValue = cell.getNumericCellValue()+"";
							//header.add(cell.getStringCellValue().toString());
						} else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
							strValue = cell.getStringCellValue();
							//header.add(cell.getStringCellValue().toString());
						} else { // //Here if require, we can also add below methods to
							// read the cell content
							// XSSFCell.CELL_TYPE_FORMULA
							// XSSFCell.CELL_TYPE_ERROR
							//strValue = "";
						}

						//Adding values from excel row 2
						values.add(strValue);
						cellNum++;
					}
					if (cellNum > 0){
						//System.out.println(values);
						for (int i = 0; i < headers.size(); i++) 
						{ 
							testDataRow.put(headers.get(i), values.get(i));
						}
						//System.out.println("testDataRow : "+testDataRow);

						//Add the TestID with corresponding row
						String strExecution = testDataRow.get("ExecutionFlag");
						//System.out.println("strExecution: "+strExecution);
						if (strExecution.equalsIgnoreCase("Y") == false)
						{
							//Do not put test data row if the execution flag is not Y
							//System.out.println("Skipping Test since execution flag is not Y...");
							//continue;
						}
						else {
							//System.out.println("Adding Test...");
							
							/**
							 * Commenting beause test executors often forget to increment test id in excel sheet
							 */
							//testData.put(values.get(0), testDataRow);
							testData.put(row.getRowNum()+"", testDataRow);
						}
					}
					else
					{
						System.out.println("No Data Present...");
					}
					values.clear();
				}
				else{
					while (cells.hasNext()) {
						cell = (XSSFCell) cells.next();
						String strValue = "";
						if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
							strValue = cell.getStringCellValue();
							//header.add(cell.getStringCellValue());
						} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
							strValue = cell.getNumericCellValue()+"";
							//header.add(cell.getStringCellValue().toString());
						} else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
							strValue = cell.getStringCellValue();
							//header.add(cell.getStringCellValue().toString());
						} else { // //Here if require, we can also add below methods to
							// read the cell content
							// XSSFCell.CELL_TYPE_BLANK
							// XSSFCell.CELL_TYPE_FORMULA
							// XSSFCell.CELL_TYPE_ERROR
						}
						//*** System.out.println("cell.getStringCellValue(): "+strValue);
						headers.add(strValue);
					}
				}
				//System.out.println();
			}
			try {
				XlsxFileToRead.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("objectlisting: "+ (List<T>) objectlisting);
		return testData;
	}

	@SuppressWarnings("null")
	public  LinkedHashMap <String, String> readTestDataMap (String sheetName)  {

		Configuration configuration = Configuration.getConfigurationInstance();
		LinkedHashMap <String, LinkedHashMap<String, String>> testData = new LinkedHashMap<String, LinkedHashMap<String, String>> ();
		LinkedHashMap <String, String> testDataMap = new LinkedHashMap<String, String> ();

		try {

			InputStream XlsxFileToRead = null;
			XSSFWorkbook workbook = null;
			//Class<?> c = Class.forName("com.loginext.Databin."+sheetName);
			//List<LinkedHashMap<String, String>> testData = new ArrayList<LinkedHashMap<String, String>> ();
			try {
				File file = new File(configuration.getDatasource());
				XlsxFileToRead = new FileInputStream(file.getCanonicalPath());

				//Getting the workbook instance for xlsx file
				workbook = new XSSFWorkbook(XlsxFileToRead);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			//getting the first sheet from the workbook using sheet name. 
			// We can also pass the index of the sheet which starts from '0'.

			XSSFRow row;
			XSSFCell cell = null;

			XSSFSheet sheet = workbook.getSheet(sheetName);

			//Iterating all the rows in the sheet
			Iterator rows = sheet.rowIterator();
			List <String> headers=new ArrayList<String>();
			List <String> values=new ArrayList<String>();

			while (rows.hasNext()) {

				//Adding row to TestData LinkedHashMap
				LinkedHashMap<String, String> testDataRow = new LinkedHashMap<>();

				row = (XSSFRow) rows.next();
				Iterator cells = row.cellIterator();
				//System.out.println("Reading - "+row.getRowNum());
				if (row.getRowNum()!=0) {

					//Iterating all the cells of the current row
					int cellNum = 0;
					for(int i=0; i<headers.size(); i++) {
						cell = row.getCell(i,Row.CREATE_NULL_AS_BLANK);
						String strValue = "";
						if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
							strValue = cell.getStringCellValue();
							//header.add(cell.getStringCellValue());
						} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
							strValue = cell.getNumericCellValue()+"";
							//header.add(cell.getStringCellValue().toString());
						} else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
							strValue = cell.getStringCellValue();
							//header.add(cell.getStringCellValue().toString());
						} else { // //Here if require, we can also add below methods to
							// read the cell content
							// XSSFCell.CELL_TYPE_FORMULA
							// XSSFCell.CELL_TYPE_ERROR
							//strValue = "";
						}

						//Adding values from excel row 2
						values.add(strValue);
						cellNum++;
					}
					if (cellNum > 0){
						//System.out.println(values);
						//						for (int i = 0; i < headers.size(); i++) 
						//						{
						//							//testDataRow.put(headers.get(i), values.get(i));
						//						}

						//testData.put(values.get(0), testDataRow);
						testDataMap.put(values.get(0), values.get(1));
					}
					else
					{
						System.out.println("No Data Present...");
					}
					values.clear();
				}
				else{
					while (cells.hasNext()) {
						cell = (XSSFCell) cells.next();
						String strValue = "";
						if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
							strValue = cell.getStringCellValue();
							//header.add(cell.getStringCellValue());
						} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
							strValue = cell.getNumericCellValue()+"";
							//header.add(cell.getStringCellValue().toString());
						} else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
							strValue = cell.getStringCellValue();
							//header.add(cell.getStringCellValue().toString());
						} else { // //Here if require, we can also add below methods to
							// read the cell content
							// XSSFCell.CELL_TYPE_BLANK
							// XSSFCell.CELL_TYPE_FORMULA
							// XSSFCell.CELL_TYPE_ERROR
						}
						//System.out.println("cell.getStringCellValue(): "+strValue);
						headers.add(strValue);
					}
				}
				//System.out.println();
			}
			try {
				XlsxFileToRead.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("objectlisting: "+ (List<T>) objectlisting);
		return testDataMap;
	}


	/**
	 * Will preserve the order in which data was inserted in automation data sheet
	 * @param sheetName
	 * @return
	 */
	@SuppressWarnings("null")
	public static LinkedHashMap <String, String> readSortedTestDataMap (String sheetName, String strPageName)  {

		if (strPageName == null){
			System.out.println("will return nothing");
			return null;
		}
		
		Configuration configuration = Configuration.getConfigurationInstance();
		LinkedHashMap <String, LinkedHashMap<String, String>> testData = new LinkedHashMap<String, LinkedHashMap<String, String>> ();
		LinkedHashMap <String, String> testDataMap = new LinkedHashMap <String, String> ();

		try {

			InputStream XlsxFileToRead = null;
			XSSFWorkbook workbook = null;
			//Class<?> c = Class.forName("com.loginext.Databin."+sheetName);
			//List<LinkedHashMap<String, String>> testData = new ArrayList<LinkedHashMap<String, String>> ();
			try {
				File file = new File(configuration.getDatasource());
				XlsxFileToRead = new FileInputStream(file.getCanonicalPath());

				//Getting the workbook instance for xlsx file
				workbook = new XSSFWorkbook(XlsxFileToRead);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			//getting the first sheet from the workbook using sheet name. 
			// We can also pass the index of the sheet which starts from '0'.

			XSSFRow row;
			XSSFCell cell = null;

			XSSFSheet sheet = workbook.getSheet(sheetName);

			//Iterating all the rows in the sheet
			Iterator rows = sheet.rowIterator();
			List <String> headers=new ArrayList<String>();
			List <String> values=new ArrayList<String>();

			//addValueToDataMap will be set to true once it finds 
			boolean addValueToDataMap = false;
			while (rows.hasNext()) {

				//Adding row to TestData LinkedHashMap
				LinkedHashMap<String, String> testDataRow = new LinkedHashMap<>();

				row = (XSSFRow) rows.next();
				Iterator cells = row.cellIterator();
				//System.out.println("Reading - "+row.getRowNum());
				if (row.getRowNum()!=0) {

					//Iterating all the cells of the current row
					int cellNum = 0;
					for(int i=0; i<headers.size(); i++) {
						cell = row.getCell(i,Row.CREATE_NULL_AS_BLANK);
						String strValue = "";
						if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
							strValue = cell.getStringCellValue();
							//header.add(cell.getStringCellValue());
						} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
							strValue = cell.getNumericCellValue()+"";
							//header.add(cell.getStringCellValue().toString());
						} else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
							strValue = cell.getStringCellValue();
							//header.add(cell.getStringCellValue().toString());
						} else { // //Here if require, we can also add below methods to
							// read the cell content
							// XSSFCell.CELL_TYPE_FORMULA
							// XSSFCell.CELL_TYPE_ERROR
							//strValue = "";
						}

						//Adding values from excel row 2
						values.add(strValue);
						System.out.println("strValue: "+strValue);
						cellNum++;
					}
					if (cellNum > 0){

						//stop adding to testdata map only if the value is present in between the limits of page_structure eg - Orders_Page_Start and Orders_Page_End
						if (values.get(0).equalsIgnoreCase(strPageName + "_End")){
							addValueToDataMap = false;
						}
						
						if (addValueToDataMap == true){
							testDataMap.put(values.get(0), values.get(1));	
						}

						//add to testdata map only if the value is present in between the limits of page_structure eg - Orders_Page_Start and Orders_Page_End
						if (values.get(0).equalsIgnoreCase(strPageName + "_Start")){
							addValueToDataMap = true;
						}						
					}
					else
					{
						System.out.println("No Data Present...");
					}
					values.clear();
				}
				else{
					while (cells.hasNext()) {
						cell = (XSSFCell) cells.next();
						String strValue = "";
						if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
							strValue = cell.getStringCellValue();
							//header.add(cell.getStringCellValue());
						} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
							strValue = cell.getNumericCellValue()+"";
							//header.add(cell.getStringCellValue().toString());
						} else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
							strValue = cell.getStringCellValue();
							//header.add(cell.getStringCellValue().toString());
						} else { // //Here if require, we can also add below methods to
							// read the cell content
							// XSSFCell.CELL_TYPE_BLANK
							// XSSFCell.CELL_TYPE_FORMULA
							// XSSFCell.CELL_TYPE_ERROR
						}
						//System.out.println("cell.getStringCellValue(): "+strValue);
						headers.add(strValue);
					}
				}
				//System.out.println();
			}
			try {
				XlsxFileToRead.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("objectlisting: "+ (List<T>) objectlisting);
		return testDataMap;
	}


	

	public static void main (String s []){
		/*LinkedHashMap<String, String> pageDataMap = readSortedTestDataMap("DataMap", "Orders_Page");
		for (String strDataMapKey : pageDataMap.keySet())
		{
			String strDataMapValue = pageDataMap.get(strDataMapKey);
			System.out.println("Data - "+strDataMapKey+ " : "+strDataMapValue);
		}*/
		
		//readMultipleTestDataMap("DataMap");
		
		String strCurrentHeaderName = "Value1";//headers.get(iHeaderIndex);
		if (strCurrentHeaderName != null && 
				!(strCurrentHeaderName.equalsIgnoreCase("Dataset") || strCurrentHeaderName.equalsIgnoreCase("Value"))){
			System.out.println("Will not read...");
		}
		else{
			System.out.println("Will read...");
		}
	}

	public ReadExcel2() {
	}

	public static LinkedList <LinkedHashMap <String, String>> readMultipleTestDataMap (String sheetName) {
		

		Configuration configuration = Configuration.getConfigurationInstance();
		LinkedList <LinkedHashMap <String, String>> testDataLists = new LinkedList <LinkedHashMap <String, String>> ();
		
		try {

			InputStream XlsxFileToRead = null;
			XSSFWorkbook workbook = null;
			//Class<?> c = Class.forName("com.loginext.Databin."+sheetName);
			//List<LinkedHashMap<String, String>> testData = new ArrayList<LinkedHashMap<String, String>> ();
			try {
				File file = new File(configuration.getDatasource());
				XlsxFileToRead = new FileInputStream(file.getCanonicalPath());

				//Getting the workbook instance for xlsx file
				workbook = new XSSFWorkbook(XlsxFileToRead);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			//getting the first sheet from the workbook using sheet name. 
			// We can also pass the index of the sheet which starts from '0'.

			XSSFRow row;
			XSSFCell cellValue = null;

			XSSFSheet sheet = workbook.getSheet(sheetName);

			//Iterating all the rows in the sheet
			Iterator rows = sheet.rowIterator();
			List <String> headers=new ArrayList<String>();
			List <String> values=new ArrayList<String>();
			
			//addValueToDataMap will be set to true once it finds 
			boolean addValueToDataMap = false;
			while (rows.hasNext()) {

				row = (XSSFRow) rows.next();
				Iterator cells = row.cellIterator();
				//System.out.println("Reading - "+row.getRowNum());
				if (row.getRowNum() == 0) {
					while (cells.hasNext()) {
						cellValue = (XSSFCell) cells.next();
						String strValue = "";
						if (cellValue.getCellType() == XSSFCell.CELL_TYPE_STRING) {
							strValue = cellValue.getStringCellValue();
							//header.add(cell.getStringCellValue());
						} else if (cellValue.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
							strValue = cellValue.getNumericCellValue()+"";
							//header.add(cell.getStringCellValue().toString());
						} else if (cellValue.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
							strValue = cellValue.getStringCellValue();
							//header.add(cell.getStringCellValue().toString());
						} else { // //Here if require, we can also add below methods to
							// read the cell content
							// XSSFCell.CELL_TYPE_BLANK
							// XSSFCell.CELL_TYPE_FORMULA
							// XSSFCell.CELL_TYPE_ERROR
						}
						//System.out.println("cell.getStringCellValue(): "+strValue);
						
						headers.add(strValue);
					}
				}
				//System.out.println();
			}
			
			for (int iHeaderIndex = 1; iHeaderIndex < headers.size(); iHeaderIndex++) 
			{
				String strCurrentHeaderName = headers.get(iHeaderIndex);
				if (strCurrentHeaderName != null && 
						!(strCurrentHeaderName.equalsIgnoreCase("Dataset") || strCurrentHeaderName.equalsIgnoreCase("Value"))){
					//System.out.println("Will not read column : "+strCurrentHeaderName);
					continue;
				}
				
				LinkedHashMap <String, String> testDataRow = new LinkedHashMap <String, String> ();
				
				//System.out.println("headers: "+headers.get(iHeaderIndex ));
				rows = sheet.rowIterator();
				while (rows.hasNext())
				{
					Row currentRow = (XSSFRow) rows.next();
					if (currentRow .getRowNum() == 0){
						continue;
					}
					
					cellValue = (XSSFCell) currentRow.getCell(iHeaderIndex, Row.CREATE_NULL_AS_BLANK);
					XSSFCell cellKey = (XSSFCell) currentRow.getCell(0, Row.CREATE_NULL_AS_BLANK);
					
					String strValue = "";
					if (cellValue.getCellType() == XSSFCell.CELL_TYPE_STRING) {
						strValue = cellValue.getStringCellValue();
						//header.add(cell.getStringCellValue());
					} else if (cellValue.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
						strValue = cellValue.getNumericCellValue()+"";
						//header.add(cell.getStringCellValue().toString());
					} else if (cellValue.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
						strValue = cellValue.getStringCellValue();
						//header.add(cell.getStringCellValue().toString());
					} else { // //Here if require, we can also add below methods to
						// read the cell content
						// XSSFCell.CELL_TYPE_BLANK
						// XSSFCell.CELL_TYPE_FORMULA
						// XSSFCell.CELL_TYPE_ERROR
					}
					
					try {
						//System.out.println("currentValue "+cellKey.getStringCellValue()+" : "+ strValue);
						testDataRow.put(cellKey.getStringCellValue(), strValue);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
				testDataLists.add(testDataRow);
			}
			
			
			try {
				XlsxFileToRead.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("objectlisting: "+ (List<T>) objectlisting);

		return testDataLists;
	}

}
