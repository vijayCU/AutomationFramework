package retryListener2;

import java.util.ArrayList;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryInterfaceImplement1 implements IRetryAnalyzer {

	ArrayList<String> testlist= new ArrayList<String>();
	public boolean retry(ITestResult result) {
		System.out.println("Inside Retry");
		String testname= result.getMethod().getMethodName();
		if(testlist.contains(testname)) {
			System.out.println("Already failed");
			return false;
		}
		else {
		System.out.println(testlist);
		testlist.add(testname);

		return true;
		}
	}
}