package SeleniumClass.SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
		
		//is Displayed
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//WebElement logo=driver.findElement(By.xpath("//h1[text()='Register']"));
		//System.out.println("Register logo is there ="+logo.isDisplayed());
		
		//is enabled
		//boolean status = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		//System.out.println("Search box is Enable : "+status);
		
		//boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		//System.out.println("First Name box is enable : "+status);
		
		//boolean status = driver.findElement(By.xpath("//input[@id='LastName']")).isEnabled();
		//System.out.println("Last Name box is enable : "+status);
		
		//boolean status = driver.findElement(By.xpath("//input[@id='Email']")).isEnabled();
		//System.out.println("Email box is enable : "+status);
		
		//is Selected
		WebElement male_rb = driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println("Before Selecting male.....");
		System.out.println("Male Button is selected : "+male_rb.isSelected());
		
		Thread.sleep(5000);
		
		male_rb.click();
		System.out.println("After Male Button is selected : ");
		System.out.println("Male Button is selected : "+male_rb.isSelected());
		
		WebElement female_rb = driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("Before Selecting male.....");
		System.out.println("Female Button is selected : "+female_rb.isSelected());
		
		Thread.sleep(3000);
		
		female_rb.click();
		System.out.println("After Female Button is selected : ");
		System.out.println("Female Button is selected : "+female_rb.isSelected());
		
		
	}
}
