package day28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://demo.nopcommerce.com/register");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
	}

}
