import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class ServiceClass {
    AndroidDriver driver;
    private static final int TIMEOUT = 10;
    protected WebDriverWait webDriverWait;

    public ServiceClass(AndroidDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, TIMEOUT);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public int randomNumber() {
        int random_int = (int) Math.floor(Math.random() * (9 - 0 + 1) + 0);
        return random_int;
    }
}