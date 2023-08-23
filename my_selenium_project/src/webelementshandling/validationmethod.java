package webelementshandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validationmethod {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/automation-practice-form/");
	 WebElement logo  = driver.findElement(By.tagName("img"));
	 boolean dis = logo.isDisplayed();
	 System.out.println(dis);
	 WebElement radio = driver.findElement(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])[1]"));
	
	 boolean select1 = radio.isSelected();
	 System.out.println(" the radio before select ="+select1);
	 radio.click();
	 System.out.println(" the radio after select = " +select1);
	 

	}

}
