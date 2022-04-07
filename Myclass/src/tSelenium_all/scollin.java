package tSelenium_all;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scollin {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");

	WebDriver d= new ChromeDriver();
	d.get("https://demoqa.com/alerts");
	d.manage().window().maximize();
	Thread.sleep(3000);

	JavascriptExecutor a1 = (JavascriptExecutor)d;
	
	a1.executeScript("window.scrollBy(0,120)");
	Thread.sleep(3000);
	a1.executeScript("window.scrollBy(0,-70)");

}
}