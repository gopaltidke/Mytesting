package tsele_Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshotsnapsot {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");

    WebDriver driver =new ChromeDriver();
	driver.get("https://vctcpune.com/");
	driver.manage().window().minimize();
	Thread.sleep(1000);
	
	File sourse=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String randomvalue = RandomString.make(2);
	File destination = new File("D:\\velocity\\abc"+randomvalue+".png");
	FileHandler.copy(sourse, destination);
	
//*[@id="password_step_input"]
}

}
