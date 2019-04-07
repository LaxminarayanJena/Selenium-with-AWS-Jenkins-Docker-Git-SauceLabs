import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
 
public class SauceLabsWeb {
    private WebDriver driver;
 
    @Test
    public void Windows() throws MalformedURLException {
 
        String sauceUserName = "seleniumtesterbangalore";
        String sauceAccessKey = "78a65011-b360-41c2-8a00-57fd852a76e5";
 
        DesiredCapabilities capabilities = new DesiredCapabilities();
 
        capabilities.setCapability("username", sauceUserName);
        capabilities.setCapability("accessKey", sauceAccessKey);
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("platform", "Windows 10");
        capabilities.setCapability("version", "70");
        capabilities.setCapability("build", "SampleTest");
        capabilities.setCapability("name", "5th test");
 
       
        /** If you're accessing the EU data center, use the following endpoint:.
         * https://ondemand.eu-central-1.saucelabs.com/wd/hub
         * */
        driver = new RemoteWebDriver(new URL("http://ondemand.saucelabs.com:80/wd/hub"), capabilities);
 
        driver.navigate().to("https://www.yahoo.com");
        driver.quit();
    }
}