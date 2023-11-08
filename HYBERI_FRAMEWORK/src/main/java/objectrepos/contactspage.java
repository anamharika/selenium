package objectrepos;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactspage {
	@FindBy(xpath = "//*[@src='themes/softed/images/btnL3Add.gif']")private WebElement contlookupimg;
	public contactspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getContlookupimg() {
		return contlookupimg;
	}
	public void clookupimg(WebDriver driver) {
		contlookupimg.click();
	}

}
