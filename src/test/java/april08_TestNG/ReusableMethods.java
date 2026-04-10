package april08_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class ReusableMethods {
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
	
	public void implicitlyWait() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void windowHandles() 
	{
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String patentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(patentWindow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	

