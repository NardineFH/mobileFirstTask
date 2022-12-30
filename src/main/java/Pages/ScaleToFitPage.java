package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.PublicKey;

public class ScaleToFitPage {
    WebDriver driver;
    private By GraphicsScaleToFitText = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");
    public ScaleToFitPage(WebDriver driver) {
    this.driver=driver;}

    public String getGraphicsScaleToFitText()
    {
        return   driver.findElement(GraphicsScaleToFitText).getText();
    }
}