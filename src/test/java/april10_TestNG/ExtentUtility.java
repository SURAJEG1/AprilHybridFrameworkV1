package april10_TestNG;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentUtility {

	//create static object of ExtentReports class
	
	public static ExtentReports extent;
	public ExtentReports extentReport() 
	{
		if(extent == null) 
		{
			String filepath = System.getProperty("user.dir") + "/reports/extent-report.html";
			File folderPath = new File(System.getProperty("user.dir") + "/reports");
			
			if(folderPath.exists()) 
			{
				folderPath.mkdirs();
			}
			
			
			ExtentSparkReporter sparkreporter = new ExtentSparkReporter(filepath);
			sparkreporter.config().setReportName("Automation Test Report");
			sparkreporter.config().setDocumentTitle("Extent Report");
			sparkreporter.config().setTheme(Theme.STANDARD);
			sparkreporter.config().setTimeStampFormat("");
			
			extent = new ExtentReports();
			extent.attachReporter(sparkreporter);
			extent.setSystemInfo("Tester", "Suraj");
			extent.setSystemInfo("OS", "Windows11");
			extent.setSystemInfo("Browser", "Chrome");
			extent.setSystemInfo("Machine", "Tester_Laptop");
		}
		
		return extent;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
