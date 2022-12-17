package neoStoxTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import NeoStoxPom.DashboardPOMExcel2;
import NeoStoxPom.HomepagePomUsingExcel2;
import NeoStoxPom.PopUPHandlingNEoUsingExcelPom2;
import NeoStoxPom.LoginPageusingExcel;
import NeoStoxPom.PassworsPAgePomUsingExcel;
import NeoStoxPom.SiGnINPage;
import neoBasepackage.Base1;
import neoStoxUtility.UtilityProperty;


public class NewTest2ReadingfromPropertyfile2 extends Base1
{
	

	SiGnINPage signin1;
	 LoginPageusingExcel login;
	 PassworsPAgePomUsingExcel Password;
    PopUPHandlingNEoUsingExcelPom2 pop;
	 HomepagePomUsingExcel2 Home1 ;
	 DashboardPOMExcel2 Dashboard;
 
	
@BeforeClass
public void launchNeo() throws InterruptedException, IOException
{
	LaunchBrowser();
     signin1=new SiGnINPage(driver); 
     login = new  LoginPageusingExcel (driver);
     Password =new PassworsPAgePomUsingExcel(driver);
     pop=new PopUPHandlingNEoUsingExcelPom2(driver);
     Home1 = new  HomepagePomUsingExcel2(driver);
     Dashboard=new DashboardPOMExcel2(driver);
	
  }
 @BeforeMethod
 public void logintoNeo() throws EncryptedDocumentException, IOException, InterruptedException
 {
   signin1.clickonSignInoption(driver);
   Reporter.log("clicking on signin option", true);
   login.Entermobilenumber(driver, UtilityProperty.readdatafromprorpertyfile("Mobilenumber"));
   Reporter.log("entering mobile number ", true);
   login.Clicksigninbutton(driver);
   Reporter .log("clicking on signinbutton", true);
   Thread.sleep(1000);
   Password.enterPass(UtilityProperty.readdatafromprorpertyfile("Passward"), driver);  
   Reporter .log("entering password", true);
   Thread.sleep(1000);
   Password.clicksubmit(driver);
   Reporter .log("clicking on submit button", true);
   Thread.sleep(1000);
   pop.HandlePopup(driver);
}

 @Test (priority = -1)
  public void validateUsername() throws EncryptedDocumentException, IOException 
{   
	 String actual = Home1.actualuserid(driver);
	 String expected=UtilityProperty.readdatafromprorpertyfile("Username");
	 Assert.assertEquals(actual, expected, "actual and expected useranme not matching");
	
 }
 
@Test 
public void checkavailableBalance() throws InterruptedException, IOException
{   
	 Home1.Balance();
	 UtilityProperty.screenshot(driver, null);
}
 
@Test (priority = 1)
public void releasedfunds() throws IOException, InterruptedException
{
     Home1.clickreportoption(driver);
	 Home1.clickdashboradoption(driver);
	 Dashboard.getRealizedProfitLoss(driver);
 }
 
 @AfterMethod
 public void logout() throws InterruptedException
 { 
     Home1.logout();
 }

 @AfterClass
 public void close()
 {
	 signin1.closebrowser(driver);
	 Reporter.log("closing browser", true);
 }
 
}

