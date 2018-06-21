package com.loginext.TestNGController;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class SetTestListener implements IAnnotationTransformer {
	
	private int getTestPriority() {
		//logic to get priority for this test
		return 0;
	}

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

		TestNGRunner runner = new TestNGRunner();

		//This Map can hold your testng Parameters sheet.
		LinkedHashMap <String, LinkedHashMap <String, String>> restDataMap = runner.readTestData();
		int iLeastPriority = 9999;
		for(String strTestID : restDataMap.keySet())
		{
			//Iterate over each testID...
			HashMap <String, String> testRow = restDataMap.get(strTestID);
			//System.out.println(testRow);
			String strTestMethodName = testRow.get("TestMethodName");
			
			//System.out.println(strTestClassName +" "+ testClass + " "+testConstructor + " "+testMethod.getClass());
			if (strTestMethodName.equals(testMethod.getName())){
				String strTestPriority = "";
				
				//Setting test priority to least
				int iTestPriority = iLeastPriority; 
				try 
				{
					//Get the priority from sheet and assign back to test
					strTestPriority = testRow.get("Priority");
					double dPriority = Double.parseDouble (strTestPriority);
					iTestPriority = (int) dPriority;
					System.out.println("Setting method priority : "+iTestPriority+ " for test method  :"+testMethod.getName() + "");
				}
				catch (Exception e) 
				{
					//e.printStackTrace();
					System.err.println("Unable to get priority for test - Setting it to "+iLeastPriority++);
				}
				
				//Do not set TestID as priority - set a priority column as priority
				//annotation.setPriority(Integer.parseInt(strTestID));
				annotation.setPriority(iTestPriority);	
				
				
				//Adding logic to add annotation with iInvocationCount
				try {
					String strInvocationCount = testRow.get("InvocationCount");
					double dInvocationCount = Double.parseDouble(strInvocationCount);
					int iInvocationCount = (int) dInvocationCount;
					annotation.setInvocationCount(iInvocationCount);	
				} catch (Exception e) {
					//e.printStackTrace();
					//System.err.println("Error in adding invocation count");
				}
				
			}
		}
		
	}
	/*
    @Override
    public void transform(final ITestAnnotation annotation, final Class testClass,
        final Constructor constructor, final Method method) {
        if ("myTestName".equals(method.getName())) {
            annotation.setPriority(getTestPriority());
        }
    }
	 */
	
}