import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class DesktopPanel extends BasePage {


    Wait wait = new WebDriverWait(driver, 10);
    @FindBy(id = "com.android.calculator2:id/digit_1")
    MobileElement buttonOne;
    @FindBy(id = "com.android.calculator2:id/digit_2")
    MobileElement buttonTwo;
    @FindBy(id = "com.android.calculator2:id/digit_3")
    MobileElement buttonThree;
    @FindBy(id = "com.android.calculator2:id/digit_4")
    MobileElement buttonFour;
    @FindBy(id = "com.android.calculator2:id/digit_5")
    MobileElement buttonFive;
    @FindBy(id = "com.android.calculator2:id/digit_6")
    MobileElement buttonSix;
    @FindBy(id = "com.android.calculator2:id/digit_7")
    MobileElement buttonSeven;
    @FindBy(id = "com.android.calculator2:id/digit_8")
    MobileElement buttonEight;
    @FindBy(id = "com.android.calculator2:id/digit_9")
    MobileElement buttonNine;
    @FindBy(id = "com.android.calculator2:id/digit_0")
    MobileElement buttonZero;
    @FindBy(id = "com.android.calculator2:id/op_add")
    MobileElement plusButton;
    @FindBy(id = "com.android.calculator2:id/eq")
    MobileElement equalButton;
    @FindBy(id = "com.android.calculator2:id/op_sub")
    MobileElement subtractionButton;
    @FindBy(id = "com.android.calculator2:id/op_div")
    MobileElement divisionButton;
    @FindBy(id = "com.android.calculator2:id/op_mul")
    MobileElement multiplicationButton;
    @FindBy(id = "com.android.calculator2:id/formula")
    MobileElement formulaField;
    @FindBy(id = "com.android.calculator2:id/result")
    MobileElement resultField;
    @FindBy(id = "com.android.calculator2:id/digit_")
    MobileElement randomNumber;
    Random random = new Random();

    public DesktopPanel(AndroidDriver driver) {
        super(driver);
    }


    MobileElement clickRandomNumber(String yourNumber) {
        MobileElement element = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_" + yourNumber);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        return element;
    }

    MobileElement clickRandomNumber(int yourNumberInInt) {
        MobileElement element = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_" + yourNumberInInt);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        return element;
    }

    public void clickButtonOne() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonOne));
        buttonOne.click();
    }

    public void clickButtonTwo() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonTwo));
        buttonTwo.click();
    }

    public void clickButtonThree() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonThree));
        buttonFour.click();
    }

    public void clickButtonFour() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonFour));
        buttonFive.click();
    }

    public void clickButtonFive() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonFive));
        buttonFive.click();
    }

    public void clickButtonSix() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonSix));
        buttonSix.click();
    }

    public void clickButtonSeven() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonSeven));
        buttonSeven.click();
    }

    public void clickButtonEight() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonEight));
        buttonEight.click();
    }

    public void clickButtonNine() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonNine));
        buttonNine.click();
    }

    public void clickButtonZero() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonZero));
        buttonZero.click();
    }

    public void clickEqualButton() {
        wait.until(ExpectedConditions.elementToBeClickable(equalButton));
        equalButton.click();
    }

    public void clickButtonPlus() {
        wait.until(ExpectedConditions.elementToBeClickable(plusButton));
        plusButton.click();
    }

    public void clickDivisionButton() {
        wait.until(ExpectedConditions.elementToBeClickable(divisionButton));
        divisionButton.click();
    }

    public void clickMultiplicationButton() {
        wait.until(ExpectedConditions.elementToBeClickable(multiplicationButton));
        multiplicationButton.click();
    }

    public void clickSubtractionButton() {
        wait.until(ExpectedConditions.elementToBeClickable(subtractionButton));
        subtractionButton.click();
    }

    public boolean isFormulaFieldVisible() {
        try {
            wait.until(ExpectedConditions.visibilityOf(formulaField));
            return true;
        } catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public String resultIs() {
        wait.until(ExpectedConditions.visibilityOf(resultField));
        return resultField.getText();
    }
    public void actionOnCalculator(char operator) {

        switch (operator) {

            case '+':
                plusButton.click();
                System.out.println("Your action is addition");
                break;

            case '-':
                subtractionButton.click();
                System.out.println(" Your action is subtraction");
                break;

            case '/':
                divisionButton.click();
                System.out.println("Your action is division");
                break;

            case '*':
                multiplicationButton.click();
                System.out.println("Your action is multiplication");
                break;

            default:
                System.out.println(" Incorrect action ");
        }

    }

}

