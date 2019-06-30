package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo2 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass runs before all methods in class demo2");
	}
	@BeforeMethod
	public void befMethod() {
		System.out.println("@BeforeMethod runs before each method in class demo2");
	}
	@AfterTest
	public void postrequisite() {
		System.out.println("@AfterTest run last in Demo Loan test only");
	}
	@AfterTest
	public void postrequisite2() {
		System.out.println("@AfterTest second last in Demo Loan test only");
	}
	@Test
	public void Emo3() {
		System.out.println("Hello Emo3");
	}
	
	@Test
	public void Demo4() {
		System.out.println("Bye Demo4");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("@afterClass runs before all methods in class demo2");
	}

}
