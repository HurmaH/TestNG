package Test;

import org.testng.annotations.Test;

public class helperAttributes {
	
	@Test(dependsOnMethods= {"method1", "method2"})
	public void method3() {
		System.out.println("Method3 depends on Method1 and Method2");
	}
	
	@Test
	public void method1() {
		System.out.println("Method1");
	}
	
	@Test
	public void method2() {
		System.out.println("Method2");
	}
	
	@Test(enabled=false)
	public void method4() {
		System.out.println("method for is skipped");
	}

}
