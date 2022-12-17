package NeoStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import neoStoxUtility.UtilityProperty;


public class SiGnINPage
{   

    @FindBy(xpath = "//a[text()='Sign In'][1]")private WebElement SignIN;
	
	public SiGnINPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonSignInoption(WebDriver driver)
	{    
		UtilityProperty.wait(driver, 1000);
		SignIN.click();
		
	}
  
	public void closebrowser(WebDriver driver)
	{   
		UtilityProperty.wait(driver, 1000);
	     driver.close();
	    
	}

	
}
