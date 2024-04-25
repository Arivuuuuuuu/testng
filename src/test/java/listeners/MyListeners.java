package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener {
	
	
	public void onTestStart(ITestResult result) {
	    // not implemented
		System.out.println("onTestStart");
	  }
	
	public void onTestSuccess(ITestResult result) {
		    // not implemented
		System.out.println("onTestSuccess");
		  }
	
	public void onTestSkipped(ITestResult result) {
	    // not implemented
	   System.out.println("onTestSkipped");
	  }
	
	
	public void onTestFailure(ITestResult result) {
	    // not implemented
		System.out.println("onTestFailure");
	  }
	
	
	public void onFinish(ITestContext context) {
	    // not implemented
		System.out.println("onFinish");
	  }
    
}
