import Actions.MobileActions;
import Pages.*;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.AssertJUnit.assertEquals;

public class Tests {

    WebDriver driver;
    //MobileActions mobileActions;
    HomePage homePage ;
    GraphicsPage graphicsPage;
    RadioGroupPage radioGroupPage;
    Accessibilty_Node_Query_Page accessibilty_node_query_page;
    @BeforeMethod
    public void setupDevice() throws MalformedURLException {
        String AppName = System.getProperty("user.dir") + "\\src\\test\\resources\\TestDataFiles\\ApiDemos-debug.apk";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "Demo");
        caps.setCapability("appium:app", AppName);
        caps.setCapability("appium:platformVersion", "11");
        caps.setCapability("appium:automationName", "UiAutomator2");
        driver = new AndroidDriver(new URL("http://localhost:4723/"), caps);
        homePage = new HomePage(driver);
        graphicsPage = new GraphicsPage(driver);
        //mobileActions = new MobileActions(driver);
        radioGroupPage = new RadioGroupPage(driver);
        accessibilty_node_query_page = new Accessibilty_Node_Query_Page(driver);
    }


    @Test
    public void testyping()
    {
        homePage.clickApp().clickActivity().clickCustom()
                .setTextField("Appium");
        CustomPage customPage = new CustomPage(driver);
        customPage.clickButton();

        assertEquals("Appium",customPage.getLeftText());

    }
@Test
    public void testCheckBox(){
      String getChecked=  homePage.clickOnAccessibilty2()
                .clickOnAccessibilty_Node_Query_Btn().getChecked();
        accessibilty_node_query_page.ClickOnCheckBox_Nap();
    Assert.assertEquals(getChecked, "true");

}
@Test
    public void testScrolling(){
        String getGraphicsScaleToFitText = homePage.clickGraphics().ScrollDownScaleToFit().getScaleToFitText();
        graphicsPage.clickScaleToFitPage().getGraphicsScaleToFitText();
        Assert.assertEquals(getGraphicsScaleToFitText,"ScaleToFit");

}
@Test
public void testswip(){
        homePage.clickGraphics().ScrollDownToVerticesBtn().clickOnVertices().SwipeLeftPhoto().SwipeRightPhoto();


}
@Test
    public void testRadio(){
        String getDinnerText = homePage.clickOnViews().ScrollDownToRadioGroup().ClickOnRadioGroup().GetDinnerText();
        Assert.assertEquals(getDinnerText,"Dinner");
        radioGroupPage.ClickOnDinner();
}
    @AfterMethod
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }}
