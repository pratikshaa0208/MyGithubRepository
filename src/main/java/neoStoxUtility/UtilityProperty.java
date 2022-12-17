package neoStoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityProperty 
{
	
public static String readdatafromprorpertyfile(String key ) throws IOException
{ 
	// create object of properties class provided by java util
	Properties  prop=new Properties();
	
	//create object of fileinputstream and pass property  file's path which we created as a parameter
	FileInputStream myfile=new FileInputStream("C:\\Users\\mahes\\eclipse-workspace\\ProjectName\\Neostox.properties");
	prop.load(myfile);
	
	String value = prop.getProperty(key);
	Reporter.log(" reading "+key+" from property file", true);
	
	return value;
}
	public static void screenshot(WebDriver driver, String name) throws IOException
	{
	 wait(driver,500);
	 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File destination=new File("D:\\PratikshaVelocity\\screenshottakenbyselenium\\"+name+".jpg");
	 FileHandler.copy(source, destination);
	 Reporter.log("taking screenshot", true);
	}

		
	public static void scrollintoview(WebDriver driver, WebElement element)
	{
		wait(driver, 500);
	    JavascriptExecutor jr = (JavascriptExecutor)driver;
		jr.executeScript("arguments[0].scrollIntoview(true)" ,element);
		Reporter.log("scrolling into view", true);
	}
	
	public static void wait(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
	
	
}


