package april11_TestNG;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentUtility {
	
	//create static object of ExtentReports class
	public static ExtentReports extent;
	
	
	public ExtentReports getExtentReport() 
	{
		if(extent == null) 
		{
			String filepath = System.getProperty("user.dir") + "/reports/extent-report.html";
			File reportFolder = new File(System.getProperty("user.dir") + "reports");
			
			
			if(reportFolder.exists()) 
			{
				reportFolder.mkdirs();
			}
			
			
			ExtentSparkReporter reporter = new ExtentSparkReporter(filepath);
			reporter.config().setReportName("Automation Test Report");
			reporter.config().setDocumentTitle("Extent Report");
			reporter.config().setTheme(Theme.STANDARD);
			reporter.config().setTimeStampFormat("");
			
			
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "Suraj");
			extent.setSystemInfo("OS", "Windows11");
			extent.setSystemInfo("Browser", "Chrome");
			extent.setSystemInfo("Machine", "Test Laptop");
		}
		
		return extent;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
