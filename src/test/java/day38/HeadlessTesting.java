package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");            //setting for headless mode of execution.

		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.opencart.com/");

		String act_title = driver.getTitle();
		System.out.println(act_title);

		if (act_title.endsWith("Your Store")){
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
		//driver.quit();
	}

}
