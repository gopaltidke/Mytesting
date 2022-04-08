package kiteTESTpackage;

import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.Base;
import kitePOMpackage.KiteLoginPage;
import kiteUtility.Utility;

public class KiteaLLInnone extends Base {
	
	KiteLoginPage login;
	
	@BeforeClass
	public void LaunchBrowser()
	{
	launchBrowser();
	login= new KiteLoginPage(driver);
	login.clickOnLoginButtton();
	}
	
	@BeforeMethod
	public void LoginToKiteApp() throws EncryptedDocumentException, IOException
	{
	//login.enterUserID(Utility.readDataFromExcel(0, 0));
	}
	
	@Test(priority = 1)
	 public void validateUserPasserrorMsg() throws EncryptedDocumentException, IOException
	{
	int TCID=4;
	String 
	expectedUserIDerrorMsg=Utility.readDataFromExcel(0, 4);
	String actualUserIDerrorMsg = login.getUserIdErrorMsg();
	Assert.assertEquals(actualUserIDerrorMsg, expectedUserIDerrorMsg,"Error msg is not matching");
	String 
	expectedUserPasserrorMsg=Utility.readDataFromExcel(0, 5);
	String actualUserPasserrorMsg = login.getUserPassErrorMsg();
	Assert.assertEquals(actualUserPasserrorMsg, expectedUserPasserrorMsg,"Error msg is not matching");
	Utility.takeScreenshot(driver, TCID);
	}
	
//2	
	@Test(priority = 2)
	public void LoginToKiteApp1() throws EncryptedDocumentException, IOException
	{
	login.enterPAssword(Utility.readDataFromExcel(0, 1));
	login.clickOnLoginButtton();
driver.navigate().refresh();
	}
	
	
	@AfterMethod
	 public void validateUserIDerrorMsg() throws EncryptedDocumentException, IOException
	{
	int TCID=05;
	String expectedUserIDerrorMsg1=Utility.readDataFromExcel(0, 4);
	String actualUserIDerrorMsg1 = login.getUserIdErrorMsg();
	Assert.assertEquals(actualUserIDerrorMsg1, expectedUserIDerrorMsg1,"Error msg is not matching");
	Utility.takeScreenshot(driver, TCID);
	}
	
	//3
	@Test(priority = 3)
	public void LoginToKiteApp2() throws EncryptedDocumentException, IOException
	{
	login.enterUserID(Utility.readDataFromExcel(0, 0));
	login.clickOnLoginButtton();
	}
	
	@AfterMethod
	 public void validateUserPasserrorMsg2() throws EncryptedDocumentException, IOException
	{
	int TCID=440;
	String expectedUserPasserrorMsg2=Utility.readDataFromExcel(0, 5);
	String actualUserPasserrorMsg2 = login.getUserPassErrorMsg();
	Assert.assertEquals(actualUserPasserrorMsg2, expectedUserPasserrorMsg2,"Error msg is not matching");
	Utility.takeScreenshot(driver, TCID);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
 
	