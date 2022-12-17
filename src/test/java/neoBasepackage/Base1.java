package neoBasepackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;


public class Base1
{                                                           
	 protected static  WebDriver  driver;        // declared globally because where we initialize the browser we have to use that driver olny to for whole execution otherwise if we use different diff. driver it will show null pointer . 
   public void LaunchBrowser() throws InterruptedException, IOException 
   {
	   System.setProperty("webdriver.chrome.driver", "D:\\PratikshaVelocity\\chromedriver.exe");
        driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(neoStoxUtility.UtilityProperty.readdatafromprorpertyfile("URL"));
        Reporter.log("lanching browswer", true);
       Thread.sleep(1000);
   }

}
