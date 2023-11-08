package objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import generic_utility.excelfileutility;
import generic_utility.javautility;
import generic_utility.propertyutility;
import generic_utility.webdriveutility;

public class base {
	public webdriveutility w=new webdriveutility();
	public propertyutility p=new propertyutility();
	public javautility j=new javautility();
	public excelfileutility e=new excelfileutility();
	public WebDriver driver=null;
	public WebElement admlink=null;
	
	@BeforeSuite
	public void tc1() {
		Reporter.log("connect to db",true);
	}
	@org.testng.annotations.BeforeClass
	public void tc2() throws Throwable {
		
		String b = p.readdatafrompropertyfile("browser");
		String u = p.readdatafrompropertyfile("url");
		
		 
		if(b.equalsIgnoreCase("firefox")) {
			
			driver=new FirefoxDriver();
			driver.get(u);
			
			
		}
		else if (b.equalsIgnoreCase("edgedriver")) {
			driver=new EdgeDriver();
			
			
		}
	}
	//@BeforeTest
		@BeforeMethod
		public void tc3() throws Throwable {
			loginpage l=new loginpage(driver);
			
			
			
			String n = p.readdatafrompropertyfile("un");
			String w = p.readdatafrompropertyfile("pwd");
			
			l.logintoapp(n, w);
			
			
		
	}
		/*@Test
		public void tc4(WebDriver driver) throws Throwable {
			java_utility j=new java_utility();
			homepage h=new homepage(driver);
			h.clickonorg();
			organizationpage o=new  organizationpage(driver);
			o.lookupimag(driver);
			neworganizationpage no=new neworganizationpage(driver);
			excelfileutility e=new excelfileutility();
			String exptorg = e.readdatafromexcel("sheet1", 0, 0);
			no.getorgnameexpected(exptorg+j.getrandomnumber());
			no.getSavebtn();
		}*/
		//@AfterTest
		@AfterMethod
		public void tc5( ) throws Throwable {
			
			homepage h=new homepage(driver);
			Thread.sleep(3000);
			h.logoutapp(driver, admlink);
			
		}
		@AfterClass
		public void tc6() throws InterruptedException {
			Thread.sleep(3000);
			
			driver.quit();
			
		}
		@AfterSuite
		public void tc7() {
			Reporter.log("close data base",true);
		}
		

}
