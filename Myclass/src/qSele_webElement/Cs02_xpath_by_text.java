package qSele_webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cs02_xpath_by_text {
	//System.setProperty("webdriver.gecko.driver", "D:\\velocity\\today\\geckodriver.exe");

	//WebDriver driver = new FirefoxDriver();
//	2.	xpath by text
//	Syntax : tagname[text() = ‘textvalue’]
//	   e.g. :- //a[text() = ‘link1’]
	
//	   driver.findElement(By.xpath(“//a[text() = ‘link1’]”);
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "D:\\velocity\\today\\geckodriver.exe");


	WebDriver driver = new FirefoxDriver();
	
	  driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
//2
	//driver.quit();
 // System.out.println(driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getText());
	
//1
	//WebElement WebEle = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	//String text = WebEle.getText(); 
//	System.out.println("Fb text is "+text);
	//2 by contains
	WebElement WebEle = driver.findElement(By.xpath("//h2[contains(text(),'Facebook ')]"));
	String text = WebEle.getText(); 
    System.out.println("Fb text is "+text);
	
    
    //driver.findElement(By.xpath()))
	
	//Thread.sleep(5000);
	

	


}

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}
}
