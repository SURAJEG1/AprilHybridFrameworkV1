package april01_TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "Successfully Executed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + "got failed & screenshot captured");
		System.out.println(result.getThrowable());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName() + "Test Starts");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName() + "Test finished");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
