package april09_TestNG;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentUtility {

	//create Static object of ExtentReports class
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


			ExtentSparkReporter extentreporter = new ExtentSparkReporter(reportpath);
			extentreporter.config().setReportName("Automation Test Report");
			extentreporter.config().setDocumentTitle("Extent Report");
			extentreporter.config().setTheme(Theme.STANDARD);
			extentreporter.config().setTimeStampFormat("EEEE, MMMM dd, YYYY, hh:mm a ('zzz')");

			extent = new ExtentReports();
			extent.attachReporter(extentreporter);
			extent.setSystemInfo("Tester", "Suraj");
			extent.setSystemInfo("OS", "WINDOWS11");
			extent.setSystemInfo("Browser", "Chrome");
			extent.setSystemInfo("Machine", "Tester_LP");

		}

		return extent;


	}































}
