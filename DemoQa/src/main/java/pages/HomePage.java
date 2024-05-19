package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {


public ElementsPage clickElements () {
	ElementsPage result = new ElementsPage();
	driver.findElement(By.xpath("//h5[text()='Elements']")).click();
	return result;
	
	
}
	
}

