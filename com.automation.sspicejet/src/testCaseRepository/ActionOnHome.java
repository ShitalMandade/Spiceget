package testCaseRepository;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sspicejet.UniversalLab.BaseClass;
import com.sspicejet.UniversalLab.WebDriverCommonUtils;

import pomObjectportfolio.HomeClassMember;
import pomObjectportfolio.SelectFlightFromList;

public class ActionOnHome extends BaseClass{
	@Test
	public void clickaction()
	{
		WebDriverCommonUtils wc=PageFactory.initElements(driver, WebDriverCommonUtils.class);
		HomeClassMember hm= PageFactory.initElements(driver, HomeClassMember.class);
		hm.getLogo().click();
		hm.getRadioButton().click();
		 hm.getDcity().click();
		 hm.getselectedDcity().click();
		 
		 /*   List<WebElement>l=driver.findElements(By.className("mapbg"));
		  for(WebElement wb:l)
		  {
			  System.out.println(wb.getText());
			  wb.getText().equals(" Bengaluru (BLR)");
			  wb.click();
			  break
		  }*/
		  hm.getAcity().click();
		 wc.scrollDown();
		 hm.getselectedAcity().click();		  
		  
		 
		 
		 
		 // Departure Date
		 hm.getDdate().sendKeys(Keys.ENTER);
		 wc.calender(hm.getWeek(), hm.getMonth(), hm.getMonth1(), hm.getNextslot());
		
		 //wc.calender(hm.getRWeek(), hm.getRMonth(), hm.getRMonth1(), hm.getRNextslot());
		 
		  
		  
		  //click on serach
		   hm.getSearchclick().click();
		   
		//SelectFlightFromList..
		   //select departure
	 SelectFlightFromList sffl=PageFactory.initElements(driver, SelectFlightFromList.class);
		   sffl.getSelectDFlight().click();
		   wc.scrollDown();
		   sffl.getSelectRFlight().click();
		   sffl.getContinue_Btn().click();
	
		 
		
	}
	
}


