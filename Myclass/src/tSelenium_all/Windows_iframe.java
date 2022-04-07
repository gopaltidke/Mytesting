package tSelenium_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Windows_iframe{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//3
		driver.switchTo().frame("frame3");
		Thread.sleep(10000);
		WebElement checkbox = driver.findElement(By.id("frame3"));
//		 boolean result = checkbox.isSelected();
		 checkbox.click();
//		 if (result) {
//			System.out.println("it is selected by default");
//		} else {
//       checkbox.click();
//		}
		Thread.sleep(2000);
		
//		//2
//		 driver.switchTo().frame("frame2");
//		 Thread.sleep(2000);
//		 WebElement dropdown = driver.findElement(By.id("animals"));
//		 Select s =new Select(dropdown);
//		 s.selectByValue("avatar");
//		 Thread.sleep(2000);
//		 s.selectByValue("big baby cat");
//		 Thread.sleep(2000);
//		 s.selectByValue("babycat");
//		 Thread.sleep(2000);
//		
//		
//		//1
//			driver.switchTo().frame("frame1");
//			
//			driver.findElement(By.xpath("/html/body/input")).sendKeys("bhau");
//			Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.id("topic")).sendKeys("sagarbhau");
//		Thread.sleep(2000);
		
		
}
}