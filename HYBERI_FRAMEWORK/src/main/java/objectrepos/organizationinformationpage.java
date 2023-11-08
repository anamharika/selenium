package objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organizationinformationpage {
	@FindBy(xpath = "//*[@class='dvHeaderText']")private WebElement orgheadertxt;
	public organizationinformationpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getOrgheadertxt() {
		return orgheadertxt;
	}
	public String getheadertxt() {
		return orgheadertxt.getText();
	}
}
