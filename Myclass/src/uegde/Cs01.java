package uegde;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Cs01 {
	public static void main(String[] args) {
		
	
System.setProperty("webdriver.egde.driver", "D:\\velocity\\today\\01\\edgedriver_win64\\msedgedriver.exe");

	
	WebDriver driver = new EdgeDriver();
	
	driver.get("https://skpatro.github.io/demo/links/"); //1
	driver.manage().window().maximize();
	

}
}