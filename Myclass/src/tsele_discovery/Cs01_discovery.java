package tsele_discovery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//WebElement SignInButton = driver.findElement(By.xpath(""));
		//driver.findElement(By.tagName("button")).click();
public class Cs01_discovery {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "D:\\velocity\\today\\geckodriver.exe");

		//firefox web driver-->"webdriver.gecko.driver
		
	//	WebDriver driver =new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.egde.driver", "D:\\velocity\\today\\01\\edgedriver_win64\\msedgedriver.exe");

		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement Signinbutton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		Thread.sleep(2000);
		
		Signinbutton.click();
		Thread.sleep(2000);
		
	}

}
