package practice;

import org.testng.annotations.Test;

import objectrepos.base;
import objectrepos.homepage;
import objectrepos.neworganizationpage;
import objectrepos.organizationpage;

public class testclass extends base {
	@Test
	public void tc4() throws Throwable {
		
		homepage h=new homepage(driver);
		Thread.sleep(3000);
		h.org();
		organizationpage o=new  organizationpage(driver);
		o.lookupimag(driver);
		neworganizationpage no=new neworganizationpage(driver);
		
		String exptorg = e.readdatafromexcel("sheet1", 0,0);
		no.getorgnameexpected(exptorg+j.getrandomnumber());
		no.getSavebtn();
		Thread.sleep(3000);
		
	}


}
