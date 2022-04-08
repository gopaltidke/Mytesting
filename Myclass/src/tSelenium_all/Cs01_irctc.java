package tSelenium_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cs01_irctc {

	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");

	   WebDriver driver =new ChromeDriver();
		
       driver.get("https://www.irctc.co.in/nget/train-search");		
       driver.manage().window().maximize();
       
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
       
       driver.findElement(By.xpath("//a[@aria-label='Click here to Login in application']")).click();
		
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//input[@formcontrolname='userid']")).sendKeys("gopal");
		
	   Thread.sleep(2000);
		
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("gopal");
	   Thread.sleep(2000);
      //input[@id='captcha']
	   driver.findElement(By.xpath("//input[@id='captcha']")).sendKeys("gopal");
	   Thread.sleep(2000);
	  //button[@class='search_btn train_Search']
	  //driver.findElement(By.xpath("click();
	  //driver.findElement(By.xpath("//button[@class='search_btn train_Search']")).click();
	  //button[@label='Find Trains']	   
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   Thread.sleep(2000);	
	}

}
