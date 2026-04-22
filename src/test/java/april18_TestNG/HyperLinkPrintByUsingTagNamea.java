package april18_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

public class HyperLinkPrintByUsingTagNamea {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("https://amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test
	public void hyperLinkPrint() throws InterruptedException 
	{
		List<WebElement> list = driver.findElements(By.tagName("a"));
		int count = list.size();
		System.out.println("Total Link : " + count);
		
		Thread.sleep(1000);
		for(WebElement el:list) 
		{
			System.out.println(el.getText());
		}
		
	}
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
