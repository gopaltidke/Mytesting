package qSele_webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cs01_xpath_by_attribute {
public static void main(String[] args) throws InterruptedException {
	
//	1.	xpath by ATTRIBUTE
//	Syntax :tagname[@attribute name = ‘attribute value’]	   
//	   e.g. :- //input[@id = ‘abc’]
//	   driver.findElement(By.xpath(“//input[@id = ‘abc’]”).click();

	System.setProperty("webdriver.gecko.driver", "D:\\velocity\\today\\geckodriver.exe");

	WebDriver driver = new FirefoxDriver();


	  driver.get("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Fmozilla%2Fgeckodriver%2Freleases");
	  
	  driver.manage().window().maximize();
	  
	  Thread.sleep(5000);

	  driver.findElement(By.xpath("//input[@name='login']")).sendKeys("gopaltidke3@gmail.com");
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Gopal");
	  Thread.sleep(5000);

	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Thread.sleep(5000);

	  driver.findElement(By.xpath("//a[@data-ga-click='Sign in, switch to sign up']")).click();
	 
	  Thread.sleep(5000);
	  driver.navigate().back();
	  Thread.sleep(5000);

	  driver.quit();

	
	
	  
	  
}
}