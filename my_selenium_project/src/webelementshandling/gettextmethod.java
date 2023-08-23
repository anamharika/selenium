package webelementshandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextmethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		
		List<WebElement> elm = driver.findElements(By.xpath("//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK']"));
		System.out.println("the count of text is = "+elm.size());
		
	//	System.out.println(" the total text is = " +elm.get(0).getText()); //
		
		for(int i=0;i<elm.size();i++) {
			System.out.println("the text is = " +elm.get(i).getText());
		}
	}

}
