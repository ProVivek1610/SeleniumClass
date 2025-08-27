package SeleniumClass.SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Welcome {

	public static void main(String[] args) throws InterruptedException {
	
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
		
		//String str= driver.getWindowHandle();
		//System.out.println("str="+str);
		
		driver.findElement(By.xpath("(//div[@class='imageOverlay--eK9PK'])[1]")).click();
		Thread.sleep(5000);
		
		//driver.close();
		driver.quit();
	}

}
