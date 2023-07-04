package runner_script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_script.Generic_FacebookLog;
import pom_script.FacebookLog_POM;

public class Data_provider1 extends Generic_FacebookLog {
	@Test(dataProvider = "testData")
	public void validTest(String d1, String d2) throws InterruptedException
	{
		FacebookLog_POM p=new FacebookLog_POM(driver);
		p.User(d1);
		p.PWD(d2);
		Thread.sleep(2000);
		p.LoginBtn();
		Assert.fail();
		
	}
	@DataProvider (name="testData")
	public Object[][] createData1()
	{return new Object[][]{
		{ "babitha","1234"},
		{"Shruthi","2345"}
	};
	}
}
