package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
  // WebDriver is an interface
	public static WebDriver driver;
	
	
	public static void initDriver() {
	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\dandu\\June22_Selenium\\Cucumber\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
	}
	public void clickOnButton(WebElement ele) {
		try {
		  ele.click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

 public void takeScreenshot(WebDriver driver) {
	 
	 TakesScreenshot ts = (TakesScreenshot)driver;
	File sourceFile =ts.getScreenshotAs(OutputType.FILE);
	
	String currentDirectory = System.getProperty("user.dir");
	
	SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
	Date date = new Date();
	String label = formatter.format(date);
	
	try {
		FileUtils.copyFile(sourceFile, new File(currentDirectory + "/screenshot/" + label + ".png"));
	}
	catch (IOException e) {
		e.printStackTrace();
	}
	
 }




}


