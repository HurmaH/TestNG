package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTrial {
	
	@Test(dataProvider ="getData" )
	public void login (String username, String password) {
		System.out.println("Click on field");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object [][] getData (){
		//set1:username1, password1
		//set2:username1, password1
		//set3:username1, password1
		
		Object [][] data = new Object [3][2];
		//set1
		data [0][0] = "username1";
		data [0][1] = "password1";
		
		//set2
		data [1][0] = "username2";
		data [1][1] = "password2";
		
		//set3
		data [2][0] = "username3";
		data [2][1] = "password3";
		
		return data;
	}

}
