package NeoStoxPom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.UtilityProperty;

public class DashboardPOMExcel2 
    {@FindBy(xpath = "(//div[@id='div_todaysummary']//span)[7]  ")private WebElement RealizedProfitLoss;


  public DashboardPOMExcel2(WebDriver driver)
  {
	PageFactory.initElements(driver,this);
  }

public void getRealizedProfitLoss(WebDriver driver) throws IOException, InterruptedException
{ 
	UtilityProperty.wait(driver, 1000);
	String ValueofRealizedProfitLoss = RealizedProfitLoss.getText();
	UtilityProperty.screenshot(driver, "availableRealizedProfir/lossImage");
	Reporter.log("available RealizedProfit/ Loss is "+ValueofRealizedProfitLoss, true );
}

}
