package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class exceldriven {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\for_ selenium\\TextNgproject\\textngart\\assert.ng\\drive.xlsx.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		  double data = wb.getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
	System.out.println(data);
		
	}

}
