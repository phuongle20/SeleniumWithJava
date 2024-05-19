package tests;

import org.testng.annotations.Test;
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Textbox {
	@Test
	public void submitSuccessfully() {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath +"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		
		

		
	}
	

}
