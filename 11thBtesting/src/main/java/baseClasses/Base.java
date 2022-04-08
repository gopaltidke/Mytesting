package baseClasses;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
public class Base 
{
protected WebDriver driver;
public void launchBrowser()
{
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
ChromeOptions opt= new ChromeOptions();
opt.addArguments("--disable-notifications");
driver= new ChromeDriver(opt);
driver.get("https://kite.zerodha.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
driver.manage().window().maximize();

Reporter.log("Browserlaunched sussess",true);
}
public void closeBrowser()
{
driver.close(); 
Reporter.log("Browser closed sussess",true);
}
}
//<dependency>
//<groupId>org.apache.poi</groupId>
//<artifactId>poi</artifactId>
//<version>5.2.2</version>
//</dependency>