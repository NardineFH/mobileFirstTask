package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accessibilty_Node_Query_Page {
    WebDriver driver;
    private By CheckBox_Nap = new By.ByXPath("\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.CheckBox");
    private By Checked = new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.CheckBox");

public Accessibilty_Node_Query_Page(WebDriver driver){
this.driver= driver;
}
    public void ClickOnCheckBox_Nap() {
        driver.findElement(Checked).click();
    }

    public String getChecked()
    {

        return   driver.findElement(Checked).getAttribute("checked");
    }
}