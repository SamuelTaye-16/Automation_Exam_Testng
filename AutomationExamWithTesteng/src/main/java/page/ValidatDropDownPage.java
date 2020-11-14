package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidatDropDownPage {
	
WebDriver driver;
	
	public ValidatDropDownPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	@FindBy(how = How.XPATH, using = "//select[@name='due_month']")WebElement DROPDOWN_FIELD_LOCATOR;
	
	
	public void clickDropDown() {
		DROPDOWN_FIELD_LOCATOR.click();
	}
	
	

}
