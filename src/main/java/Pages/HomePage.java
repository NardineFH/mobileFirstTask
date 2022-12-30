package Pages;

import com.beust.ah.A;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By App = AppiumBy.accessibilityId("App");
    private By Accessibilty2 = AppiumBy.accessibilityId("Access'ibility");
    private By Graphics = AppiumBy.accessibilityId("Graphics");

    private By Views = AppiumBy.accessibilityId("Views");
    public AppPage clickApp()
    {
        driver.findElement(App).click();
        return new AppPage(driver);
    }
    public Accessibilty2 clickOnAccessibilty2()
    {
        driver.findElement(Accessibilty2).click();
        return new Accessibilty2(driver);
    }
    public GraphicsPage clickGraphics()
    {
        driver.findElement(Graphics).click();
        return new GraphicsPage(driver);
    }
    public ViewsPage clickOnViews()
    {
        driver.findElement(Views).click();
        return new ViewsPage(driver);
    }
   /* By AccessibiltyBTN = AppiumBy.accessibilityId("Access'ibility");
    By Graphics = AppiumBy.accessibilityId("Graphics");
    By CLICK_ACCESSIBILTY_Node_Provider =AppiumBy.accessibilityId("Accessibility Node Provider");

    private By AccessibiltyPage = new AppiumBy.ByAccessibilityId("Access'ibility");



    public AccessibiltyPage ClickOnAccessibiltyBTN() {
        driver.findElement(AccessibiltyBTN).click();
        return new AccessibiltyPage(driver);

    }

    public AccessibiltyPage ClickOnGraphics() {
        driver.findElement(Graphics).click();
        return new AccessibiltyPage(driver);
    }
    public  AccessibiltyPage ClickOnScaleToFit() {
        driver.findElement(Graphics).click();
        return new AccessibiltyPage(driver);

    }*/

    }


