package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomPage {
    WebDriver driver;
    By textField = By.xpath("//android.widget.EditText[@content-desc=\"Left is best\"]");
    By Button = AppiumBy.accessibilityId("Change Left");
    By leftText = By.id("io.appium.android.apis:id/left_text");
    public CustomPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setTextField(String text)
    {
        driver.findElement(textField).clear();
        driver.findElement(textField).sendKeys(text);
    }

    public void clickButton()
    {
        driver.findElement(Button).click();
    }

    public String getLeftText()
    {
      return   driver.findElement(leftText).getText();
    }
}
