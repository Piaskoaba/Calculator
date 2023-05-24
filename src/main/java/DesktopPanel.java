import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DesktopPanel extends BasePage {

    @FindBy(id="com.android.calculator2:id/digit_1")
    MobileElement buttonOne;
    @FindBy(id="com.android.calculator2:id/digit_2")
    MobileElement buttonTwo;
    @FindBy(id="com.android.calculator2:id/digit_3")
    MobileElement buttonThree;
    @FindBy(id="com.android.calculator2:id/digit_4")
    MobileElement buttonFour;
    @FindBy(id="com.android.calculator2:id/digit_5")
    MobileElement buttonFive;
    @FindBy(id="com.android.calculator2:id/digit_6")
    MobileElement buttonSix;
    @FindBy(id="com.android.calculator2:id/digit_7")
    MobileElement buttonSeven;
    @FindBy(id="com.android.calculator2:id/digit_8")
    MobileElement buttonEight;
    @FindBy(id="com.android.calculator2:id/digit_9")
    MobileElement buttonNine;
    @FindBy(id="com.android.calculator2:id/digit_0")
    MobileElement buttonZero;
    @FindBy(id="com.android.calculator2:id/op_add")
    MobileElement plus;

    public DesktopPanel(AndroidDriver driver) {
        super(driver);
    }

    public void clickButtonOne(){
        buttonOne.click();
    }
    public void clickButtonTwo(){
        buttonTwo.click();
    }
    public void clickButtonThree(){
        buttonFour.click();
    }
    public void clickButtonFour(){
        buttonFive.click();
    }
    public void clickButtonFive(){
        buttonFive.click();
    }
    public void clickButtonSix(){
        buttonSix.click();
    }
    public void clickButtonSeven(){
        buttonSeven.click();
    }
    public void clickButtonEight(){
        buttonEight.click();
    }
    public void clickButtonNine(){
        buttonNine.click();
    }
    public void clickButtonZero(){
        buttonZero.click();
    }
    public void clickButtonPlus(){
        plus.click();
    }


}
