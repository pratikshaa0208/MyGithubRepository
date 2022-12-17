package NeoStoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import neoStoxUtility.UtilityProperty;

public class PassworsPAgePomUsingExcel
{
	@FindBy(xpath ="//input[@name='ctl00$MainContent$_wp_enteraccesspin$txt_accesspin'] ")private WebElement field;
	@FindBy(id = "lnk_submitaccesspin")private WebElement submitbutton;

	public PassworsPAgePomUsingExcel(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

    public void enterPass(String Pwd, WebDriver driver) throws InterruptedException
	{   
    	UtilityProperty.wait(driver, 3000);
    	field.sendKeys(Pwd);
		
	}

	public void clicksubmit(WebDriver driver) throws InterruptedException
	{   
		UtilityProperty.wait(driver, 000);
		 submitbutton.click();
		 
	}

}
