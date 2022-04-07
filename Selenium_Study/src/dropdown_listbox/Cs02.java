package dropdown_listbox;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Cs02 {
public static void main(String [] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\12\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement creatnewac = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	creatnewac.click();
	Thread.sleep(2000);
	WebElement username = driver.findElement(By.xpath("//input[@name='firstname']"));
	username.sendKeys("Pushpa Pushparaj");
	WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
	lastname.sendKeys("Jhukega Nai");
	WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	email.sendKeys("8888888888");
	WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	password.sendKeys("Pass@1234");
	Thread.sleep(2000);
	WebElement list = driver.findElement(By.xpath("//select[@id='day']"));
	Select s = new Select(list);
	s.selectByIndex(01);
	WebElement list1 = driver.findElement(By.xpath("//select[@id='month']"));
	Select s1 = new Select(list1);
	s1.selectByIndex(01);
	WebElement list2 = driver.findElement(By.xpath("//select[@id='year']"));
	Select s2 = new Select(list2);
	s2.selectByValue("2002");
	
	WebElement gender = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
	gender.click();
	
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	Thread.sleep(2000);
	
	 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
		File destination = new File("D:\\velocity\\screenshotsclickbyselenium\\ScreenShot1.jpg");
		FileHandler.copy(source, destination);
	
	

	
	
	
}
}