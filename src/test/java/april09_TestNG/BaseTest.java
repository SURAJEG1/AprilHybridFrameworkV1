package april09_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseTest {
	


	//create object of ReadConfig class
	ReadConfig readconfig = new ReadConfig();
	String chromeBrowser = readconfig.getBrowser();
	String amazonUrl = readconfig.getAmazonUrl();
	
	
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
	
	
	
	
	
	
	//Reusable Methods
	public void maximizePage() {
		driver.manage().window().maximize();
	}
	
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
	public void pageBack() {
		driver.navigate().back();
	}
	
	public void closeBrowserTab() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void pageScrolDown() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public void windowHandles() {
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
