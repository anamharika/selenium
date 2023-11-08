package objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organizationpage {
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement orglookupimg;
	public organizationpage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public WebElement getOrglookupimg() {
		return orglookupimg;
	}
	public void lookupimag(WebDriver driver) {
		orglookupimg.click();
	}

}
