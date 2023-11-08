package objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class opportuniteclicksymbole {
	@FindBy(xpath = "//*[@src='themes/softed/images/btnL3Add.gif']")private WebElement oppimg;
	public opportuniteclicksymbole(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getOppimg() {
		return oppimg;
	}
public void oppimgsymb(WebDriver driver) {
	oppimg.click();
}
}
