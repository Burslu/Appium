package AppiumTest;

import BaseTestDrivers.Drivers;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class ScrollDemo extends Drivers {

@Test
    public void scroll() throws InterruptedException {


        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));// scroll için Ia android atomatır kullanılmaktar .(WebWiev yazısını görenne kadar scroll yapmaya devam etmektedir. )
        Thread.sleep(2000);





    }


}

