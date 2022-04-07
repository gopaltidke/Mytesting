package uinternetex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cs01 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");

			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://skpatro.github.io/demo/links/"); //1
			driver.manage().window().maximize();
			Thread.sleep(2000);

		}

}
