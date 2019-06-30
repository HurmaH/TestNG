package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class demo4 {
	
	@Test(groups= {"smokeTest"})
	public void WebLoginHomeLoan() {
		//selenium
		System.out.println("WebLogin home");		
	}
	@AfterTest
	public void postrequisite2() {
		System.out.println("@AfterTest will run last in Login Home Loan test only");
	}
	
	@Test
	public void MobileLoginHomeLoan() {
		//Appium
		System.out.println("MobileLogin home");		
	}
	
	@Test(groups= {"smokeTest"})
	public void LoginAPIHomeLoan() {
		//Rest API automation
		System.out.println("APILogin home");		
	}

}
