import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
 
public class SauceLabsAndroid {
	
	
  public static final String USERNAME = "seleniumtesterbangalore";
  public static final String ACCESS_KEY = "78a65011-b360-41c2-8a00-57fd852a76e5";
  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
 
  public static void main(String[] args) throws Exception {
 
  //https://wiki.saucelabs.com/display/DOCS/Platform+Configurator#/  

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("deviceName","Samsung Galaxy S6 GoogleAPI Emulator");
    capabilities.setCapability("platformVersion", "7.0");
    capabilities.setCapability("app", "http://saucelabs.com/example_files/ContactManager.apk");
    capabilities.setCapability("browserName", "");
    capabilities.setCapability("deviceOrientation", "portrait");
    capabilities.setCapability("appiumVersion", "1.9.1");
    capabilities.setCapability("name", "Android 1st test");
    
    WebDriver driver = new AndroidDriver<>(new URL(URL), capabilities);
 
    /**
     * Test Actions here...
     */
 
    driver.quit();
  }
}