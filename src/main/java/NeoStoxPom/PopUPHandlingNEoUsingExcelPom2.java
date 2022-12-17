package NeoStoxPom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.UtilityProperty;

public class PopUPHandlingNEoUsingExcelPom2 
{
	@FindBy(xpath="(//a[text()='OK'])[2]")private WebElement Okbutton;
	@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement CloseButton;
	
	public PopUPHandlingNEoUsingExcelPom2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
    public void HandlePopup(WebDriver driver) throws InterruptedException
    {   
    	if(Okbutton.isDisplayed())
    	{  
    		UtilityProperty.wait(driver, 1000);
    		Okbutton.click();
    		Reporter.log("Handling popups", true);
            Reporter.log("clicking on Ok button of popup", true);
    	    UtilityProperty.wait(driver, 1000);
            CloseButton.click();
    		Reporter.log("clicking on close button of popup", true);
    	    UtilityProperty.wait(driver, 1000);
	    }
    	else
    	{
    		Reporter.log("no popup found, good to go further", true);
    	}

    }
    
    
}
