package april17_TestNG;

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
			String reportPath = System.getProperty("user.dir") + "/reports/extent-report.html";
			File reportFolder = new File(System.getProperty("usre.dir") + "/reports");
			
			if(reportFolder.exists()) 
			{
				reportFolder.mkdirs();
			}
			
			ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
			spark.config().setReportName("Automation Test Report");
			spark.config().setDocumentTitle("Extent Report");
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setTimeStampFormat("");
			
			extent = new ExtentReports();
			extent.attachReporter(spark);
			extent.setSystemInfo("Tester", "Suraj");
			extent.setSystemInfo("OS", "Windows11");
			extent.setSystemInfo("Browser", "Chrome");
			extent.setSystemInfo("Machine", "Tester_Laptop");
		}
		return extent;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
