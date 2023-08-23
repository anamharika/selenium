package webelementshandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementmethod {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement logo = driver.findElement(By.xpath("( //img)[1]"));
	// how to get attribute value 
	String atbvalue = logo.getAttribute("src");
	System.out.println("the attribute value = "+atbvalue);
	System.out.println("--------------------");
	// get tagname
	String tagname = logo.getTagName();
	System.out.println(" the tage name is = "+tagname);
	System.out.println("-------------------------------");

	
	List<WebElement> eles = driver.findElements(By.tagName("img"));
	System.out.println(" the size of tag name = "+eles.size());
	
	
	
	System.out.println("------------------------------------------");
	
	
	for(int i= 0;i<eles.size();i++) {
		 	System.out.println(eles.get(i).getSize());
		 	
	}
	}

}
