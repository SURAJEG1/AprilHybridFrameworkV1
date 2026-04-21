package april14_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	String browser = readconfig.getBrowser();
	String baseUrl = readconfig.getBaseUrl();
	
	
	public static WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		switch(browser.toLowerCase()) 
		{
		case"chrome":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;

		case"edge":
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;

		case"firefox":
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;

		default:
			driver = null;
			break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
