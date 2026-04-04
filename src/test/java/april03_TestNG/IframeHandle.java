package april03_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

@Listeners(Listener.class)
public class IframeHandle {
	WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(priority=1)
	public void iframe() throws InterruptedException 
	{
		driver.switchTo().frame("moneyiframe");
		
		WebElement bse = driver.findElement(By.id("bseindex"));
		WebElement nse = driver.findElement(By.id("nseindex"));
		WebElement searchBox = driver.findElement(By.id("query"));
		
		System.out.println(bse.getText());
		System.out.println(nse.getText());
		searchBox.sendKeys("IPL");
		searchBox.sendKeys(Keys.ENTER);
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
	}
	
	
	@Test(priority=2)
	public void windowHandles() 
	{
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
	}
	
	
	
	
	@AfterClass
	public void tearDown() throws InterruptedException 
	{
		driver.close();
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
