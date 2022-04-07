package kiteTESTpackage;

import org.testng.annotations.Test;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseClasses.Base;
import kitePOMpackage.KiteLoginPage;
import kiteUtility.Utility;

public class KiteAppUserPassErrorMsgValidation extends
Base {
 
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
login.enterUserID(Utility.readDataFromExcel(0, 0));
login.clickOnLoginButtton();
}
@Test
 public void validateUserPasserrorMsg() throws EncryptedDocumentException, IOException
{
int TCID=440;
String expectedUserPasserrorMsg=Utility.readDataFromExcel(0, 5);
String actualUserPasserrorMsg = login.getUserPassErrorMsg();
Assert.assertEquals(actualUserPasserrorMsg, expectedUserPasserrorMsg,"Error msg is not matching");
Utility.takeScreenshot(driver, TCID);
}
@AfterClass
public void browserClosing()
{
closeBrowser();
}
}
