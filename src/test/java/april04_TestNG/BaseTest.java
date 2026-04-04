package april04_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseTest {
	
	//create object of ReadConfig class
	ReadConfig readconfig = new ReadConfig();
	String chromeBrowser = readconfig.getBrowser();
	String amazonUrl = readconfig.getAmazonUrl();
	String facebookUrl = readconfig.getFacebookUrl();
	String rediffmailUrl = readconfig.getRediffmailUrl();
	String flipkartUrl = readconfig.getFlipkartUrl();
	
	
	
	public static WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		switch(chromeBrowser.toLowerCase()) 
		{
		case "chrome":
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--incognito");
			driver = new ChromeDriver(co);
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
