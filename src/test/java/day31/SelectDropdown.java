package day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement drpCountry=driver.findElement(By.xpath("//select[@id='country']"));
 		Select dropdown = new Select(drpCountry);
		
		//dropdown.selectByVisibleText("India");
		//dropdown.selectByValue("japan");
		//dropdown.selectByIndex(2);
		List<WebElement>option = dropdown.getOptions();
		System.out.println(option.size()); 
		
		//printing the options
		/*for(int i = 0; i < option.size(); i++) {
			System.out.println(option.get(i).getText());
		}
		
		//enhanced for loop
		for(WebElement op: option) {
			System.out.println(op.getText());
		}*/
		
		
	}
}
