package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioGroupPage {
    WebDriver driver;
    private By Dinner = AppiumBy.accessibilityId("Dinner");
    public RadioGroupPage(WebDriver driver) {
        this.driver = driver;
    }
    public String GetDinnerText()
    {
        return   driver.findElement(Dinner).getText();
    }
    public void ClickOnDinner(){
        driver.findElement(Dinner).click();
    }
}

