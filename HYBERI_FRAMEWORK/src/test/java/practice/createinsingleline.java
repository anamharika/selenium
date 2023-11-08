package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic_utility.excelfileutility;
import generic_utility.javautility;
import generic_utility.propertyutility;
import generic_utility.webdriveutility;



public class createinsingleline {

	public static void main(String[] args) throws Throwable {
		
		
		propertyutility putil = new propertyutility();
		// fetching the property
		String URL = putil.readdatafrompropertyfile("url");
		String n = putil.readdatafrompropertyfile("un");
		String pass = putil.readdatafrompropertyfile("pwd");		
	   String B = putil.readdatafrompropertyfile("browser");
	// launch the browser
	    WebDriver driver = null;
	
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
	
	// launch url		
		driver.get(URL);
		// maximum
		webdriveutility wd = new webdriveutility();
				wd.maxmisewindow(driver);
				// minize
				wd.minizewindow(driver); 
		// login to app
		driver.findElement(By.name("user_name")).sendKeys(n,Keys.TAB,pass,Keys.ENTER);
		//random utility
		javautility j = new javautility();
	int r = j.getrandomnumber();
	excelfileutility eutil = new excelfileutility();
	Thread.sleep(3000);
	
	//organization
	driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	// fetching the excel
	String org = eutil.readdatafromexcel("sheet1", 0, 0);
	  
	  driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(org+r);
		
	}

}
