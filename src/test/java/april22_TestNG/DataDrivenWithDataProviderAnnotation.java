package april22_TestNG;

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
		driver = new ChromeDriver();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(dataProvider = "pass")
	public void login(String un, String pwd) 
	{
		WebElement username = driver.findElement(By.xpath(""));
		WebElement password = driver.findElement(By.xpath(""));
		WebElement clickOnLoginBtn  = driver.findElement(By.xpath(""));
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		clickOnLoginBtn.click();
	}
	
	
	
	
	@DataProvider(name = "pass")
	public Object[][] dataDriven()
	{
		Object[][] data = new Object[2][1];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		data[1][0] = "admin";
		data[1][1] = "admin123";
		
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
