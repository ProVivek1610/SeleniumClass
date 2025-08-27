package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) { 

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href = 'http://www.orangehrm.com']")).click();

		Set<String> windowIDs = driver.getWindowHandles();

		// Approach 1

		/*
		 * List<String> windowlist = new ArrayList(windowIDs); 
		 * String ParentId = windowlist.get(0); 
		 * String ChildId = windowlist.get(1);
		 * 
		 * driver.switchTo().window(ChildId); 
		 * System.out.println(driver.getTitle());
		 * 
		 * driver.switchTo().window(ParentId); 
		 * System.out.println(driver.getTitle());
		 */

		// Approach 2

		for (String winId : windowIDs) {
			String title = driver.switchTo().window("winId").getTitle();

			if (title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
			}
		}
	}

}
