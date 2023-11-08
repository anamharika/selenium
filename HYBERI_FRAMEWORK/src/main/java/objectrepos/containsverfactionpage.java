package objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class containsverfactionpage {
	@FindBy(xpath = "//*[@class='dvHeaderText']")private WebElement contheadertxt;
public containsverfactionpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getContheadertxt() {
	return contheadertxt;
}
public String getheadtext() {
	return contheadertxt.getText();
	
}

}
