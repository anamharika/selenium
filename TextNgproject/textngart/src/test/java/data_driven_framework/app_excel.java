package data_driven_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Driver;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class app_excel {
	public static void main(String[] args) throws Throwable {
		  		FileInputStream fis=new FileInputStream(testinterface.callexcel);
		  		FileInputStream fis1 = new FileInputStream(testinterface.callnotpad);
		Workbook wb = WorkbookFactory.create(fis);
		Properties pro = new Properties();
		pro.load(fis1);
		
		  String data = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		  String data1 = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();     
	String data2 = wb.getSheet("sheet1").getRow(0).getCell(2).getStringCellValue();
	 // String data4 = wb.getSheet("sheet1").getRow(0).getCell(3).getStringCellValue();

	
	String u=pro.getProperty("url");
    System.out.println(u);
    WebDriverManager.edgedriver().setup();
     WebDriver driver=new EdgeDriver();
     driver.get(u);
    
     
    // name
     String n =pro.getProperty("un");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(n);
		// password
		String p = pro.getProperty("pwd");
		System.out.println(p);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(p);
		//click on Login btn
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		 
		// random 
		Random ran=new Random();
		int r = ran.nextInt(100);
	// click on organization 
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		//delete
	    // driver.findElement(By.xpath("//*[@id='8']")).click();
	    // driver.findElement(By.xpath("//*[@id='9']")).click();
	    // driver.findElement(By.xpath("//*[@class='crmbutton small delete']")).click();
	    // driver.switchTo().alert().accept(); 
		// click on add symbol in organization
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		
		
		//fill the organization name
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(data+r);
		System.out.println(data);
		// save
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(3000);
		
		
		
		
		// contact
		driver.findElement(By.xpath("//a[.='Contacts']")).click();
		// add symbol on contact 
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		// name to contact 
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(data1+r);
		System.out.println(data1);
		//save
		 driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		// opportunities
		driver.findElement(By.xpath("//a[.='Opportunities']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='potentialname']")).sendKeys(data2+r);
		System.out.println(data2);
		
		
		// save
		 driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		 driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		Thread.sleep(5000);
driver.findElement(By.xpath("((//*[@type='text'])[1]")).click();
		WebElement target1 = driver.findElement(By.xpath("(//*[@href='javascript:window.close();'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(target1).perform();
		Thread.sleep(5000);
		
		//logout
		WebElement target = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(target).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		
	
driver.findElement(By.xpath("//input[@type='button']")).click();
		//clcik on sign out btn
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
	}

}
