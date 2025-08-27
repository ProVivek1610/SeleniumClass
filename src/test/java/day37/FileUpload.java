package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
	/*	driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys("C:\\Users\\vivek\\OneDrive\\Documents\\text1.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']")).getText().equals("text1.txt")) {
			System.out.println("File Uploaded");
		}else {
			System.out.println("Upload Failed");
		}*/
		
		String file1 = "C:\\Users\\vivek\\OneDrive\\Documents\\text1.txt";
		String file2 = "C:\\Users\\vivek\\OneDrive\\Documents\\text2.txt";
		
		//Multiple file Uploaded
		driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int noOfFiles = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		System.out.println(noOfFiles);
		
		if(noOfFiles==2) {
			System.out.println("All Files are Uploaded");
		}else {
			System.out.println("Files are not Uploaded");
		}
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("text1.txt")&&
				driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("text2.txt")) {
			System.out.println("Files are Matching");
		}else {
			System.out.println("Files are not Matching");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
