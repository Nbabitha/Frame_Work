package generic_script;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListerner implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TC is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TC is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TC is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TC is skipped");

	}
	


}
