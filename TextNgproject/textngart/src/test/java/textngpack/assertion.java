package textngpack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class assertion {
	@Test
	public void t1() {
		int a=10;
		int b=20;
		
		Assert.assertEquals(a, b);
		Reporter.log("im t1",true);
	}
	@Test
	public void t2() {
		Reporter.log("im t2",true);
	}
	

}
