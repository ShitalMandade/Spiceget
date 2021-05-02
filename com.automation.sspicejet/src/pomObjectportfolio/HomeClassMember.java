package pomObjectportfolio;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sspicejet.UniversalLab.BaseClass;

public class HomeClassMember extends BaseClass {
//click on logo
	@FindBy(className="spicejet_logo")
		private WebElement logo;
		public WebElement getLogo()
		{
			return logo;
		}
		
	//click on radio Round  trip Radio btn	
	@FindBy(id="ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")
	private WebElement roundtrip_rbtn;
	public WebElement getRadioButton()
	{
		return roundtrip_rbtn;
	}
	//Select Departure City click on arrow button
	@FindBy(className ="select_CTXT")
	private WebElement departureCity;
	public WebElement getDcity()
	{
		return departureCity;
	}
	
	//Select Departure City
	  @FindBy(xpath="//div[@class='dropdownDiv']/ul[1]/li[9]/a")
	 private WebElement selectdepartureCity;
	 public WebElement getselectedDcity()
	{
		return selectdepartureCity;
	}
	
	 /*@FindBys({
	 @FindBy(xpath="//div[@id=\"ctl00_mainContent_ddl_originStation1_CTNR\"]")
	})
	 private WebElement selectdepartureCity;
	 public WebElement getselectedDcity()
	{
		return selectdepartureCity;
	}
	 */
	
	
	 //Arrival city
	
@FindBy(xpath ="//select[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1\"]/option")
		private WebElement arrivalCity;
		public WebElement getAcity()
		{
			return arrivalCity;
		}
		
		//Select Arrival City
		 
		 @FindBy(xpath="//div[@id=\"dropdownGroup1\"]/div/ul[1]/li[13]/a[@value=\"DEL\"]")
		 private WebElement selectarrivalCity;
		 public WebElement getselectedAcity()
		{
			return selectarrivalCity;
		}	
//Select depart date
		 //click on cal
		
			@FindBy(className="ui-datepicker-trigger")
	        private WebElement dDtae;
		public WebElement getDdate()
		{
			return dDtae;
		}
		
		
		
		
		
		
		
		
		//if week
		@FindBy(xpath="//a[contains(@class,'highlight')]/../following-sibling::tr[1]/td[1]")
		private WebElement week;
		public WebElement getWeek()
		{
		
		return week;
		 
		}
		
		//nexslot
		@FindBys({@FindBy(xpath="//a[contains(@class,'highlight')]/../following-sibling::td")})
		private List<WebElement> nextslot;
		public List<WebElement> getNextslot()
		{
		
		return nextslot;
		 
		}
		//for next month
		@FindBy(xpath="//span[text()='Next']")
		private WebElement month;
		public WebElement getMonth()
		{
		
		return month;
		 
		}
		//month 1st date
		@FindBy(xpath="//a[text()='1']")
		private WebElement month1;
		public WebElement getMonth1()
		{
		
		return month1;
		 
		}
	
//select return date	
		//click on cal
		
@FindBy(xpath="//label[text()='RETURN DATE']/../following-sibling::input")
private WebElement rDate;
public WebElement getRdate()
{
	return rDate;
}




//if week
@FindBy(xpath="//a[@class='ui-state-default ui-state-active']/../../td[1]/following-sibling::td")
private WebElement rweek;
public WebElement getRWeek()
{

return rweek;
 
}

//nexslot
@FindBys({@FindBy(xpath="//a[@class='ui-state-default ui-state-active']/../../td[1]/following-sibling::td")})
private List<WebElement> nextRslot;
public List<WebElement> getRNextslot()
{

return nextRslot;
 
}
//for next month
@FindBy(xpath="//span[text()='Next']")
private WebElement rmonth;
public WebElement getRMonth()
{

return rmonth;
 
}
//month 1st date
@FindBy(xpath="//a[text()='1']")
private WebElement rmonth1;
public WebElement getRMonth1()
{

return rmonth1;
 
}

    
	
	






















	
	//click on Search
	@FindBy(id="ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")
	private WebElement searchClick;
	public WebElement getSearchclick()
	{
		return searchClick;
	}
	
	
}
