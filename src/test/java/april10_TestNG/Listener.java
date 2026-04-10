package april10_TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + ": Successfully Executed...");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + ": Got failed & Screenshot Captured...");
		System.out.println(result.getThrowable());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
