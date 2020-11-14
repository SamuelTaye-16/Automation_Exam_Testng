package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.ValidatDisplayPage;
import util.BrowserFactory;

public class ValidatDisplayTest {
	
	WebDriver driver;
	
	@Test
	public void UserShouldBeAbleToDisplay() {
		
		driver =BrowserFactory.init();
		
		ValidatDisplayPage vdp = PageFactory.initElements(driver, ValidatDisplayPage.class);
		vdp.enterCatagoryName("Samuel");
		vdp.clickOnCatagoryField();

	}
	
	
}
