package tSelenium_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cs03_kite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");
	
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		driver.findElement(By.id("userid")).sendKeys("1245");
		Thread.sleep(2000);
		
		driver.findElement(By.id("userid")).clear();
		Thread.sleep(2000);
		driver.quit();

		
//		driver.findElement(By.name("userid"));
//		
//		driver.findElement(By.id("userid")).sendKeys("123");
//		
		//locator-->name
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
