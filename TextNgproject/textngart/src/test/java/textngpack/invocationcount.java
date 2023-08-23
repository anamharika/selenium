package textngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationcount {
	@Test(invocationCount = 10)
	public void demo() {
		Reporter.log("Hi good evening",true);
	}

}
 