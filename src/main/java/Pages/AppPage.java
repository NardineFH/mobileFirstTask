package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class AppPage {
    WebDriver driver;

    private By activityBtn = AppiumBy.accessibilityId("Activity");

    public AppPage(WebDriver driver) {
        this.driver = driver;
    }

    public ActivityPage clickActivity()
    {   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(activityBtn).click();
        return new ActivityPage(driver);
    }
}
