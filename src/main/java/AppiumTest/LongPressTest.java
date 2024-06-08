package AppiumTest;

import BaseTestDrivers.Drivers;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LongPressTest extends Drivers {


    @Test
    public void longPressTest() throws MalformedURLException, InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();

        // https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md
        // This is adrees for apiium longclick double click scroll pinc or etc.

        WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text=\"People Names\"]"));
        longPress(ele);
        String menuText = driver.findElement(By.id("android:id/title")).getText();
        Assert.assertEquals(menuText,"Sample menu");





    }

}
