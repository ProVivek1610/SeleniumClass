package day42;

import org.testng.annotations.Test;

/*
 * Open App
 * Login
 * Logout
 */
public class FirstTestCase {

	@Test (priority=1)
	void openapp() {
		System.out.println("Opening the Application.");
	}
	
	@Test(priority=2)
	void login() {
		System.out.println("Login to Application.");
	}
	
	@Test(priority=3)
	void logout() {
		System.out.println("Logout from Application.");
	}
	
	
	
}

