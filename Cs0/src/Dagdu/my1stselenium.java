package Dagdu;

//import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class my1stselenium {

public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","D:\\velocity\\today\\chromedriver_win32\\chromedriver.exe");
	
  WebDriver driver = new ChromeDriver();
 driver.get("http://www.wikipedia.org");
 WebElement link;
 link =driver.findElement(By.linkText("English"));
 link.click();
 Thread.sleep(5000);
 WebElement searchBox;
searchBox = driver.findElement(By.id("searchInput"));
searchBox.sendKeys("Software");
searchBox.submit();
Thread.sleep(5000);
driver.quit();

	//driver.get("https://www.youtube.com/watch?v=sqmNziU3OxQ");
	
	
	
	
	
	}}
//"D:\\velocity\\today\\chromedriver_win32"
//chromedriver.exe
//D:\velocity\today\chromedriver_win32
//"webdriver.chrome.driver" fix key