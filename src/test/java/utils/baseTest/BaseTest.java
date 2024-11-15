package utils.baseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pages.*;
import utils.MyDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    protected MyDriver driver;
    protected LoginPage loginPage;
    protected ProductsPage productsPage;
    protected CartPage cartPage;
    protected CheckoutPage checkoutPage;

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod(alwaysRun = true)
    @Parameters({ "browser", "url" })
    public void beforeMethod(String browser, String url) {
        driver = new MyDriver(browser);
        driver.getDriver().manage().window().maximize();
        navigateTo(url);
        initializePages();
    }

    /**
     * Initializes all page objects
     */
    private void initializePages() {
        loginPage = new LoginPage(driver.getDriver());
        productsPage = new ProductsPage(driver.getDriver());
        cartPage = new CartPage(driver.getDriver());
        checkoutPage = new CheckoutPage(driver.getDriver());
    }

    /**
     * Navigates to given URL
     * @param url URL to navigate to
     */
    public void navigateTo(String url) {
        driver.getDriver().get(url);
    }

    /**
     * Loads the login page as the first page
     * @return LoginPage
     */
    public LoginPage loadFirstPage() {
        return new LoginPage(driver.getDriver());
    }

    /**
     * Common login method for test preconditions
     */
    protected void login(String username, String password) {
        loginPage.login(username, password);
    }

    /**
     * After the test execution it closes the browser.
     */
    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        if (driver != null && driver.getDriver() != null) {
            driver.getDriver().quit();
        }
    }
}