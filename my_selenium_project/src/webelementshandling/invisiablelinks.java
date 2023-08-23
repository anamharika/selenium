package webelementshandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class invisiablelinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.AJIO.com/");
		
	List<WebElement> link = driver.findElements(By.tagName("a"));
	int tlinks = link.size();
	System.out.println("the total links in pages = " +tlinks);
	
  for(int i=0;i<tlinks;i++) {
	  System.out.println(" the total textlinks =" +link.get(i).getText());
	  
  }

int count=0;
for(int i =0;i<tlinks;i++) {
	if(link.get(i).isDisplayed()) {
	count++;
	
}
  

	}
int vislin = count;
System.out.println(vislin);

int nvislin =tlinks-vislin;
System.out.println(nvislin);



}

}