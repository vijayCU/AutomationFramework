package deletelater;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic.BaseTest;

//@Test(retryAnalyzer=RetryTestRun.class)	// it can be at class level or test level
public class Demo1 extends BaseTest{


	@Test
	public void myTest(){
		eTest.log(Status.PASS, "Executed MyTest");
		System.out.println(driver.getTitle());
		Assert.fail();
	}

}
