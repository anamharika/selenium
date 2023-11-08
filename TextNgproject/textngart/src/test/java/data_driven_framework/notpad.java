package data_driven_framework;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class notpad {

	public static void main(String[] args) throws Throwable {
		// create object of fis class
		FileInputStream fis = new FileInputStream("D:\\for_ selenium\\TextNgproject\\textngart\\assert.ng\\not.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		String b = pro.getProperty("browser");
		System.out.println(b);
		String u = pro.getProperty("url");
		System.out.println(u);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	String	data = pro.getProperty("name");
	System.out.println(data);
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
 String data1=pro.getProperty("pwd");
 System.out.println(data1);
 driver.findElement(By.id("submitButton")).click();
	}

}

