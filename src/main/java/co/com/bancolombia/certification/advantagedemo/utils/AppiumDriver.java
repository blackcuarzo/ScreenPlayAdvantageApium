package co.com.bancolombia.certification.advantagedemo.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.net.MalformedURLException;

public class AppiumDriver {
  public static AndroidDriver app() throws MalformedURLException{
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("deviceName","emulator-5554");
    caps.setCapability("automationName","uiautomator2");
    caps.setCapability("platformName","Android");
    caps.setCapability("platformVersion","11.0");
    caps.setCapability("NoReset",true);
    caps.setCapability("appPackage","com.Advantage.aShopping");
    caps.setCapability("appActivity","com.Advantage.aShopping.SplashActivity");
    caps.setCapability("app","");
    AndroidDriver<AndroidElement> driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
    return driver;
  }
}
