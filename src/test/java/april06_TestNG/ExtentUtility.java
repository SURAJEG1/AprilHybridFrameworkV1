package april06_TestNG;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentUtility {

	//create static object of ExtentReports class
	public static ExtentReports extent;

	public ExtentReports getExtentReports() 
	{
		if(extent == null) 
		{

			String reportpath = System.getProperty("user.dir") + "/reports/extent-report.html";
			File reportfolder =  new File (System.getProperty("user.dir") + "/reports");

			if(!reportfolder.exists()) 
			{
				reportfolder.mkdirs();
			}

			ExtentSparkReporter extentReporter = new ExtentSparkReporter(reportpath);
			extentReporter.config().setReportName("Automation Test Result");
			extentReporter.config().setDocumentTitle("Extent Report");
			extentReporter.config().setTheme(Theme.STANDARD);
			extentReporter.config().setTimeStampFormat("EEEE, MMMM dd, YYYY, hh:mm a ('zzz')");


			extent = new ExtentReports();
			extent.attachReporter(extentReporter);
			extent.setSystemInfo("Tester", "Suraj");
			extent.setSystemInfo("OS", "Windows11");
			extent.setSystemInfo("Browser", "chrome");
			extent.setSystemInfo("Machine", "Tester LP");
		}
		
		return extent;

	}
























}
