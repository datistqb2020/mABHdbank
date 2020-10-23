package android.base;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    protected static AndroidDriver<?> androidDriver;
    protected static WebDriver driver;
    protected static Properties prop;
    private File file = new File("config/test.properties");

    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(file);
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initWeb() {
        String browserType = prop.getProperty("browser.type");
        switch (browserType.toUpperCase()) {
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver_2.38.exe");
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void initAndroid() {
        String fileName = "app-release.apk";
//        File appRelease = new File("D:\\Android SDK\\platforms\\" + fileName);
        File appRelease = new File(System.getProperty("user.dir") + "\\drivers\\" + fileName);
        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability("app", appRelease.getAbsolutePath());
        cap.setCapability("app", "D:\\DatHdbank\\documents\\UAT\\mABHDBank\\drivers\\app-release.apk");
        cap.setCapability("platformName", "android");
        cap.setCapability("deviceName", "R58N339HS3A");
        cap.setCapability("appPackage", "com.vnpay.hdbank");
        cap.setCapability("appActivity", "com.vnpay.hdbank.activity.SplashActivity");
        cap.setCapability("platformVersion", "10.0");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300);
        try {
            androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        androidDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static void initUninstallAndroid() {
        String fileName = "app-release.apk";
//        File appRelease = new File("D:\\Android SDK\\platforms\\" + fileName);
        File appRelease = new File(System.getProperty("user.dir") + "\\drivers\\" + fileName);
        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability("app", appRelease.getAbsolutePath());
        cap.setCapability("app", "D:\\DatHdbank\\documents\\UAT\\mABHDBank\\drivers\\app-release.apk");
        cap.setCapability("platformName", "android");
        cap.setCapability("deviceName", "R58N339HS3A");
        cap.setCapability("appPackage", "com.vnpay.hdbank");
        cap.setCapability("appActivity", "com.vnpay.hdbank.activity.SplashActivity");
        cap.setCapability("platformVersion", "10.0");
        // prevent Android: don’t uninstall app before new session
        cap.setCapability("noReset", "true");
        try {
            androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        androidDriver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    }

    public void waitElement(By element) throws Exception {
        WebDriverWait wait = new WebDriverWait(androidDriver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        Thread.sleep(1000);
    }

    public void waitElementOnWeb(By webElement) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(webElement));
        Thread.sleep(1000);
    }

    public void scrollToUp() {
        int x = androidDriver.manage().window().getSize().width / 2;
        int start_y = (int) (androidDriver.manage().window().getSize().height * 0.8);
        int end_y = (int) (androidDriver.manage().window().getSize().height * 0.2);
        TouchAction dragNDrop = new TouchAction(androidDriver)
                .press(PointOption.point(x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(x, end_y))
                .release();
        dragNDrop.perform();
    }

    public void scrollUpHalf() {
        int x = androidDriver.manage().window().getSize().width / 2;
        int start_y = (int) (androidDriver.manage().window().getSize().height * 0.6);
        int end_y = (int) (androidDriver.manage().window().getSize().height * 0.4);
        TouchAction dragNDrop = new TouchAction(androidDriver)
                .press(PointOption.point(x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(x, end_y))
                .release();
        dragNDrop.perform();
    }

    public void scrollValuePicker(){
//        int x = 509;
//        int start_y = 1894;
//        int end_y = 1219;

        int x = androidDriver.manage().window().getSize().width / 2;
        int start_y = (int) (androidDriver.manage().window().getSize().height * 0.6);
        int end_y = (int) (androidDriver.manage().window().getSize().height * 0.55);
        TouchAction dragNDrop = new TouchAction(androidDriver)
                .press(PointOption.point(x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(x, end_y))
                .release();
        dragNDrop.perform();
    }

    public void scrollToDown() {
        int x = androidDriver.manage().window().getSize().width / 2;
        int start_y = (int) (androidDriver.manage().window().getSize().height * 0.20);
        int end_y = (int) (androidDriver.manage().window().getSize().height * 0.80);
        TouchAction dragNDrop = new TouchAction(androidDriver)
                .press(PointOption.point(x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(x, end_y))
                .release();
        dragNDrop.perform();
    }

    public void swipeToLeft() {
        Dimension size = androidDriver.manage().window().getSize();
        int startY = (int) (size.height / 2);
        int startX = (int) (size.width * 0.80);
        int endX = (int) (size.width * 0.1);
        TouchAction dragNDrop = new TouchAction(androidDriver)
                .press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(endX, startY))
                .release();
        dragNDrop.perform();
    }

    public void swipeToLeft(int point) {
        Dimension size = androidDriver.manage().window().getSize();
        int startY = point;
        int startX = (int) (size.width * 0.70);
        int endX = (int) (size.width * 0.2);
        TouchAction dragNDrop = new TouchAction(androidDriver)
                .press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(endX, startY))
                .release();
        dragNDrop.perform();
    }

    public void swipeToRight() {
        Dimension size = androidDriver.manage().window().getSize();
        int startY = (int) (size.height / 2);
        int startX = (int) (size.width * 0.05);
        int endX = (int) (size.width * 0.90);
        TouchAction dragNDrop = new TouchAction(androidDriver)
                .press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(endX, startY))
                .release();
        dragNDrop.perform();
    }

    public void verticalScroll()
    {
        Dimension size = androidDriver.manage().window().getSize();
        int y_start=(int)(size.height*0.6);
        int y_end=(int)(size.height*0.4);
        int x= size.width / 2;
        TouchAction dragNDrop = new TouchAction(androidDriver)
                .press(PointOption.point(x -100 , y_start)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(10000)))
                .moveTo(PointOption.point(x -100, y_end))
                .release();
        dragNDrop.perform();
    }
}
