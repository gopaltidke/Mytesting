package tSelenium_all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cs02_linkdin {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\velocity\\today\\chromedriver_win32\\ChromeDriver.exe");

		   WebDriver driver =new ChromeDriver();
			
	       driver.get("https://in.linkedin.com/?trk=IN-SEM_google-adwords_Jordan-brand-sign-up&mcid=6844056167778418688&trk2=ga_campid=14650114791_asid=127961666580_crid=545833659343_kw=linkedin_d=c_tid=kwd-285981853_n=g_mt=p_geo=1007786_slid=&gclid=Cj0KCQiA3rKQBhCNARIsACUEW_bjtdUx4beA5K9fooaclMU1o5E7WDVQq7TNwzViLahyjrBaa074joQaAmNiEALw_wcB&gclsrc=aw.ds");		
	       driver.manage().window().maximize();
	       
	       Thread.sleep(2000);
	
		   driver.findElement(By.xpath("//input[@id='email-or-phone']")).sendKeys("gopal");

		   Thread.sleep(2000);	
		 //input[@name='password']
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gopal");
		   Thread.sleep(2000);	
		   driver.findElement(By.xpath("//button[@type='submit']")).click();

		   Thread.sleep(2000);	

		   
		   
	
	}

}
