package datadriventesting;

import java.io.FileInputStream;
import java.util.Properties;


public class notepad {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("D:\\for_ selenium\\TextNgproject\\textngart\\test-output\\not.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
	String	data = pro.getProperty("name");
	System.out.println(data);
 String data1=pro.getProperty("pwd");
 System.out.println(data1);
	}

}

