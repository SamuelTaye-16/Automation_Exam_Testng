package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.ValidatDropDownPage;
import util.BrowserFactory;

public class ValidatDropDownTest {
	
	WebDriver driver;
	
	@Test
	public void UserShouldBeAbelToValidatDropDownField() {
		
		driver =BrowserFactory.init();
		
		ValidatDropDownPage DropDown = PageFactory.initElements(driver, ValidatDropDownPage.class);
		DropDown.clickDropDown();
	}
}
