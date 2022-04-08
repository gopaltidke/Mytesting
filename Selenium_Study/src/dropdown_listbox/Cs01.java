package dropdown_listbox;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Cs01 {
	
	public static void main(String [] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\12\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		//System.out.println(driver.getTitle());
		
//		String title = driver.getTitle();
//		System.out.println("fb main page title is "+title);
		
//		System.out.println(driver.getCurrentUrl());
//		
//		String current_url = driver.getCurrentUrl();
//		System.out.println("fb main page url is "+current_url);
		
		
		Thread.sleep(1000);
		
		
		WebElement creatnewAcbutton = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		creatnewAcbutton.click();
		
		Thread.sleep(100);  
//		WebElement userid = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//          userid.sendKeys("Abc");
//		Thread.sleep(100);  
//
//		WebElement pass = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
//		Thread.sleep(100);  
//        pass.sendKeys("Abc");
//		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8888888888");
//		Thread.sleep(100);  

		
		////div//span//select[1]//option[11]
//		 WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
//         Select s= new Select(day);
// 		Thread.sleep(100);  
//		s.selectByVisibleText("01");
//
//		 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//        Select s1= new Select(month);
//		Thread.sleep(100);  
//        s1.selectByIndex(01);
//
//		
//		 WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
//          Select s2= new Select(year);
//  		Thread.sleep(100);  
//		s2.selectByVisibleText("2002");

  		
  		
//		s.selectByValue("11");
	//	s1.selectByVisibleText("jan");
		Thread.sleep(3000);
		
		//change position
//		Point p = new Point(300, 400);
//		driver.manage().window().setPosition(p);
		//change dimension
//		org.openqa.selenium.Dimension d = new org.openqa.selenium.Dimension(600, 800);
//		driver.manage().window().setSize(d);
		
//	 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	  
//		File destination = new File("D:\\velocity\\ScreenShot123.jpg");
//		FileHandler.copy(source, destination);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.close();
	}

}
