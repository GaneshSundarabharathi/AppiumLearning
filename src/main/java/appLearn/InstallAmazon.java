package appLearn;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class InstallAmazon {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "Ganesh");
		dc.setCapability("automationName", "UiAutomator2");
//		dc.setCapability("app", System.getProperty("user.dir")+"/apks/Amazon.apk");
		dc.setCapability("appPackage", "com.amazon.mShop.android.shopping");
		dc.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		AppiumDriver driver= new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("rajkumar@testleaf.com");
//		driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[2]")).sendKeys("Leaf@123");
//		driver.findElement(AppiumBy.className("android.widget.Button")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
