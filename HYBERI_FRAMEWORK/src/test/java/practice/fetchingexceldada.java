package practice;

import generic_utility.excelfileutility;


public class fetchingexceldada {
	public static void main(String[] args) throws Throwable {
		excelfileutility eutil = new excelfileutility();
	 String data= eutil.readdatafromexcel("sheet1",0,0);
	 System.out.println(data);
	 
	}

}
