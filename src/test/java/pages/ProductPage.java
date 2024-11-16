package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

import java.util.List;
import java.util.Random;

public class ProductPage extends BasePage {
    @FindBy(css = ".inventory_item")
    private List<WebElement> products;

    @FindBy(css = ".shopping_cart_link")
    private WebElement cartLink;

    @FindBy(css = ".btn_inventory")
    private List<WebElement> addToCartButtons;

    @FindBy(css = ".shopping_cart_badge")
    private WebElement cartBadge;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutLink;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addRandomProductToCart() {
        Random rand = new Random();
        int randomProduct = rand.nextInt(addToCartButtons.size());
        addToCartButtons.get(randomProduct).click();
    }

    public void clickOnBurqerMenu(){
        menuButton.click();
    }

    public void logOut(){
        logoutLink.click();
    }

    public void goToCart() {
        cartLink.click();
    }
}