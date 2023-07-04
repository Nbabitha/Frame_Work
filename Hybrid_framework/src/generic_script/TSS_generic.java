package generic_script;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TSS_generic {
	public static void getPhoto(WebDriver driver) throws IOException
	{
		String photo="./photo/";
		java.util.Date d=new java.util.Date();
		String d1=d.toString();
		String d2=d1.replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+d2+".jpeg");
		org.openqa.selenium.io.FileHandler.copy(src,dst);
	}

}
