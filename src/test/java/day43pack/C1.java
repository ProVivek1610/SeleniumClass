package day43pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C1 {

	@Test
	void xyz() {
		System.out.println("This is xyz from c2");
	}
	
	@AfterTest
	void at() {
		System.out.println("This is after test method");
	}
	
	
	
	
	
	
	
	
	
}
