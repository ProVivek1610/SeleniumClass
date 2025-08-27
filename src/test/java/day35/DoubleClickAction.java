package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();

		// Switching to the frame
		driver.switchTo().frame("iframeResult");

		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		box1.clear(); // clear box1
		box1.sendKeys("Welcome");
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));

		// Double click Action on the button
		Actions act = new Actions(driver);
		act.doubleClick(button).build().perform();

		// Validation box2 should contains "Welcome"
		
		if (box2.getAttribute("value").equals("Welcome")) { // using get Attribute() method to get value.
			System.out.println("Text copied");
		} else {
			System.out.println("not copied");
		}
	}

}