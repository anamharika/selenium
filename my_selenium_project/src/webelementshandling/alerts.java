package webelementshandling;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@onclick='alertbox()']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//*[@class='analystic'])[2]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@onclick='confirmbox()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//*[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//*[@onclick='promptbox()']")).click();
		driver.switchTo().alert().sendKeys("harika");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		
		
		
		

	}

}
