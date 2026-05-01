package april23_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	//create object of WebDriver Interface;
	WebDriver driver;
	
	//constructor
	public ReusableMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	public void implicitlyWait(int wait) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
	}
	
	public void maximizedWindow() {
		driver.manage().window().maximize();
	}
	
	public void windowHandles() {
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		
		String patent = it.next();
		String child = it.next();
		
		driver.switchTo().window(patent);
		System.out.println(driver.getTitle());
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
	}
	
	public void pageScrolDown() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public void closeBrowserTab() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
	
	public void pageBack() {
		driver.navigate().back();
	}
	
	
	
	
	
	
	
	
	

}
