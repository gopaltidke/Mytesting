package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.ScreenshotException;

import net.bytebuddy.utility.RandomString;

public class Creenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");
//
//		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "D:\\velocity\\today\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		       String random = RandomString.make(1);
		       File destination = new File("D:\\"+random+".png");
		//       File destination = new File("D:\\"+random".png" );
		       
		       FileHandler.copy(source, destination);
		       
	}

}
