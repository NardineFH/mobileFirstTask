package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accessibilty2 {
    WebDriver driver;
    private  By Accessibilty_Node_Query_Btn = AppiumBy.accessibilityId("Accessibility Node Querying");

public Accessibilty2(WebDriver driver){
    this.driver = driver;
}
    public Accessibilty_Node_Query_Page clickOnAccessibilty_Node_Query_Btn()

    {
        driver.findElement(Accessibilty_Node_Query_Btn).click();
        return new Accessibilty_Node_Query_Page(driver) ;
    }


}