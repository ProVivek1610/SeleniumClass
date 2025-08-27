package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();

		// Drag and Drop1
		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement itly = driver.findElement(By.xpath("//div[@id='box106']"));

		Actions act = new Actions(driver);
		act.dragAndDrop(rome, itly).perform();

		Thread.sleep(3000);

		// Drag and Drop2
		WebElement norway = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement oslo = driver.findElement(By.xpath("//div[@id='box101']"));

		act.dragAndDrop(norway, oslo).perform();

		Thread.sleep(3000);

		// Drag and Drop3
		WebElement washington = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement us = driver.findElement(By.xpath("//div[@id='box103']"));

		act.dragAndDrop(washington, us).perform();

		Thread.sleep(3000);
		 
		// Drag and Drop4
		WebElement seoul = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement southkorea = driver.findElement(By.xpath("//div[@id='box105']"));

		act.dragAndDrop(seoul, southkorea).perform();

		Thread.sleep(3000);

		// Drag and Drop5
		WebElement cope = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement denmark = driver.findElement(By.xpath("//div[@id='box104']"));

		act.dragAndDrop(cope, denmark).perform();

		Thread.sleep(3000);

		// Drag and Drop6
		WebElement stockholmes = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement sweden = driver.findElement(By.xpath("//div[@id='box102']"));

		act.dragAndDrop(stockholmes, sweden).perform();

		Thread.sleep(3000); 
		
		// Drag and Drop7
		WebElement madrid = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));

		act.dragAndDrop(madrid, spain).perform();

	}

}
