package april21_TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	WebDriver driver;
	
	public ReusableMethods(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	
	public void maximizedWindow() 
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
