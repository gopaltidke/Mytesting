package kiteApptest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.Utility;
import baseClasses.Base2;
import kitePOMpackage.KiteLoginPage;
@Listeners(listener.Listener.class)
public class KiteAppUserIDandPassErrorMsgValidation extends
Base2 {
 
KiteLoginPage login;
@BeforeClass
public void LaunchBrowser()
{
launchBrowser();
login= new KiteLoginPage(driver);
}
@BeforeMethod
public void LoginToKiteApp() throws EncryptedDocumentException, IOException
{
//login.enterUserID(Utility.readDataFromExcel(0, 0));
login.clickOnLoginButtton();
}
@Test
 public void validateUserPasserrorMsg() throws EncryptedDocumentException, IOException
{
//int TCID=840;
String 
expectedUserIDerrorMsg=Utility.readDataFromExcel(0, 4);
String actualUserIDerrorMsg = login.getUserIdErrorMsg();
Assert.assertEquals(actualUserIDerrorMsg, expectedUserIDerrorMsg,"Error msg is not matching");
String 
expectedUserPasserrorMsg=Utility.readDataFromExcel(0, 5);
String actualUserPasserrorMsg = login.getUserPassErrorMsg();
Assert.assertEquals(actualUserPasserrorMsg, expectedUserPasserrorMsg,"Error msg is not matching");
//Utility.takeScreenshot(driver, TCID);
}
@AfterClass
public void browserClosing()
{
closeBrowser();
}
}
