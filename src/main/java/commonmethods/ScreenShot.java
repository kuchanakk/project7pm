package commonmethods;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import testBase.BrowsrlLaunch;

public class ScreenShot extends BrowsrlLaunch {
	
	@Test
	public static void scshot() throws IOException {
		
		/*
		 * TimeStemp ts = new TimeStemp(); Timestamp time=ts.timestamp(); String
		 * stringstime= time.toString();
		 */
		/*
		 * TimeStemp ts= new TimeStemp(); String st=ts.timestamp();
		 * System.out.println(ts.timestamp());
		 */
		
		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("C:\\Users\\kiran\\eclipse-workspace\\seleniumprojectnew\\resources\\screenshot\\error1.png"));
		
	}
	
	
	

}
