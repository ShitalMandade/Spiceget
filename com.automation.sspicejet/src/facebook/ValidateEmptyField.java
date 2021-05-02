package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pomObjectportfolio.Login;



public class ValidateEmptyField {
	//@FindBy(id="js_7")
	//@FindBy(partialLinkText="least six numbers")
	//static WebElement val;
  public static void main(String[] args) {
	
	
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create New Account")).click();
	WebElement listOfDay =driver.findElement(By.id("day"));
	WebElement listOfMonth =driver.findElement(By.id("month"));
	WebElement listOfYear =driver.findElement(By.id("year"));
	driver.findElement(By.name("lastname")).sendKeys("Mandade");
	driver.findElement(By.name("reg_email__")).sendKeys("9545965620");
	driver.findElement(By.id("password_step_input")).sendKeys("9545965620");
	ValidateEmptyField f=new ValidateEmptyField();
	f.pickItemFromList(listOfDay, "6");
	f.pickItemFromList(listOfMonth, "Sep");
	f.pickItemFromList(listOfYear,  "2013");
	
	//driver.findElement(By.partialLinkText(partialLinkText))
	
	ValidateEmptyField l= new ValidateEmptyField();
	     l.getfbVal().getAttribute(null);
	
	
	
}
  //@FindBy(id="js_7")
		@FindBy(xpath="//div[contains(text(),'least six numbers')]")
		 private WebElement fbval;
	      public WebElement getfbVal()
	  	{
	  		return fbval;
	  	}

public void pickItemFromList( WebElement list, String Value) 
{
	Select select = new Select(list);
	
      select.selectByVisibleText(Value);
		
		
	}
	
	

}

