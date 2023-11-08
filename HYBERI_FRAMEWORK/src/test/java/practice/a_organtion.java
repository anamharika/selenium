package practice;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import generic_utility.excelfileutility;
import generic_utility.javautility;
import generic_utility.propertyutility;
import generic_utility.webdriveutility;
import groovyjarjarantlr4.v4.parse.ANTLRParser.element_return;
import objectrepos.loginpage;

public class a_organtion {

	@Test
	public void org() throws Throwable {
		 
propertyutility putil = new propertyutility();
excelfileutility eutil = new excelfileutility();
javautility jutil = new javautility();
int r = jutil.getrandomnumber();
webdriveutility wutil = new webdriveutility();
WebDriver driver = null;
 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
String URL = putil.readdatafrompropertyfile("url");
String n = putil.readdatafrompropertyfile("un");
String pass = putil.readdatafrompropertyfile("pwd");		
String B = putil.readdatafrompropertyfile("browser");
if(B.equalsIgnoreCase("firefox")) {
	driver=new FirefoxDriver();
	System.out.println(B+"launched");
}
else if (B.equalsIgnoreCase("chrome")) {
	driver = new ChromeDriver();
}
else if (B.equalsIgnoreCase("edge")) {
	driver = new EdgeDriver();
	
}
else {
	System.out.println(" invalied user name ");
}
driver.get(URL);
loginpage l = new loginpage(driver);
l.logintoapp(n, pass);

//driver.findElement(By.name("user_name")).sendKeys(n,Keys.TAB,pass,Keys.ENTER);
Thread.sleep(3000);
driver.findElement(By.xpath("//a[.='Organizations']")).click();
driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
// fetching the excel
String org = eutil.readdatafromexcel("sheet1", 0, 0);

  
  driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(org+r);
  driver.findElement(By.xpath("(//*[@title=\"Save [Alt+S]\"])[1]")).click();
Thread.sleep(3000);
/*  driver.findElement(By.xpath("//a[.='Contacts']")).click();
	// add symbol on contact 
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	// name to contact 
	String org1 = eutil.readdatafromexcel("sheet1", 0, 1);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(org1+r);

	//save
	 driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click(); */

webdriveutility web = new webdriveutility();

  
	}
	
}
