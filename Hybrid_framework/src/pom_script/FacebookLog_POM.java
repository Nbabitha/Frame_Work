package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_script.BasePage;

public class FacebookLog_POM extends BasePage  {
	@FindBy(name="email")
	private WebElement Unfield;
	
	@FindBy (name="pass")
	private WebElement PWDfield;
	
	@FindBy (name="login")
	private WebElement logBtn;
	
	public FacebookLog_POM(WebDriver driver)
	{
		super(driver);
	}

	public void User(String uname)
	{
		Unfield.sendKeys(uname);
	}
	
	public void PWD(String upwd)
	{
		PWDfield.sendKeys(upwd);
	}
	public void LoginBtn() 
	{
		logBtn.click();
	}
}
