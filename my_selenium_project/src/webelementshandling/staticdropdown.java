package webelementshandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class staticdropdown {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		WebElement dp = driver.findElement(By.tagName("select"));
		
		Select sel = new Select(dp);
		// count of the elenments
		List<WebElement> option = sel.getOptions();
		System.out.println(" the totl list in webelenment = " +option.size());
		// test of the total elm 
		for ( int i=0;i<option.size();i++) {
			System.out.println("the total test of the elenment =" +option.get(i).getText());
		}
		//select byvisibletext
		
		System.out.println("----------------------------------");
		Thread.sleep(3000);
		
		sel.selectByVisibleText("Aruba");
		
		Thread.sleep(3000);
		System.out.println("------------------");
		sel.selectByIndex(14);
		System.out.println("-------------------------");
	
		
sel.selectByValue("ASM");
	}

}
