package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DialerPage {

    private AppiumDriver driver;

    public DialerPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Elements
    @AndroidFindBy(id = "com.google.android.dialer:id/dialpad_fab")
    private WebElement dialpadButton;

    @AndroidFindBy(id = "com.google.android.dialer:id/nine")
    private WebElement buttonNine;

    @AndroidFindBy(id = "com.google.android.dialer:id/seven")
    private WebElement buttonSeven;

    @AndroidFindBy(id = "com.google.android.dialer:id/five")
    private WebElement buttonFive;

    @AndroidFindBy(id = "com.google.android.dialer:id/three")
    private WebElement buttonThree;

    @AndroidFindBy(id = "com.google.android.dialer:id/four")
    private WebElement buttonFour;

    @AndroidFindBy(id = "com.google.android.dialer:id/six")
    private WebElement buttonSix;

    @AndroidFindBy(id = "com.google.android.dialer:id/dialpad_voice_call_button")
    private WebElement voiceCallButton;

    @AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.google.android.dialer:id/select_dialog_listview']/android.widget.LinearLayout[1]")
    private WebElement firstContactOption;

    // Actions
    public void openDialpad() {
        dialpadButton.click();
    }

    public void dialNumber(String number) {
        for (char digit : number.toCharArray()) {
            switch (digit) {
                case '9':
                    buttonNine.click();
                    break;
                case '7':
                    buttonSeven.click();
                    break;
                case '5':
                    buttonFive.click();
                    break;
                case '3':
                    buttonThree.click();
                    break;
                case '4':
                    buttonFour.click();
                    break;
                case '6':
                    buttonSix.click();
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported digit: " + digit);
            }
        }
    }

    public void initiateCall() {
        voiceCallButton.click();
    }

    public void selectFirstContact() {
        firstContactOption.click();
    }
}
