package generic_script;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_FacebookLog implements Framework_const1{
	
	public WebDriver driver;
	@BeforeMethod
	public void OpenApp() 
	{
		System.setProperty(gecko_key, gecko_value);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(base_url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
   @AfterMethod
   public void CloseApp(ITestResult res) throws IOException
   {
	   if(ITestResult.FAILURE==res.getStatus())
	   {
		   TSS_generic.getPhoto(driver);
	   }
	   driver.close();
   }
}




