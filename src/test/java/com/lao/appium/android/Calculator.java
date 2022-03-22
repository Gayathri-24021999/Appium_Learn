package com.lao.appium.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;



public class Calculator {
	public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Pixel 2 XL API30");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11.0");
		capabilities.setCapability("udid", "MNCQZL658HMFBMLZ");
		capabilities.setCapability("packageName", "com.coloros.calculator");
		capabilities.setCapability("appActivity", "oppo.permission.OPPO_COMPONENT_SAFE");

		/*
		 * capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 * capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		 * capabilities.setCapability(MobileCapabilityType.UDID, "MNCQZL658HMFBMLZ");
		 * capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO A54");
		 */

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		driver= new AndroidDriver(url,capabilities);
        


	}

}
