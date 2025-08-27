package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo1 {

	@BeforeMethod
	void login() {
		System.out.println("This is Login");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("this is logout");
	}

	@Test
	void search() {
		System.out.println("This is search");
	}
	
	@Test
	void AdvanceSearch() {
		System.out.println("This is AdvSearch");
	}
}
