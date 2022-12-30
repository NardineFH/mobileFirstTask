package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewsPage {
    WebDriver driver;

    private By RadioGroup= AppiumBy.accessibilityId("Radio Group");

    public ViewsPage(WebDriver driver) {
        this.driver = driver;
    }
    public RadioGroupPage ClickOnRadioGroup(){
        driver.findElement(RadioGroup).click();
        return new RadioGroupPage(driver);
    }

    public ViewsPage ScrollDownToRadioGroup(){
        MobileActions.scrollDownToSpecificText("Radio Group" , driver);
        return this;
    }
}
