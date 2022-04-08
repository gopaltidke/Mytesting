package tSelenium_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cs02_kite {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");
	
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
	Thread.sleep(2000);
//		locator-->id
	driver.findElement(By.id("userid")).sendKeys("1245");
	
	  
		driver.findElement(By.id("password")).sendKeys("1245");
		Thread.sleep(2000);		
		

       //locator--> tagName
		driver.findElement(By.tagName("button")).click();
	
		
	//	driver.findElement(By.tagName("button")).click();
//		WebElement UserName = driver.findElement(By.id("userid"));
//		
//		UserName.sendKeys("111111");
//		Thread.sleep(2000);
//	     UserName.clear();
//	     
//		UserName.sendKeys("455444");
//	
	}
	
	
	

}
