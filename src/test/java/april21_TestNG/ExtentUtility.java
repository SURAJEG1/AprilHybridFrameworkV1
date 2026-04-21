package april21_TestNG;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentUtility {
	
	
	//create static object of ExtentReports
	public static ExtentReports extent;
	
	
	public ExtentReports getExtentReport() 
	{
		if(extent == null) 
		{
			String reportpath = System.getProperty("user.dir") + "/reports/extent-report.html";
			File reportFolder = new File(System.getProperty("user.dir") + "/reports");
			
			if(!reportFolder.exists()) 
			{
				reportFolder.mkdirs();
			}
			
			ExtentSparkReporter spark = new ExtentSparkReporter(reportpath);
			spark.config().setReportName("Automation Test Report");
			spark.config().setDocumentTitle("Extent Report");
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setTimeStampFormat("");
			
			
			
			extent = new ExtentReports();
			extent.attachReporter(spark);
			extent.setSystemInfo("Tester", "Suraj");
			extent.setSystemInfo("OS", "Windows11");
			extent.setSystemInfo("Browser", "Chrome");
			extent.setSystemInfo("Machine", "Testers_Laptop");	
		}
		
		return extent;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
