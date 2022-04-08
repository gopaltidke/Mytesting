package tSelenium_all;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle_nitin
{
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("NewTab")).click();
		
		Set<String> allwindowids = driver.getWindowHandles();
		System.out.println("All ids are "+allwindowids);
		
		Iterator<String> it = allwindowids.iterator(); // pointing to -1
		String mainpageid = it.next(); // pointing to 0th location
		String childpageid = it.next(); // pointing to 1st location
		
		Thread.sleep(1000);
		driver.switchTo().window(childpageid);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@title='Contact me'])[1]")).click();
		Thread.sleep(2000);
		Set<String> Finalallwindowids = driver.getWindowHandles();
		System.out.println("All ids are "+Finalallwindowids);
		
		Iterator<String> fi = Finalallwindowids.iterator();
		fi.next();
		fi.next();
		String childchildid = fi.next();
		driver.switchTo().window(childchildid);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Cancel']")).click();
		
	}
}
