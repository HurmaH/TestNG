package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class demo3 {
	
	@Test
	public void WebLoginLoan() {
		//selenium
		System.out.println("WebLogin");		
	}
	
	@Test
	public void MobileLoginLoan() {
		//Appium
		System.out.println("Mobile Login");		
	}
	
	@Test
	public void LoginAPILoan() {
		//Rest API automation
		System.out.println("APILogin");		
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite first off all in Suite");
	}

}
