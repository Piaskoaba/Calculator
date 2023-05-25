import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Tests {
    protected static AndroidDriver driver;

    @BeforeMethod
    public void runMessage() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emu");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void mathOperation(){
        DesktopPanel desktopPanel = new DesktopPanel(driver);
        ServiceClass serviceClass = new ServiceClass(driver);
        Assert.assertTrue(desktopPanel.isFormulaFieldVisible(), "Formula field is not visible");
        desktopPanel.clickRandomNumber(serviceClass.randomNumber());
        desktopPanel.actionOnCalculator('*');
        desktopPanel.clickRandomNumber(serviceClass.randomNumber());
        desktopPanel.clickEqualButton();
        System.out.println("Result equals: " + desktopPanel.resultIs());
    }
}
