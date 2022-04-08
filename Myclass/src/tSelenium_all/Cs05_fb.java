package tSelenium_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Cs05_fb {
public static void main(String[] args) throws InterruptedException {
	

//	System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");
//
//	WebDriver driver= new ChromeDriver();
	
	System.setProperty("webdriver.gecko.driver", "D:\\velocity\\today\\geckodriver.exe");

	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();

Thread.sleep(3000);

//driver.findElement(By.name("firstname")).sendKeys("Gopal");
//	
//Thread.sleep(3000);
//
//driver.findElement(By.name("lastname")).sendKeys("Gopal");
//
//Thread.sleep(3000);
//
//driver.findElement(By.name("reg_email__")).sendKeys("Gopal");
//
//Thread.sleep(3000);
//
//driver.findElement(By.name("reg_passwd__")).sendKeys("Gopal");

//Thread.sleep(3000);
//xpath(//select[@title='Day']);

WebElement date =driver.findElement(By.id("day"));	
//   Select s = new Select(date);
//   s.selectByIndex(10);
   date.sendKeys("21");
   

WebElement month = driver.findElement(By.id("month"));
month.sendKeys("feb");
//   Select s1 = new Select(month);
//   s1.selectByValue("11");
//
WebElement year = driver.findElement(By.id("year"));
year.sendKeys("1997");
//   Select s2 = new Select(year);
//   s2.selectByValue("1998");
	
}	
}
