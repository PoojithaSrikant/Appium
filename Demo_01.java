package Pkg_01;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo_01
{
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void BT() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pooji");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	    dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	    dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"C:\\Users\\91998\\eclipse-workspace\\Appium\\chromedriver.exe");
	    driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	    
	}
	@Test
	public void tc() throws InterruptedException
	{
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("OrangeHRM Demo");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("OrangeHRM Demo")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.className("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
 
 
	}
	
	
	
	

}
