package objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_utility.webdriveutility;

public class homepage extends webdriveutility {
	@FindBy(xpath = "(//a[.='Organizations'])[1]") private WebElement orgclick;
	@FindBy(xpath = "//a[.='Contacts']") private WebElement conclick;
	@FindBy(xpath = "//a[.='Opportunities']") private WebElement oppclick;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']") private WebElement admclick;
	@FindBy(xpath = "//a[.='Sign Out']") private WebElement sinoutclick;
	
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrgclick() {
		return orgclick;
	}

	public WebElement getConclick() {
		return conclick;
	}

	public WebElement getOppclick() {
		return oppclick;
	}

	public WebElement getAdmclick() {
		return admclick;
	}

	public WebElement getSinoutclick() {
		return sinoutclick;
	}
	public void org() {
		orgclick.click();
	}
	public void cont() {
		
		conclick.click();
	}
	public void opp() {
		oppclick.click();
	}
		public void logoutapp(WebDriver driver, WebElement element) {
			mouseoveraction(driver, admclick);
			sinoutclick.click();
		}
	}


