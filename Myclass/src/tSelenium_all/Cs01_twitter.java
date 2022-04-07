package tSelenium_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cs01_twitter {
	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");

		   WebDriver driver =new ChromeDriver();

    driver.get("https://twitter.com/i/flow/login");		   
		   
    driver.manage().window().maximize();
    Thread.sleep(2000);
		   
//    driver.findElement(By.name("text")).sendKeys("12455445");
//		   Thread.sleep(2000);
		//   driver.findElement(By.xpath("//input[@name='text']")).sendKeys("gohhgpaltidke3@gmail.com");
		 // Thread.sleep(2000);
////div[@role='button']
		   driver.findElement(By.xpath("//div[@role='button']")).click();
		   
		   Thread.sleep(2000);
	
	
	}
}
