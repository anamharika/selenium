package data_driven_framework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceldriven {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\for_ selenium\\TextNgproject\\textngart\\assert.ng\\excel.xlsx.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		  String data = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		        double data1 = wb.getSheet("sheet1").getRow(0).getCell(1).getNumericCellValue();
		  
	System.out.println(data);
	System.out.println(data1);
		
	}

}
