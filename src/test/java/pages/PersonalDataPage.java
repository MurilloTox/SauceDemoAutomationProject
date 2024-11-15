package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class PersonalDataPage extends BasePage {
    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement postalCodeInput;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(id = "cancel")
    private WebElement cancelButton;

    @FindBy(css = ".complete-header")
    private WebElement confirmationMessage;

    public PersonalDataPage(WebDriver driver) {
        super(driver);
    }

    public void fillPersonalInformation(String firstName, String lastName, String postalCode) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        postalCodeInput.sendKeys(postalCode);
        continueButton.click();
    }

    public void cancelPurchase() {
        cancelButton.click();
    }

    public boolean isPurchaseComplete() {
        return confirmationMessage.isDisplayed() &&
                confirmationMessage.getText().contains("Thank you for your order");
    }
}
