package day38;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DefaultAutomatedmessageonScreen {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.opencart.com/");

		String act_title = driver.getTitle();
		System.out.println(act_title);

		if (act_title.endsWith("Your Store")){
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
	}
}
