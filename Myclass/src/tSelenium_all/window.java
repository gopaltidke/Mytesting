package tSelenium_all;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement clickMeButton = driver.findElement(By.id("confirmButton"));
		clickMeButton.click();
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();// switched selenium focus to alert popup	
		alt.accept();// accepting alert-->clicking on ok button
		
	    //driver.quit();
		

	}

}

