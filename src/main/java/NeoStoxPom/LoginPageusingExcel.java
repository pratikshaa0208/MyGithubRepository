package NeoStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import neoStoxUtility.UtilityProperty;

public class LoginPageusingExcel 
{
	
	 //1) variable declaration globally --> no. of elements= no. of variables.

		@FindBy(id = "MainContent_signinsignup_txt_mobilenumber")  private WebElement  mobileNumber;
		@FindBy(id = "lnk_signup1") private WebElement signinbutton;
		
		// 2)  public Constructor 
		
		public  LoginPageusingExcel (WebDriver driver)
		{   
			PageFactory.initElements(driver, this);    // called global variable into local  by "this" keywod
		//PageFactory.initElements(driver, mobileNumber);
		//PageFactory.initElements(driver, signupbutton);
		}
		
		//3) Utilize within a method with access level public
		
		public void Entermobilenumber(WebDriver driver,String MN)   // local dummy variable
		{
			UtilityProperty.wait(driver, 1000);
		    mobileNumber.sendKeys(MN);	
			
		}
		
		public void Clicksigninbutton(WebDriver driver) throws InterruptedException
		{   
			UtilityProperty.wait(driver, 1000);
		    signinbutton.click();
		     
		}
		
		
		
	
	

}
