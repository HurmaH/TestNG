package Test;

import java.io.IOException;

import org.testng.annotations.Test;

public class DataDrivingTEst extends DataDrivingParametrization {
	
	@Test
	public void OpeningBrowser () throws IOException {
		Login();
	}

}
