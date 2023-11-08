package data_driven_framework;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vitger_notpad {

	public static void main(String[] args) throws InterruptedException {
		
	Random ran=new Random();
		int r = ran.nextInt(100);
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("http://localhost:8888/");
		//enter valid UN and PWd
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		//click on Login btn
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		//clcik on organization module
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		//clcik on organization look up image
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		//fill the organization name
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("TCS"+r);
		//click on save btn
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
	
	
		//logout from applications
		Thread.sleep(5000);
		WebElement target = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(5000);
		//clcik on sign out btn
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		
		
	}

}
