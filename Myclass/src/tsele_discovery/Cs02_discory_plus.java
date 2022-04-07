package tsele_discovery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cs02_discory_plus {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "D:\\velocity\\today\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();

	driver.get("https://www.discoveryplus.in/");
	driver.manage().window().maximize();
	
	Thread.sleep(20000);
	
	WebElement SignInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
	SignInButton.click();
	Thread.sleep(2000);
	
 WebElement getotpbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
	boolean result = getotpbutton.isEnabled();
	
	System.out.println("getOTPButton"+result);

	if (result )
	{
		System.out.println("get otp button is enabled");
	  getotpbutton.click();	   
	}
	else {
System.out.println("get otp button is not enabled");
	driver.findElement(By.id("mobileNumber")).sendKeys("7775069534");
	getotpbutton.click();
	Thread.sleep(10000);
	
	//driver.get("https://auth.discoveryplus.in/login/otp");
//driver.manage().window().maximize();
//Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@id='OTP']")).sendKeys("800414");
	driver.findElement(By.id("//button[text()='Submit']"));
	
	//driver.findElement(By.id("OTP")).sendKeys("800414");
	//driver.quit();
	}
		
		
}
}
