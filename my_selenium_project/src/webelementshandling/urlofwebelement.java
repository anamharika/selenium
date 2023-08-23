package webelementshandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class urlofwebelement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> tag = driver.findElements(By.tagName("a"));
		
		for(int i =0;i<tag.size();i++) {
		System.out.println(tag.get(i).getText()+"   :  "  +tag.get(i).getAttribute("href"));	
		}
		
		
	}

}
