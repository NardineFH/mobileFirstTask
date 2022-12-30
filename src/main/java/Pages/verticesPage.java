package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class verticesPage {
WebDriver driver;
private By Photo = new By.ByXPath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]");
    public verticesPage(WebDriver driver) {
        this.driver=driver;
    }
public verticesPage SwipeLeftPhoto(){
    MobileActions.swipeLeftOnElement(Photo,driver);
    return this ;
}
    public verticesPage SwipeRightPhoto(){
        MobileActions.swipeRightOnElement(Photo,driver);
        return this;
    }}
