package pomObjectportfolio;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sspicejet.UniversalLab.BaseClass;

public class SelectFlightFromList extends BaseClass {
	
	//select departure 2nd flight
		@FindBy(xpath="//table[@id=\"availabilityTable0\"]/tbody/tr[5]/td[3]/p/label/span[1]")
		private WebElement selectDFlight;
		public WebElement getSelectDFlight()
		{
			return selectDFlight;
		}
//select return 3rd fligh
		
		
@FindBy(xpath="//table[@id=\"availabilityTable1\"]/tbody/tr[6]/td[3]/p/label/span[1]")
private WebElement selectRFlight;
public WebElement getSelectRFlight()
{
	return selectRFlight;
}


//click on Continue
@FindBy(xpath="//div[@id=\"continue-to-contact-page\"]/div/span[text()='Continue']")
private WebElement continue_Btn;
public WebElement getContinue_Btn()
{
	return continue_Btn;
}

}
