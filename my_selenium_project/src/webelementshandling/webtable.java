package webelementshandling;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.get("https://demo.seleniumeasy.com/table-pagination-demo.html");
driver.manage().window().maximize();
WebElement table = driver.findElement(By.xpath("//*[@class='table table-hover']"));

// how many rows count  in the table 

List<WebElement> rows = table.findElements(By.tagName("tr"));

System.out.println(" the total rows in table = " +rows.size());

// how many heads count in table table
List<WebElement> head = table.findElements(By.tagName("th"));
System.out.println(" the total head in table = " +head.size());
// how to get text in text 

for (int i = 0 ; i<head.size();i++) {
	System.out.println(" the total text of head = " +head.get(i).getText());
}

// how many coulum in table 

List<WebElement> column = table.findElements(By.tagName("td"));

System.out.println(" the total colum in colum = " +column.size());

// how many colum countain in row 

List<WebElement> rowscolum = rows.get(1).findElements(By.tagName("td"));
System.out.println(" the rows in cloum = " + rowscolum.size());

//text 

for (int i =0 ;i<rowscolum.size();i++) {
	System.out.println(" text of 1st rows = " +rowscolum.get(i).getText());
}



	}

}
