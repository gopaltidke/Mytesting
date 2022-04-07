package tSele_tablehandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cs01 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@id='product']//th"));
	
		for(WebElement w:tableHeader)
		{
			System.out.print(w.getText()+" ||");
		}
	
		System.out.println();
		List<WebElement> tableRow = driver.findElements(By.xpath("(//table[@id='product']//tr)[2]"));
		for(WebElement w:tableRow)
		{
			System.out.print(w.getText()+" ||");
		}
	}

}


