package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class ParametersTrial {
	
	@Parameters({"URL"})
	@Test
	public void WebLoginLoan(String urlName) {
		//selenium
		System.out.println("WebLogin");	
		System.out.println(urlName);
	}
	
	@Parameters({"URL"})
	@Test
	public void MobileLoginLoan(String urlName) {
		//Appium
		System.out.println("Mobile Login");
		System.out.println(urlName);
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
