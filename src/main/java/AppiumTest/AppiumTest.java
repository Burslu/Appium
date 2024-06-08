package AppiumTest;

import BaseTestDrivers.Drivers;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

public class AppiumTest extends Drivers{


    @Test
    public void appiumUıFirstTest() throws MalformedURLException {
        // Actual automation
        //Xpath , İd, classname , accessiblytId,AndroidUıAutomator

        driver.findElement(AppiumBy.accessibilityId("Preference")).click();

        //tagName[@attribute='value']


        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();

        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle,"WiFi settings");

        driver.findElement(By.id("android:id/edit")).sendKeys("BerkayUSLU");






    }










}
