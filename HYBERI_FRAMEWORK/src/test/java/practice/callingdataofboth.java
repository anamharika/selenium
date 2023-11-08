package practice;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic_utility.propertiesandexceldata;
import io.github.bonigarcia.wdm.WebDriverManager;


public class callingdataofboth {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws Throwable {
		

	propertiesandexceldata   v = new propertiesandexceldata();
	
		String d = v.readdataproferty1("url");
		 // WebDriverManager.chromedriver().setup();
			WebDriver driver=new FirefoxDriver();
			 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.get(d);
			String i = v.readnotepad("un", "pwd");
			driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(i);
			driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(i);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
			driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
			
			String o = v.readdadaexcel("sheet1", 0, 0);
			Random r=new Random();
			int u = r.nextInt(100);
			driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(o+u);
			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			
			driver.findElement(By.xpath("(//a[.='Contacts'])[1]")).click();
			driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
			
	

	}
}
