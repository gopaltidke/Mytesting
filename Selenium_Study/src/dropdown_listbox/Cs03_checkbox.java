package dropdown_listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cs03_checkbox{

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
				
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://demo.guru99.com/test/radio.html");
				driver.manage().window().maximize();
				Thread.sleep(200);
				
		//1-one-only-select		// WebElement checkbox = driver.findElement(By.xpath("//div//input[@type='checkbox']"));
				//checkbox.click();
		
		//2--multi-select	
				List<WebElement> totalCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
					System.out.println("total checkboxes "+totalCheckbox.size());
						
					for(WebElement w:totalCheckbox)
					{
				         w.click();
				         Thread.sleep(2000);
					}
					for(WebElement w:totalCheckbox)
					{
						w.click();
						Thread.sleep(2000);
					}
					driver.close();

				 
//				 
//		boolean result =checkbox.isSelected();
//		
//		if (result) {
//			System.out.println("it is selected ");
//			
//		}
//		else {
//			System.out.println("not select");
//		}
//		
		
	}
}
