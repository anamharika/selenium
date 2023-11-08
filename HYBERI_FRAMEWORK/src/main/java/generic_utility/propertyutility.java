package generic_utility;

import java.io.FileInputStream;

import java.util.Properties;

public class propertyutility {
	public String readdatafrompropertyfile(String key) throws Throwable {
		FileInputStream fis = new FileInputStream(iconstantutility.propertypath);
		Properties p = new Properties();
		p.load(fis);
String	value	= p.getProperty(key);
		 return value;
	}

}
