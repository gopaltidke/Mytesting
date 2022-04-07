package tSele_tablehandling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cs02 {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Sarika");
		Thread.sleep(2000);
	  List<WebElement> option = driver.findElements(By.xpath("//ul[1]//li[@role='presentation']"));
		
		       System.out.println(option.size());		   	
		       for(WebElement w:option)
		       {
					String actualResult = w.getText();
					
					System.out.println(w.getText());
					String expectedResult="Sarika Kale"; 
					Thread.sleep(3000);
					if(actualResult.equals(expectedResult))
					{
						w.click();
						break;
					}
					}
				
				Thread.sleep(2000);
				driver.findElement(By.linkText("Images")).click();
		       }
	}
