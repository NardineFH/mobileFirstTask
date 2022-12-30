package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityPage {
    WebDriver driver;
    private By customBtn = AppiumBy.accessibilityId("Custom Title");
    public ActivityPage(WebDriver driver) {
        this.driver = driver;
    }

    public CustomPage clickCustom()
    {
        driver.findElement(customBtn).click();
        return new CustomPage(driver);
    }
}
