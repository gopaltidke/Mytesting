package qSele_webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Cs01 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //1 get method is used
		
		//1 get method is used
		//2 manage method used
		
		//3 navigate method
		//4..quit method is used to close all tabs openedcby selenium
		//5..close method is used to close current tabs opened by selenium
		//6getTitle
	   //7getCurrentUrl
		
	//	driver.manage().window().maximize();  //2 manage method used
		//driver.manage().window().maximize();
		
		Thread.sleep(1000);               //3 exception throw interruped enception 
		
		//driver.get("https://vctcpune.com/");
		
//		driver.navigate().back();     //4 navigate method
//		driver.navigate().forward();
//		driver.navigate().refresh();
	//	driver.navigate().to("https://vctcpune.com/")
		//driver.quit();  //5..quit method is used to close all tabs openedcby selenium
		
		//driver.close();//6..close method is used to close current tabs opened by selenium
		
		
		//getTitle
		//System.out.println(driver.getTitle());  you will not store
		//or
		//String Title = driver.getTitle();  you will store
		
		//System.out.println("get title is url cha title ha aahe"+Title);
		
		//getCurrentUrl
		System.out.println("current url is"+driver.getCurrentUrl());
		//or
		String currenturl = driver.getCurrentUrl();
	System.out.println("current url is"+currenturl);
	
	
	
	
	
	}

}
