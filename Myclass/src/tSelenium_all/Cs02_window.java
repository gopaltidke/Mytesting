package tSelenium_all;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cs02_window {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/"); //1st 
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.name("NewTab")).click();
		
		driver.findElement(By.xpath("(//a[@title=\"Contact me\"])[2]")).click();
		
		
		

	}}
