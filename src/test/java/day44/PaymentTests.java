package day44;

import org.testng.annotations.Test;

public class PaymentTests {

	@Test(priority=1 , groups = {"sanity , regression"})
	 void paymentinRupees() {
		 System.out.println("payment in Rupees.....");
	 }
	 
	 @Test(priority=2 , groups = {"sanity , regression"})
	 void paymentinDollars() {
		 System.out.println("payment in Dollars....");
	 }
}
