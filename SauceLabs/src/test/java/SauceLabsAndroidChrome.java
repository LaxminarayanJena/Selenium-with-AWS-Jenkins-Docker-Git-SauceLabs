import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;
 
public class SauceLabsAndroidChrome {
	
	
  public static final String USERNAME = "seleniumtesterbangalore";
  public static final String ACCESS_KEY = "78a65011-b360-41c2-8a00-57fd852a76e5";
  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
 
  public static void main(String[] args) throws Exception {
 
  //https://wiki.saucelabs.com/display/DOCS/Platform+Configurator#/  

	  DesiredCapabilities caps = DesiredCapabilities.android();
	  caps.setCapability("appiumVersion", "1.9.1");
	  caps.setCapability("deviceName","Samsung Galaxy S6 GoogleAPI Emulator");
	  caps.setCapability("deviceOrientation", "portrait");
	  caps.setCapability("browserName", "Chrome");
	  caps.setCapability("platformVersion", "7.0");
	  caps.setCapability("platformName","Android");
      caps.setCapability("name", "AndroidChrome 1st test");
    
    WebDriver driver = new AndroidDriver<>(new URL(URL), caps);
 
    driver.get("https://www.wikipedia.org/");
	WebElement dropdown = driver.findElement(By.xpath(".//*[@id='searchLanguage']"));
	Select select = new Select(dropdown);
	select.selectByValue("hi");
	Thread.sleep(3000);
	select.selectByVisibleText("Deutsch");
	// select.getOptions()

	List<WebElement> values = driver.findElements(By.tagName("option"));
	System.out.println("no of drop down values are: " + values.size());
	System.out.println(values.get(0));
	// [[ChromeDriver: chrome on XP (fa68d6dc7f2ef5512c92f417a77295c3)] ->
	// tag name: option]

	System.out.println(values.get(1));
	System.out.println(values.get(0).getAttribute("lang"));
	// ar

	for (int i = 1; i < values.size(); i++) {
		System.out.println(values.get(i).getText());
	}
 
    driver.quit();
  }
}