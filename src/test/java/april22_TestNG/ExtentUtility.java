package april22_TestNG;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentUtility {
	
	//create object of ExtentReports class 
	ExtentReports reports;
	
	
	public ExtentReports getExtentReport() 
	{
		if(reports == null) 
		{
			String reportPath = System.getProperty("user.dir") + "/reports/extent-report.html";
			File reportFolder = new File(System.getProperty("user.dir") + "/reports");
			
			if(!reportFolder.exists()) 
			{
				reportFolder.mkdirs();
			}
			
			ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
			spark.config().setReportName("Automation Test Report");
			spark.config().setDocumentTitle("Extent Report");
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setTimeStampFormat("");
			
			
			reports = new ExtentReports();
			reports.attachReporter(spark);
			reports.setSystemInfo("Tester", "Suraj");
			reports.setSystemInfo("OS", "Windows11");
			reports.setSystemInfo("Browser", "Chrome");
			reports.setSystemInfo("Machine", "Testers Lp");
		}
		
		return reports;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
