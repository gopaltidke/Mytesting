package ubrave;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cs01 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");
		
		ChromeOptions opt =new ChromeOptions();
		opt.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver driver =new ChromeDriver(opt);
		
		
	//	System.setProperty("webdriver.gecko.driver", "D:\\velocity\\today\\geckodriver.exe");
 //firefox web driver-->"webdriver.gecko.driver
		//WebDriver driver = new FirefoxDriver();

		
		
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		WebElement Signinbutton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		//WebElement Signinbutton = driver.findElement(By.xpath("(//div[@id=\"#signIn\"])[1]"));

		//WebElement Signinbutton = driver.findElement(By.id("#signIn"));
	
		Thread.sleep(2000);
		
		Signinbutton.click();
		Thread.sleep(2000);
		
	}

}
