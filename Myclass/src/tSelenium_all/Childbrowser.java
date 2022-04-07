package tSelenium_all;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");

	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://skpatro.github.io/demo/links/"); //1
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.name("NewTab")).click();  //2
	
	
	Set<String> allwindowids = driver.getWindowHandles();
//	System.out.println("All ids are "+allwindowids);
	//remote
	Iterator<String> it = allwindowids.iterator(); // pointing to -1
	String main = it.next(); // pointing to 0th location
	String child1 = it.next(); // pointing to 1st location
	Thread.sleep(1000);
	
	driver.switchTo().window(child1);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@title=\"Contact me\"])[2]")).click();  //3rd window
	Thread.sleep(2000);

	
	
	Set<String> Finalallwindowids = driver.getWindowHandles();
	System.out.println("All ids are "+Finalallwindowids);
	//remote 2
	Iterator<String> it1 = Finalallwindowids.iterator();
	 it1.next();// main=child2
	 it1.next();// chil3=child1
	String child2 = it1.next();// sub clild
	Thread.sleep(2000);
	
driver.switchTo().window(child2); //3rd window
	Thread.sleep(8000);
	driver.findElement(By.id("the7-search")).sendKeys("Bhau");
	Thread.sleep(2000);
	driver.close();
	
	driver.switchTo().window(child1);
	Thread.sleep(2000);
	driver.close();
	driver.switchTo().window(main);
	Thread.sleep(2000);
	driver.close();
	
	//driver.switchTo().window(child2);  //1st window

}
}
