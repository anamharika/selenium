package webelementshandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/automation-practice-form");
 // to handle the text field we can use sendkey r clear

WebElement fn = driver.findElement(By.id("firstName"));
fn.sendKeys("Harika");
WebElement ln = driver.findElement(By.id("lastName"));
ln.sendKeys("anam");
WebElement email = driver.findElement(By.id("userEmail"));
email.sendKeys("anamharika2662@gmail.com");
WebElement num = driver.findElement(By.id("userNumber"));
num.sendKeys("8790302662");
WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
dob.sendKeys("25/10/1996");
WebElement add = driver.findElement(By.id("currentAddress"));
add.sendKeys("mainkonda road");



	}

}
