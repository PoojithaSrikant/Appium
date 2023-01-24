package Pkg_01;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Native {
	
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void bt() throws MalformedURLException {
 DesiredCapabilities dc = new DesiredCapabilities();
 dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pooji");
 dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.example.android.apis");
 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.example.android.apis.ApiDemos");
 driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	}
	
	@Test
	public void Calculator() throws InterruptedException {
		 driver.findElement(MobileBy.id("com.android.calculator2:id/digit_5")).click();
		 driver.findElement(MobileBy.id("com.android.calculator2:id/digit_4")).click();
		 driver.findElement(MobileBy.AccessibilityId("plus")).click();
		 driver.findElement(MobileBy.id("com.android.calculator2:id/digit_5")).click();
		 driver.findElement(MobileBy.id("com.android.calculator2:id/digit_3")).click();
		 driver.findElement(MobileBy.AccessibilityId("equals")).click();
		 Thread.sleep(2000);
		 driver.findElement(MobileBy.AccessibilityId("clear")).click();
		 driver.navigate().back();//to go back
		// Thread.sleep(1000);
		 driver.findElement(MobileBy.AccessibilityId("Phone")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(MobileBy.AccessibilityId("Call History tab.")).click();

		 driver.findElement(MobileBy.AccessibilityId("key pad")).click();
		 Thread.sleep(1000);
		 WebElement wb=driver.findElement(MobileBy.AccessibilityId("0,+"));
	     TouchAction act=new TouchAction(driver);// long press we use this method
		 act.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(wb)).withDuration(Duration.ofSeconds(2))).release().perform();
		 Thread.sleep(1000);
		 driver.findElement(MobileBy.AccessibilityId("6,MNO")).click();
		 driver.findElement(MobileBy.AccessibilityId("3,DEF")).click();
		 driver.findElement(MobileBy.AccessibilityId("6,MNO")).click();
		 driver.findElement(MobileBy.AccessibilityId("0,+")).click();
		 driver.findElement(MobileBy.AccessibilityId("4,GHI")).click();
		 driver.findElement(MobileBy.AccessibilityId("dial")).click();
		
	}
}










	

