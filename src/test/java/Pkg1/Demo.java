package Pkg1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Demo {

	public static ExtentSparkReporter spark;
	public static ExtentReports extent;
	public static ExtentTest logger;

	public static void main(String[] args) {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/Report.html");
		extent.attachReporter(spark);

		System.out.println("hi");

		logger = extent.createTest("Verify msg1");
		logger.log(Status.PASS, "Test case pass");
	
		System.out.println("Hello");

		logger = extent.createTest("Verify msg2");
		logger.log(Status.FAIL, "Test case pass");
		extent.flush();
	}
}
