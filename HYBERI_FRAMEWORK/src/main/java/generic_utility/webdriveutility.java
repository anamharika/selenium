package generic_utility;


import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;
/**
 * this method is used for maxmized
 * this method is used for minimized
 * this method is used for waitforpageload
 * this method is used for handledropdown
 * 
 * @author anamharika
 * 
 *
 */

public class webdriveutility {
	public void maxmisewindow(WebDriver driver ) {
		driver.manage().window().maximize();
		
	}
	public void minizewindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	public void waitforpageload(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
public void handledropdown(WebElement element,int index ) {
	Select s = new Select(element);
	s.selectByIndex(index);																																	
	s.selectByVisibleText(null);
	
}
public void handledropdown(WebElement element, String value ) {
	Select s = new Select(element);
	s.selectByValue(null);
}
public void handledropdown( String visibletext,WebElement element) {
	Select s = new Select(element);
	s.selectByVisibleText(null);
}
public void mouseoveraction(WebDriver driver, WebElement element) {
	Actions act = new  Actions(driver);
	act.moveToElement(element).perform();
}
public void rightclick(WebDriver driver) {
	Actions act = new Actions(driver);
	act.contextClick().perform();
	
}
public void rightclick(WebDriver driver, WebElement element) {
	Actions act = new Actions(driver);
	act.contextClick(element).perform();
	
}
public void doubleclickapp(WebDriver driver) {
	Actions act = new Actions(driver);
	act.doubleClick().perform();
}
public void doubleclickapp(WebDriver driver, WebElement element) {
	Actions act = new Actions(driver);
	act.doubleClick(element).perform();
}
public void draganddrop(WebDriver driver, WebElement srcelement , WebElement destelement) {
	Actions act = new Actions(driver);
	act.dragAndDrop(srcelement, destelement);
	
}
public void switchtoframe(WebDriver driver, int index) {
	driver.switchTo().frame(index);
}
public void switchtoframe(WebDriver driver, String nameOrld) {
	driver.switchTo().frame(nameOrld);
	
}
public void switchtoparent(WebDriver driver) {
	driver.switchTo().parentFrame();
	 
}
public void switchtodefalut(WebDriver driver) {
	driver.switchTo().defaultContent();
}
public void acceptalertpopup(WebDriver driver) {
	driver.switchTo().alert().accept();
}
public void gettextpopup(WebDriver driver ) {
	driver.switchTo().alert().getText();
}
public void  takesscreenshot(WebDriver driver) throws Throwable {
	TakesScreenshot tk = (TakesScreenshot) driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File dst = new File("D:\\for_ selenium\\my_selenium_project\\Screenshot\\amazon1.png");
	Files.copy(src, dst);
}
public void scrollaction(WebDriver driver) {
	JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeAsyncScript("arguments[0].scrollIntoView();");
}










}
