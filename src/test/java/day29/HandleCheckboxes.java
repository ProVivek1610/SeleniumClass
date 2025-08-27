package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		// Selecting specific checkbox

		// driver.findElement(By.xpath("//input[@id='sunday']")).click();

		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		/*
		 * //1. Selecting multiple checkbox at a time 
		 * for(int i = 0; i <checkboxes.size(); i++) {
		 *  checkboxes.get(i).click(); 
		 *  }
		 * 
		 * //2. Second Approach
		 * 
		 * for(WebElement checkbox:checkboxes) { checkbox.click(); }
		 * 
		 * for(int i = 3; i <= checkboxes.size(); i++) { 
		 * checkboxes.get(i).click();
		 *  }
		 */
		// Deselect selected checkboxes
		for (int i = 0; i < 3; i++) {
			checkboxes.get(i).click();
		}

		Thread.sleep(5000);

		for (int i = 0; i < 3; i++) {
			if (checkboxes.get(i).isSelected())
				checkboxes.get(i).click();
		}

	}

}
