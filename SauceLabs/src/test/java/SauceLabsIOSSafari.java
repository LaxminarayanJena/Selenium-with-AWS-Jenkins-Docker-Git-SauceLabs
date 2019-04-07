import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import java.net.URL;
 
public class SauceLabsIOSSafari {
 
	  public static final String USERNAME = "seleniumtesterbangalore";
	  public static final String ACCESS_KEY = "78a65011-b360-41c2-8a00-57fd852a76e5";
      public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
 
    public static void main(String[] args) throws Exception {
 
    	//https://wiki.saucelabs.com/display/DOCS/Platform+Configurator#/  
      
    	DesiredCapabilities caps = DesiredCapabilities.iphone();
    	caps.setCapability("deviceName","iPad Air 2 Simulator");
    	caps.setCapability("deviceOrientation", "portrait");
    	caps.setCapability("platformVersion","12.0");
    	caps.setCapability("platformName", "iOS");
    	caps.setCapability("browserName", "Safari");
    	caps.setCapability("name", "IOS 4th test");
    	
    	   
        WebDriver driver = new IOSDriver(new URL(URL), caps);
        driver.navigate().to("https://www.yahoo.com");
        driver.quit();
        
 
    }
}