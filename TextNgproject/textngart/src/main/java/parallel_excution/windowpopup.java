package parallel_excution;


import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowpopup {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.foundit.in/");
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	
	driver.findElement(By.className("addPrimaryTextColor")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("googleSignIn")).click();
	
	Thread.sleep(5000);
	
	// how many windows open in the page 
	Set<String> allwindows = driver.getWindowHandles();
	System.out.println(" the windows open in page is = " +allwindows.size());
	System.out.println(allwindows);
	
	for (String child : allwindows) {
		
		if (!allwindows.equals(parent))
			
		driver.switchTo().window(child);
		{
			
		}
		
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("harika");
	Thread.sleep(3000);
		
	TakesScreenshot tk = (TakesScreenshot) driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File dst = new File("D:\\for_ selenium\\my_selenium_project\\Screenshot\\foundit.png");
	Files.copy(src, dst);	
	}

}
