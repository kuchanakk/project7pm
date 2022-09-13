package commonmethods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentrep {
	static ExtentReports extent;
	static ExtentSparkReporter spark;
	static ExtentTest test;
	
	public void extentsetup() {
		
		 extent = new ExtentReports();
		
		 spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		 test=extent.createTest("popitemstest");
		
	}
	
	
	public void pass() {
		
		test.pass("text of the product matching with expected");
	}
	
public void fail() {
	
	test.fail("text of the product not matching with expected");
}
	
	
public void genrep() {
	extent.flush();
	
}

}
