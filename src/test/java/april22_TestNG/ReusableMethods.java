package april22_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	
	//create object of WebDriver interface
	WebDriver driver;
	
	
	//constructor
	public ReusableMethods(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	public void maximizeWindow() 
	{
		driver.manage().window().maximize();
	}
	
	
	public void implicitlyWait(int wait) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
	}
	
	
	public void windowHandles() 
	{
		Set<String> wd =driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String patentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(patentWindow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
	}
	
	
	
	public void scrollDownWindow() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
