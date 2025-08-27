package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	/*	driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Full Page Screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshotr\\fullpage.png");
		 sourcefile.renameTo(targetfile);
		
		//ScreenShot of specific part
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement bestElectronics=driver.findElement(By.xpath("//div[@class='_1yQHx8 _2UnIQ_ _3ak8Rd _1kAmyc']"));
		
		File sourcefile = bestElectronics.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\bestelectronics.png");
		//File targetfile = new File(System.getProperty("D:\\Photos\\bestelectronics.png"));
		sourcefile.renameTo(targetfile);*/
		
		driver.get("https://www.flipkart.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@src='https://static-assets-web.flixcart.com/batman-returns/batman-returns/p/images/fkheaderlogo_exploreplus-44005d.svg']"));
		
		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		File targrtfile=new File(System.getProperty("user.dir")+"\\Screenshots\\logopic.png");
		sourcefile.renameTo(targrtfile);
		
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
