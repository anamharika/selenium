package objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_utility.webdriveutility;

public class newcontactspage extends webdriveutility {
	@FindBy(xpath = "//*[@name='lastname']")private WebElement conctnametext;
@FindBy(xpath = "(//*[@title='Save [Alt+S]'])[1]")private WebElement savebtn;
public newcontactspage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getConctnametext() {
	return conctnametext;
}
public WebElement getSavebtn() {
	return savebtn;
}
public void getcontactsnameexpected(String contname) {
	conctnametext.sendKeys(contname);
	savebtn.click();
}
}
