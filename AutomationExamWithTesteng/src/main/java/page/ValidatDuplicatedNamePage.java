package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidatDuplicatedNamePage {
	WebDriver driver;
	public ValidatDuplicatedNamePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	@FindBy(how = How.XPATH,using = "//input[@name='categorydata']")WebElement ADD_CATAGORY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH,using = "//input[@value='Add category']")WebElement CLICK_CATAGORY_LOCATOR;
	
	public void enterCatagoryName(String name) {
		ADD_CATAGORY_FIELD_LOCATOR.sendKeys(name);
	}
	
	public void clickOnCatagoryField() {
		CLICK_CATAGORY_LOCATOR.click();
	}


}
