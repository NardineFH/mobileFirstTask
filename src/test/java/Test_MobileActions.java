public class Test_MobileActions {
//    WebDriver driver;
//    HomePage homePage = new HomePage(driver);
//    AccessibiltyPage accessibiltyPage = new AccessibiltyPage(driver);
//    @BeforeMethod
//    public void setupDevice() throws MalformedURLException {
//        String AppName = System.getProperty("user.dir") + "\\src\\test\\resources\\TestDataFiles\\ApiDemos-debug.apk";
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platformName", "Android");
//        caps.setCapability("appium:deviceName", "Android SDK built for x86");
//        caps.setCapability("appium:app", AppName);
//        caps.setCapability("appium:platformVersion", "11");
//        caps.setCapability("appium:automationName", "UiAutomator2");
//        driver = new AndroidDriver(new URL("http://localhost:4723/"), caps);
//        new HomePage(driver);
//    }
//
//    @Test
//    public void testClickAction() {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(new AppiumBy.ByAccessibilityId("Access'ibility")).click();
//        Assert.assertEquals(driver.findElement(new AppiumBy.ByAccessibilityId("Accessibility Node Provider")).getText(), "Accessibility Node Provider");
//    }
//
//    @Test
//    public void testTyping() {
//
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//driver.findElement(new AppiumBy.ByAccessibilityId("App")).click();
//
//driver.findElement(new AppiumBy.ByAccessibilityId("activity")).click();
//driver.findElement(new AppiumBy.ByAccessibilityId("custom title")).sendKeys("Appium");
//Assert.assertEquals(driver.findElement(new AppiumBy.ByAccessibilityId("custum title")).getText(),"Appium");
//
//        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
//    }
//
//    @Test
//    public void testCheckBox() {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//         homePage.ClickOnAccessibiltyBTN();
//         accessibiltyPage.ClickOnAccsesibilty_Node_Querying();
//
//        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
//    }
//
//    @Test
//    public void testScrolling() {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//(
//        homePage.ClickOnAccessibiltyBTN().ClickOnGraphics().ClickOnScrollToFit());
//        MobileActions.scrollDownToSpecificText("ScaleToFit");
//        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
//    }
//
//    @Test
//    public void testSwiping() {
//        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
//    }
//
//    @Test
//    public void testRadioButton() {
//        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

}
