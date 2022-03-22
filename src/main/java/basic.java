import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import io.appium.java_client.android.AndroidDriver;

public class basic extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver driver = capabilities();
		driver.findElement(By.id("com.schnell.xserp:id/userEmail")).sendKeys("qa.schnell@gmail.com");
		driver.findElement(By.id("com.schnell.xserp:id/password")).sendKeys("qaadmin");
		driver.findElement(By.id("com.schnell.xserp:id/signin")).click();
		driver.findElement(By.id("com.schnell.xserp:id/salesIcon")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "com.schnell.xserp:id/salesIcon")));
		 */
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='INV/OA LOOKUP']")).click();
		driver.findElement(By.id("com.schnell.xserp:id/fromDate")).click();
		driver.findElement(By.id("android:id/prev")).click();
		driver.findElement(By.id("android:id/prev")).click();
		driver.findElement(By.id("android:id/prev")).click();
		driver.findElement(By.xpath("//android.view.View[@text='1']")).click();
		driver.findElement(By.id("com.schnell.xserp:id/searchButton")).click();
		


	}
}
