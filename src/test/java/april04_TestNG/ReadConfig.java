package april04_TestNG;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	//create object of Properties class
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
	
	
	
	
	//create method for browser and url key
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("browser is not spacified in config.properties file");
	}
	
	public String getAmazonUrl() 
	{
		String value = properties.getProperty("amazonUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("amazonUrl is not spacified in config.properties file");
	}
	
	
	public String getFacebookUrl() 
	{
		String value = properties.getProperty("facebookUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("facebookUrl is not spacified in config.properties file");
	}
	
	
	public String getFlipkartUrl() 
	{
		String value = properties.getProperty("flipkartUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("flipkartUrl is not spacified in config.properties file");
	}
	
	
	public String getRediffmailUrl() 
	{
		String value = properties.getProperty("rediffmailUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("rediffmailUrl is not spacified in config.properties file");
	}
	
	
	
	
	
	
	
	
	

}
