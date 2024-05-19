package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;

public class TextBoxTest  {
@Test
public void submitSuccessfully() {
	String fullName = "Hà"; 
	String email = "ha@gmail.com";
	String currentAddress = "HaNOi";
	String permanentAddress = "Vietnam";
	String projectPath= System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectPath +"\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/");
	driver.manage().window().maximize();
	HomePage homePage = new HomePage(driver);
 	homePage.scrollToEndPage();
	ElementsPage elementsPage= homePage.clickElements();
	TextBoxPage textBoxPage = elementsPage.clickTextBoxMenu();
	//Click on Element menu - redirect to TextBoxpage
	textBoxPage.submitData( fullName,  email,  currentAddress,  permanentAddress);
	
	
	
}
}
