package april09_TestNG;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	//create object of Properties class;
	Properties properties;
	String filepath = "E:\\InfoEge Automation Project\\AprilHybridFrameworkV1\\src\\main\\java\\Resources\\config.properties";
	
	//constructor
	public ReadConfig() 
	{
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream(filepath);
			properties.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//create methods for browser and url key
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("browser is not spacified in config.properties file");
	}
	
	
	
	public String  getAmazonUrl() 
	{
		String value = properties.getProperty("amazonUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("baseUrl is not spacified in config.properties file");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
