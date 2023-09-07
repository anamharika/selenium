package practice;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fatchtofb {
	@Test
public void tc1() throws Throwable {
		

	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		FileInputStream fis = new FileInputStream("D:\\for_ selenium\\TextNgproject\\textngart\\assert.ng\\excel.xlsx.xlsx");
		 Workbook wb =WorkbookFactory.create(fis);
		 
	String	fn = wb.getSheet("sheet1").getRow(7).getCell(2).getStringCellValue();
String ln = wb.getSheet("sheet1").getRow(11).getCell(5).getStringCellValue(); 
String mail = wb.getSheet("sheet1").getRow(7).getCell(7).getStringCellValue();
 String pwd = wb.getSheet("sheet1").getRow(8).getCell(7).getStringCellValue();
 
driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(fn);
driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(ln);
 driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys(mail);
 driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys(pwd);

}
}
