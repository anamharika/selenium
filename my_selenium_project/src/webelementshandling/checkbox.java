package webelementshandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		// how many check box in hobbies //
		List<WebElement> checkbox = driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']"));
		System.out.println(" the num of checkbox ="+checkbox.size());
		 // check sports
		driver.findElement(By.xpath("(//div[@class='custom-control custom-checkbox custom-control-inline'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='custom-control custom-checkbox custom-control-inline'])[2]")).click();
		
		
	}

}
