package neoBasepackage;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxUtility.UtilityProperty;


	public class  Listener extends Base1  implements ITestListener   // extends base for webdriver , dont parameterized here
	{
	   public void onTestFailure(ITestResult result) 
	    {
		 String tcname = result.getName();
		 Reporter.log("Tc "+ tcname +" failed please check...", true);
		 
		    try
	 	    {
			    UtilityProperty.screenshot( driver, tcname);   // need surrond to solve the error , & for SS needed driver only from base class tha y extends baseclass
	   	    }
		    catch (IOException e)
		   {
		       	e.printStackTrace();
	    	 }
		}
		
	   public void onTestSkipped(ITestResult result)
	    {
			Reporter.log("Tc " + result.getName()+ " skipped please check..", true);
		}
	   
	   public void onTestSuccess(ITestResult result) 
	   {
		  Reporter.log("Tc "+result.getName()+" passed successefully", true); 
	   }
	}

