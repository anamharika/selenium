package data_driven_framework;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;






public class test {

	public static void main(String[] args) throws Throwable {
		// create object of fis  class
		
		FileInputStream fis = new FileInputStream(testinterface.callthedata);
		// creat object of properties
		Properties pro = new Properties();
	pro.load(fis);
		String n =pro.getProperty("un");
		System.out.println(n);
		String p=pro.getProperty("pwd");
		
      System.out.println(p);
      String b=pro.getProperty("browser");
      System.out.println(b);
      String u=pro.getProperty("url");
      System.out.println(u);
      System.setProperty("webdriver.edge.driver","C:\\Users\\nikithanikki\\Downloads\\edgedriver_win32 (1)\\msedgedriver.exe");
      WebDriver driver=new EdgeDriver();
      driver.get(u);
     
      
      
	}
	

}
