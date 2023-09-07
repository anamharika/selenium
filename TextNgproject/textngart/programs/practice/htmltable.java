package practice;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class htmltable {
	@Test
public void tc1() throws Throwable {
		

	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		FileInputStream fis = new FileInputStream("D:\\for_ selenium\\TextNgproject\\textngart\\assert.ng\\html.xlsx.xlsx");
		 Workbook wb =WorkbookFactory.create(fis);
		
//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

}
}

