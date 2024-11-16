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

    @FindBy(className = "shopping_cart_link")
    private WebElement cartCant;


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void removeThreeItems() {
        int counter=0;
        while (counter<3) {
            removeButtons.get(0).click();
            counter++;
        }
    }

    public void proceedToCheckout() {
        checkoutButton.click();
    }

    public String checkCantCart(){
        return cartCant.getText();
    }
}