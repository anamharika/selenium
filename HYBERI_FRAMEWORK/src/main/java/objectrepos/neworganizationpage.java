package objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_utility.webdriveutility;

public class neworganizationpage extends webdriveutility{
		@FindBy(xpath = "(//*[@class='detailedViewTextBox'])[1]")private WebElement orgnametxt;
		@FindBy(xpath = "//select[@name='industry']")private WebElement industryld;
		@FindBy(xpath = "//input[@title='Save [Alt+S]']")private WebElement savebtn;
		public neworganizationpage(WebDriver driver) {
			PageFactory.initElements( driver,this);
		}
		public WebElement getOrgnametxt() {
			return orgnametxt;
		}
		public WebElement getIndustryld() {
			return industryld;
		}
		public WebElement getSavebtn() {
			return savebtn;
		}
		public void getorgnameexpected (String orgname) {
			orgnametxt.sendKeys(orgname);
			savebtn.click();
			
		}

}
