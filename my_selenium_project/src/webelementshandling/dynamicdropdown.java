package webelementshandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("surya");

Thread.sleep(3000);

// how many dropdowns we got 
List<WebElement> option = driver.findElements(By.xpath("//div[@class='eIPGRd']"));
System.out.println(option.size());

System.out.println("---------------------------------------------------------------");
/* for ( int i=0;i<option.size();i++) {
	if(option.get(i).getText().contains("surya movie")) {
		option.get(i).click();
		break;
	}
} */ 

//get the all next of the webelenment

for(int i=0;i<option.size();i++) {
	System.out.println( "the text of all elenments " +option.get(i).getText());
}
	
driver.findElement(By.xpath("(//div[@class='pcTkSc'])[7]")).click(); 



 

	




	}

}
