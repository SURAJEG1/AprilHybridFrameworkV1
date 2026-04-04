package april02_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class DataDrivenWithDataProviderAnnotation {
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	@Test(dataProvider = "credential")
	public void loginCredentials(String un, String pwd) 
	{
		WebElement username = driver.findElement(By.xpath(""));
		WebElement password = driver.findElement(By.xpath(""));
		WebElement lgButton = driver.findElement(By.xpath(""));
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		lgButton.click();
	}
	
	
	
	@DataProvider(name = "credential")
	public static Object[][] dataDriven() 
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "admin";
		data[0][1] = "admin123";
		
		data[1][0] = "Admin";
		data[1][1] = "admin123";
		
		return data;
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
