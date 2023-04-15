package neoBasepackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import neoStoxUtility.UtilityProperty;


public class Base1
{                                                           
	 protected static WebDriver driver;      // declared globally because where we initialize the browser we have to use that driver olny to for whole execution otherwise if we use different diff. driver it will show null pointer . 
	   public void LaunchBrowser() throws InterruptedException, IOException 
	   {
		   System.setProperty("webdriver.chrome.driver", "D:\\PratikshaVelocity\\chromedriver.exe");
	       ChromeOptions options=new ChromeOptions();
	       options.addArguments("--remote-allow-origins=*");
	        driver=new ChromeDriver(options);
		    driver.manage().window().maximize();
			driver.get(UtilityProperty.readdatafromprorpertyfile("URL"));
	        Reporter.log("launching browswer", true);
	       Thread.sleep(1000);
	   }

}
