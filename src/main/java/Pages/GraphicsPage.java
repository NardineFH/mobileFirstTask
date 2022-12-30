package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GraphicsPage {
    WebDriver driver;
    private By ScaleToFit = AppiumBy.accessibilityId("ScaleToFit");
    private  By verticesBtn = AppiumBy.accessibilityId("Vertices");
    public GraphicsPage(WebDriver driver){
    this.driver=driver;
    }
    public ScaleToFitPage clickScaleToFitPage()
    {
        driver.findElement(ScaleToFit).click();
        return new ScaleToFitPage(driver);
    }
    public verticesPage clickOnVertices(){
        driver.findElement(verticesBtn).click();
        return new verticesPage(driver);
    }
    public String getScaleToFitText()
    {
        return   driver.findElement(ScaleToFit).getText();
    }
    public GraphicsPage ScrollDownScaleToFit(){
        MobileActions.scrollDownToSpecificText("ScaleToFit" , driver);
        return this;
    }
    public GraphicsPage ScrollDownToVerticesBtn(){
        MobileActions.scrollDownToSpecificText("Vertices" , driver);
        return this;
    }
}
