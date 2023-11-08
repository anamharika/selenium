package objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class opportuiteverfactionpage {
	@FindBy(xpath = "//*[@class='dvHeaderText']")private WebElement oppheadertxt;
	public opportuiteverfactionpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getOppheadertxt() {
		return oppheadertxt;
	}
	public String getheadtext() {
		return oppheadertxt.getText();
		
	}
}
