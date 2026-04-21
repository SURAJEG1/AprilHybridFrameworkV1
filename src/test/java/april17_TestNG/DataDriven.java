package april17_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataDriven {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(dataProvider = "credentials")
	public void login(String un, String pwd) 
	{
		WebElement enterUsername = driver.findElement(By.xpath(""));
		WebElement enterPassword = driver.findElement(By.xpath(""));
		WebElement clickOnLoginBtn = driver.findElement(By.xpath(""));
		
		enterUsername.sendKeys(un);
		enterPassword.sendKeys(pwd);
		clickOnLoginBtn.click();
		
	}
	
	
	
	@DataProvider(name = "credentials")
	public static Object[][] dataDriven()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		data[1][0] = "admin";
		data[1][1] = "admin123";
		
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
