package tSelenium_all;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_andling {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");

	WebDriver driver= new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/"); //1st 
	driver.manage().window().maximize();
	Thread.sleep(2000);

	driver.findElement(By.name("NewTab")).click();//2nd
	
	//remote create
			Set<String> allWindowIds = driver.getWindowHandles();
		//	System.out.println("All ids are "+allWindowIds);
			Iterator<String> it=allWindowIds.iterator();
			String mainPageID = it.next();
			String childPageID1 = it.next();
			Thread.sleep(2000);
	
			
}
}