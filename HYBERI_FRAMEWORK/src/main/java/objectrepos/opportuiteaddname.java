package objectrepos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class opportuiteaddname {
@FindBy(xpath = "(//*[@class='detailedViewTextBox'])[1]") private WebElement oppname;
@FindBy(xpath = "//img[@title='Select']")private WebElement opp2img;
@FindBy(xpath = "//*[@class='txtBox']")private WebElement searchbtn;

@FindBy(xpath = "(//*[@title='Save [Alt+S]'])[1]") private WebElement oppsavebtn;

public opportuiteaddname(WebDriver driver) {
	PageFactory.initElements(driver, this);
}


public WebElement getOppname() {
	return oppname;
}


public WebElement getOpp2img() {
	return opp2img;
}


public WebElement getSearchbtn() {
	return searchbtn;
}


public WebElement getOppsavebtn() {
	return oppsavebtn;
}


public void oppnameexpected(String oppnamet) {
	oppname.sendKeys(oppnamet);
	getOppsavebtn().click();
}
public void imgopp2(WebDriver driver) {
	opp2img.click();
	
}
}
