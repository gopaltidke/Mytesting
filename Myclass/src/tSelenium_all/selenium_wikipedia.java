package tSelenium_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class selenium_wikipedia {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");

		//firefox web driver-->"webdriver.gecko.driver
		
	//	WebDriver driver =new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/");
			WebElement link;
			link =driver.findElement(By.linkText("English"));
			link.click();
			
			Thread.sleep(5000);
			
			WebElement searchBox;
			searchBox = driver.findElement(By.id("searchInput"));
			searchBox.sendKeys ("hardware");
			searchBox.submit();
			
			searchBox = driver.findElement(By.id("searchInput"));
			searchBox.sendKeys ("Sant Gajanan Maharaj");
			searchBox.submit();
			
			Thread.sleep(5000);
			
			driver.quit();	
		
	}

}
