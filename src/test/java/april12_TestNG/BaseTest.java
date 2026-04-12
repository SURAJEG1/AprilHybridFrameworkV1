package april12_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class BaseTest {
	//create object of ReadConfig class
	ReadConfig readconfig = new ReadConfig();
	String chromeBrowser = readconfig.getChromeBrowser();
	String edgeBrowser = readconfig.getEdgeBrowser();
	String baseUrl = readconfig.getBaseUrl();

	public static WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		switch(chromeBrowser.toLowerCase()) 
		{
		case "chrome":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		case "edge":
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}





	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}






























}
