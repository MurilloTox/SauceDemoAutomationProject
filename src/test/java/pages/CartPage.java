package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

import java.util.List;

public class CartPage extends BasePage {
    @FindBy(css = ".cart_item")
    private List<WebElement> cartItems;

    @FindBy(css = ".cart_item .btn_secondary")
    private List<WebElement> removeButtons;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void removeAllItems() {
        while (!removeButtons.isEmpty()) {
            removeButtons.get(0).click();
        }
    }

    public boolean isCartEmpty() {
        return cartItems.isEmpty();
    }

    public void proceedToCheckout() {
        checkoutButton.click();
    }
}