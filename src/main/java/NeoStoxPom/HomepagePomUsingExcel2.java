package NeoStoxPom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.UtilityProperty;

public class HomepagePomUsingExcel2 
{
	@FindBy(xpath = "(//span[text()='Hi Pratiksha Onkar '])[1]")private WebElement username;
    @FindBy(id = "reportsdropdown")private WebElement reportoption;
    @FindBy(xpath = "//span[text()='Dashboard']") private WebElement Dashboardoption;
    @FindBy(id = "navbarDropdown")private WebElement navbarDropdown;
    @FindBy(id = "lnk_logout")private WebElement Logout;
    @FindBy(xpath = "//span[@id='lbl_curbalancetop']")private WebElement avabalance;
	
    
    
    
public HomepagePomUsingExcel2(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public String actualuserid(WebDriver driver) throws IOException
{ 
	UtilityProperty.wait(driver, 1000);
	Reporter.log("getting  actual username", true);
	String ActualId = username.getText();
	Reporter.log("actual username is "+ActualId, true);
	UtilityProperty.screenshot(driver, ActualId);
	return ActualId;
}
	
public void Balance() throws InterruptedException
{
	Thread.sleep(1000);
   Reporter.log("getting available balance", true);
    System.out.println("available balance is "+ avabalance.getText());
}

public void clickreportoption(WebDriver driver)
{
	UtilityProperty.wait(driver, 1000);
    Reporter.log("clicking on report", true);
	reportoption.click();
}
	
public void clickdashboradoption(WebDriver driver)
{
	UtilityProperty.wait(driver, 1000);
    Reporter.log("clicking on dashboard", true);
	Dashboardoption.click();
}
	
public void logout() throws InterruptedException
{   
	Thread.sleep(1000);
	navbarDropdown.click();
	Thread.sleep(100);
	Logout.click();
	Reporter.log("logging out", true);
}

 






}
