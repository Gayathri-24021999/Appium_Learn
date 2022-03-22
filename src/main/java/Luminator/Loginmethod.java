package Luminator;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class Loginmethod extends Login {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver driver = capabilities();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//android.widget.EditText[@text='User Email]")));

		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.EditText[@text='User Email]")).sendKeys("developer@schnellenergy.com");
		driver.findElement(By.id("//android.widget.EditText[@text='Password']")).sendKeys("schnell");
		driver.findElement(By.className("android.widget.Button")).click();


	}

}
