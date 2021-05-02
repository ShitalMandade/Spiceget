package com.sspicejet.UniversalLab;




import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonUtils  {
	public void fetchItemFromList(WebElement list, int item)
	{
	Select s =new Select(list);
	s.selectByIndex(item);
	 
	}
	
	public void scrollDown()
	{
		EventFiringWebDriver efwd= new EventFiringWebDriver(BaseClass.driver);
		efwd.executeScript("window.scrollBy(0,200);");
		
	}
	
	
	//Handle Calender tommarow date
	public void calender (WebElement week ,WebElement month, WebElement month1,List<WebElement> nextslot)
	{
	if(nextslot.isEmpty())
	{
	week.click();
		
	}
	else if(nextslot.get(0).getText().equals(""))
	{
		month.click();
		month1.click();
	}
	else
	{
		nextslot.get(0).click();
		 
	}
	}
	
	
	//Wait handling
	public void explicitlyWait(WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(BaseClass.driver,40);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/*public void fetchItemFromListByCustom(List<WebElement>options, int item)
	{
	
	 
	}
		*/
		
	}


