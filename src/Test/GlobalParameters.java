package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class GlobalParameters {
	
	@Test
	public void Login() throws IOException {
		Properties prop = new Properties();//prop obje�t is ready after below to interpret
		//files obje�t knows where is file
		FileInputStream files = new FileInputStream("C:\\Users\\Hurmik\\eclipse-workspace\\TestNG\\src\\TestingFiles\\datadriven.properties");
		prop.load(files);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
	}

}
