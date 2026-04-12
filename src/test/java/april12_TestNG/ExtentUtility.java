package april12_TestNG;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentUtility {
	
	//create static object of ExtentReports;
	public static ExtentReports report;
	
	public ExtentReports getExtentReport() 
	{
		if(report == null) 
		{
			String filepath = System.getProperty("user.dir") + "/reports/extent-report.html";
			File reportFolder = new File(System.getProperty("user.dir") + "/reports");
			
			if(reportFolder.exists()) 
			{
				reportFolder.mkdirs();
			}
			
			ExtentSparkReporter reporter = new ExtentSparkReporter(filepath);
			reporter.config().setReportName("Automation Test Report");
			reporter.config().setDocumentTitle("Extent Report");
			reporter.config().setTheme(Theme.STANDARD);
			reporter.config().setTimeStampFormat("");
			
			report = new ExtentReports();
			report.attachReporter(reporter);
			report.setSystemInfo("Tester", "Suraj");
			report.setSystemInfo("OS", "Windows11");
			report.setSystemInfo("Browser", "Chrome");
			report.setSystemInfo("Machine", "Testers Laptop");	
		}
		
		return report;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
