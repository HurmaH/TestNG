package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class DataDrivingParametrization {
	public WebDriver driver= null;

	@Test
	public void Login() throws IOException {
		Properties prop = new Properties();//prop objeçt is ready after below to interpret
		//files object knows where is file
		FileInputStream files = new FileInputStream("C:\\Users\\Hurmik\\eclipse-workspace\\TestNG\\src\\TestingFiles\\datadriven.properties");
		prop.load(files);
	
		//Setting browser
		if(prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\firefox.exe");
			driver = new FirefoxDriver();
		}else if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Hurmik\\Documents\\selenium dependencies\\drivers\\MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.get(prop.getProperty("url"));
		
		
	}

}
