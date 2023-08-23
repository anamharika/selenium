package webelementshandling;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class frames {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("harika");
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\nikithanikki\\Desktop\\screenshot1\\frame.png");
		Files.copy(src, dst);

	}

}
