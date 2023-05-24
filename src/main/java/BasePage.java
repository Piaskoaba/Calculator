import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class BasePage {
    protected AndroidDriver driver;
    protected WebDriverWait webDriverWait;
    private static final int TIMEOUT = 10;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, TIMEOUT);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
