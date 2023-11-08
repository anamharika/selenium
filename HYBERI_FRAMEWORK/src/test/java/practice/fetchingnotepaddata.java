package practice;

import generic_utility.propertyutility;

public class fetchingnotepaddata {

	public static void main(String[] args) throws Throwable {
		propertyutility putil = new propertyutility();
	String data =  putil.readdatafrompropertyfile("un");
	System.out.println(data);
	}

}
