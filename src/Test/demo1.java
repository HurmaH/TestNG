package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class demo1 {
	@AfterMethod
	public void befMethod() {
		System.out.println("@AfterMehtod in class demo1 execute after each method in this class");
	}
	
	@AfterSuite
	public void beforeSuite() {
		System.out.println("@AfterSuit last off all in Suite");
	}
	
	
	@Test
	public void demo2() {
		System.out.println("Hello TestNG");
	}
	
	@Parameters ({"Hurma"})
	@Test
	public void Demo2() {
		System.out.println("Bye TestNG");
	}
	
	@BeforeTest
	public void prerequisite () {
		System.out.println("@BeforeTest will execute first in Demo Loan test");
	}
	

}
