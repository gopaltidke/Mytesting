package tSelenium_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Cs02_deemoqa {public static void main(String[] args) throws InterruptedException {
	
//	System.setProperty("webdriver.gecko.driver", "D:\\velocity\\today\\geckodriver.exe");
//
//	WebDriver driver = new FirefoxDriver();
	
	System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");

	WebDriver driver= new ChromeDriver();
	
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	Thread.sleep(3000);

	WebElement multiSelectBox = driver.findElement(By.name("cars"));
	Select s= new Select(multiSelectBox);

	
	s.selectByIndex(2);
	Thread.sleep(3000);
	s.selectByVisibleText("Volvo");
	Thread.sleep(3000);
	s.selectByValue("saab");
	
	Thread.sleep(3000);
	s.selectByIndex(3);
	Thread.sleep(3000);
	
	s.deselectAll();
}

}

