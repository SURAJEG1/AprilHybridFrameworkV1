package april10_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	//create object of WebDriver interface;
	WebDriver driver;
	
	//Constructor
	public ReusableMethods(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	public void maximizePage() {
		driver.manage().window().maximize();
	}
	
	public void refteshPage() {
		driver.navigate().refresh();
	}
	
	public void pageBack() {
		driver.navigate().back();
	}
	
	public void implicitlyWait(int wait) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
	}
	
	public void pageScrollDown() {
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
