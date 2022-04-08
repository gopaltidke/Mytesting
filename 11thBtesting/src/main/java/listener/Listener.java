package listener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import baseClasses.Base2;


public class Listener extends Base2  implements ITestListener
{
	
	public void onTestFailure(ITestResult result)
	{
		String TCName1 = result.getName();
		System.out.println("Failed Tc name is "+result.getName());
		try {
			takeScreenshot(TCName1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		String TCName2 = result.getName();
		System.out.println("Passed TC name is "+result.getName());
		try {
			takeScreenshot(TCName2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}