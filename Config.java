package Pkg_01;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;


public class Config {
	
public static AndroidDriver<AndroidElement> Cap() throws MalformedURLException {
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pooji");   
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);  
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore"); //package name
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.androidsample.generalstore.MainActivity" );  //activity name
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		return driver;

	}

}
  
 


