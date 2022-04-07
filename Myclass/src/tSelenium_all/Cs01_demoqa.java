package tSelenium_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cs01_demoqa{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\velocity\\today\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		  driver.get("https://demoqa.com");
		  
		  driver.manage().window().maximize();
		  Thread.sleep(5000);	
			driver.findElement(By.xpath("(//div[@class='card-up'])[4]")).click();
  
		  Thread.sleep(6000);	
		
	driver.findElement(By.id("item-0")).click();
		Thread.sleep(5000);
	//xpath("(//span[@class='text'])[2]"
	}
}
