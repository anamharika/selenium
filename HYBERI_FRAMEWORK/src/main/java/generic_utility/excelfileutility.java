package generic_utility;

import java.io.FileInputStream;



import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelfileutility {
	public String readdatafromexcel(String sheetName,int rownum,int cellnum) throws Throwable, Throwable {
FileInputStream fis = new FileInputStream(iconstantutility.excelpath);
Workbook wb = WorkbookFactory.create(fis);
String data = wb.getSheet(sheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
return data;

		
	}

}
