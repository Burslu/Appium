package BaseTestDrivers;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;
public class Drivers {

    public AppiumDriverLocalService serviceBuilder;
    public AndroidDriver driver;

    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException{

            serviceBuilder = AppiumDriverLocalService.buildDefaultService();
            serviceBuilder.start();
            DesiredCapabilities desiredCapabilities = getDesiredCapabilities();
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), desiredCapabilities);

    }
    public static DesiredCapabilities getDesiredCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("automationName","uiautomator2");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "berkay");
        desiredCapabilities.setCapability("app", "C:\\Users\\iberk\\IdeaProjects\\AppiumTestProject21.05.2024\\src\\main\\java\\resources\\ApiDemos-debug.apk");
        desiredCapabilities.setCapability("platformVersion", "14.0");

        return desiredCapabilities;

    }


    public void longPress(WebElement ele){
        JavascriptException JavaScript
                = (JavascriptException) driver.executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration", 2500));
        String menuText = driver.findElement(By.id("android:id/title")).getText();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
        serviceBuilder.stop();

    }
}
