package textngpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class textngclass {
@Test
	public void tearup() {
		
System.out.println("test2");
	}
@BeforeSuite
public void bsuit() {
	System.out.println("beforesuit ");
		
}
@AfterClass
public void fcalss() {
	System.out.println("afterclass");
	
}
@AfterSuite
public void fsuit() {
	System.out.println("aftersuite");
	
}
@Test
public void exp() {
	System.out.println("test1");
}
@BeforeMethod
public void bmethod() {
	System.out.println("beforemethod");
}
@BeforeTest
public void btest() {
	System.out.println("beforetest");
	
}
@BeforeClass
public void bclass() {
	System.out.println("beforeclass");
}
@AfterTest
public void ftest() {
	System.out.println("aftertest");
}
@AfterMethod
public void fmethod() {
	System.out.println("aftermethod");
}
}
