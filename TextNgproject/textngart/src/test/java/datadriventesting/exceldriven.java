package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class exceldriven {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("D:\\for_ selenium\\TextNgproject\\textngart\\assert.ng\\excel.xlsx.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
	String	data =	wb.getSheet("sheet1").getRow(3).getCell(0).getStringCellValue();
	System.out.println(data);
	
	
	}

}
