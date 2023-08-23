package webelementshandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediobutton {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	//how many rediobutton in gender //
	List<WebElement> radio = driver.findElements(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']"));
     System.out.println(" the radio button count " +radio.size());
		
	// how to use rediobutton by using xpath //
	WebElement gender = driver.findElement(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])[2]"));
	gender.click();
	
	
	}

}
