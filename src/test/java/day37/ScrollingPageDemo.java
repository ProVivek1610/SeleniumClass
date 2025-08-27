package day37;

import java.time.Duration;
import java.util.stream.Gatherer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPageDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//1. Scoll the page by Pixel Number.
		//js.executeScript("window.scrollBy(0,800)", "");
		//System.out.println(js.executeScript("return window.pageYOffSet"));
		
		//2. Scroll the page till element is displayed.
		//WebElement ele = driver.findElement(By.xpath(" //strong[normalize-space()='Company Details']"));
		//js.executeAsyncScript("arguments[0].scrollIntoView()", ele);
		//System.out.println(js.executeScript("return window.pageYOffSet"));
		
		//3. Scroll the page to the End
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset"));
		
		Thread.sleep(5000);
		
		//4. Scroll the page to the Initial Point.
		//js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		//System.out.println(js.executeScript("return window.pageYOffset"));
	}
}
