import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {


	public static AndroidDriver capabilities() throws MalformedURLException
	{
	// TODO Auto-generated method stub
		File appDir = new File("src");
		File app = new File(appDir, "xserp-qa-release (5).apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 XL API30");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://192.168.2.60:4723/wd/hub"),cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.findElement(By.id("com.schnell.xserp:id/next")).click();
		driver.findElement(By.id("com.schnell.xserp:id/next")).click();
		driver.findElement(By.id("com.schnell.xserp:id/next")).click();
		driver.findElement(By.id("com.schnell.xserp:id/next")).click();
		driver.findElement(By.id("com.schnell.xserp:id/next")).click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		
		return driver;
		

	}

}
