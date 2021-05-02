package pomObjectportfolio;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sspicejet.UniversalLab.BaseClass;

public class Login extends BaseClass 
{
	
	//mouseover login link
	@FindBy(className="link")
	private WebElement loginl;
	public WebElement getloginl()
	{
		return loginl;
	}
	
	//mouseover spicejet link
	@FindBy(linkText="SpiceClub Members")
	private WebElement spmember;
	public WebElement getspmember()
	{
		return spmember;
	}
	
	//click on memberlogin
	@FindBy(linkText="Member Login")
	private WebElement mlogin;
	public WebElement getMlogin()
	{
		return mlogin;
	}
	
	//Enter id
	@FindBy(xpath="//input[@placeholder='Mobile Number']")
	private WebElement memberId;
	public WebElement getMemberId()
	{
		return memberId;
	}
	//Enter password
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	public WebElement getPassword()
	{
		return password;
	}
	//click login
	@FindBy(className="buttonLogin")
	private WebElement login_Btn;
	public WebElement getLogin()
	{
		return login_Btn;
	}
	public void loginToSpiceJet() throws IOException, Exception 
	{
		String s =picker.getDataFromProperty("id");
		memberId.sendKeys(picker.getDataFromProperty("id"));
		   String p =picker.getDataFromProperty("password");
		   System.out.println(p);
		password.sendKeys(picker.getDataFromProperty("password"));
		
		Robot r=new Robot();
		r.mousePress(1);
		 
		
		login_Btn.click();
		HomeClassMember hm= PageFactory.initElements(driver, HomeClassMember.class);
		//hm.getLogo().click();
	}
	    
}
