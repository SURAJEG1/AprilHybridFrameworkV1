package april06_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ReusableMethods {

	//Create object of WebDriver driver interface
	WebDriver driver;
	
	//constructor
	public ReusableMethods(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	
	public void max() 
	{
		driver.manage().window().maximize();
	}
	
	public void refreshPage() 
	{
		driver.navigate().refresh();
	}
	
	public void pageBack() 
	{
		driver.navigate().back();
	}
	
	public void closeBrowserTab() 
	{
		driver.close();
	}
	
	public void quitBrowser() 
	{
		driver.quit();
	}
	
	public void implicitlyWait(int wait) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
	}
	
	public void windowHandles() 
	{
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
	}
	
	
	
	public void scrollDown() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.windowHeight)");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
