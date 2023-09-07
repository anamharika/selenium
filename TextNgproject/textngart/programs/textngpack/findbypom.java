package textngpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findbypom {
@Test
public void tc(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
@FindBy (xpath = "//*[@name='email']") private WebElement usertextbox;
 @FindBy (xpath = "//*[@id='pass']") private WebElement passtextbox;
 @FindBy (xpath = "//*[@name='login']") private WebElement loginbotton;
 public findbypom(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
}
