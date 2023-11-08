package generic_utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class propertiesandexceldata {
	public String readdataproferty1(String url ) throws Throwable {
		FileInputStream f=new FileInputStream(".\\src\\main\\resources\\url.properties");
		
		Properties p=new Properties();
		p.load(f);
		String o = p.getProperty(url);
		return o;
	}
	public String readnotepad(String un,String pwd) throws Throwable {
		FileInputStream fr=new FileInputStream(".\\src\\main\\resources\\demo.properties");
		Properties r=new Properties();
		r.load(fr);
		String d = r.getProperty(un, pwd);
		return d;
		
	}
		public String readdadaexcel(String sheetname,int rownum,int cellnum) throws Throwable, Throwable {
	FileInputStream fo=new FileInputStream("");
		
		Workbook w=WorkbookFactory.create(fo);
		
		String t = w.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		
		return t;


}
}
