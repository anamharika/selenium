package textngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testcases {
@Test(priority = 3)
	public void testc1() {
System.out.println("am harika");		

	}
@Test(priority = 2 )
public void testc2() {
	System.out.println(" am 2");
}

@Test( priority = 4,enabled =   false)
public void test3() {
	System.out.println(" am 3 ");
}
@Test( priority = 1 ,invocationCount =   10)
public void demo() {
	Reporter.log("Hi good evening",true);
}
@Test(priority = 5)
public void testc4() {
Reporter.log("this is assert tc " , true);

}
}
