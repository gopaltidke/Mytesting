package tSelenium_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifram {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");

			WebDriver driver= new ChromeDriver();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			//swith to frame
			driver.switchTo().frame("courses-iframe");
			
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"et_mobile_nav_menu\"]/div/span[2]")).click();

		}
	}


