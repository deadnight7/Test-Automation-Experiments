import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AddArgumentsToEnvFile {
	public static void main (String strargs []){

		String strFilePath =  strargs [0];//"TestNG/currentTest.html";
		//File f = new File (strFilePath);
		//f.getAbsoluteFile();
		
		String strUrl = strargs [1];
		String strUserName = strargs [2];
		String strPassword = strargs [3];
		
		//Replace Text in file with test name
		modifyFile(strFilePath, "@@@url@@@", strUrl);
		modifyFile(strFilePath, "@@@user@@@", strUserName);
		modifyFile(strFilePath, "@@@pass@@@", strPassword);
		
		//modifyFile(strFilePath, strTestName, "#####TESTNAME#####");
	}

	static  void modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File(filePath);
         
        String oldContent = "";
         
        BufferedReader reader = null;
         
        FileWriter writer = null;
         
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
             
            //Reading all the lines of input text file into oldContent
             
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
             
            //Replacing oldString with newString in the oldContent
             
            String newContent = oldContent.replaceAll(oldString, newString);
             
            //Rewriting the input text file with newContent
             
            writer = new FileWriter(fileToBeModified);
             
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //Closing the resources
                 
                reader.close();
                 
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
}
