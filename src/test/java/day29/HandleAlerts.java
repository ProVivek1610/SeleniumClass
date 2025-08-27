package day29;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// 1. Normal alert with OK button.

		/* driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		 * Thread.sleep(5000);
		 * 
		 * Alert myalert = driver.switchTo().alert();
		 * System.out.println(myalert.getText()); 
		 * myalert.accept();
		 * 
		 * //2. Confirmation alert : OK & CANCEL.
		 * driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		 * 
		 * Thread.sleep(5000); Alert myAlert = driver.switchTo().alert();
		 * System.out.println(myAlert.getText());
		 * myAlert.accept(); 
		 * myAlert.dismiss();
		 */

		// 3. Prompt Alert : Input Box
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(5000);
		
		Alert myAlert=driver.switchTo().alert();
		myAlert.sendKeys("WELCOME");
		myAlert.accept();
	}

}
