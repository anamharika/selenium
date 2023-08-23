package webelementshandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class mousedraganddrop {
	
	public static void main(String[] args) throws Exception {
		
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/droppable/");
	
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	Actions act = new Actions(driver);
	act.clickAndHold(drag).perform();
	
	Thread.sleep(5000);
	act.dragAndDrop(drag, drop).perform();
	
	
	
	

}
}