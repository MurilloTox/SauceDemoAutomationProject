package utils.baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import pages.*;

public class BaseTest {
    public WebDriver driver = new ChromeDriver();
    public LoginPage loginPage;
    public ProductPage productPage;
    public PersonalDataPage informationPage;
    public CartPage yourCartPage;
    public FinishPage finishPage;
    public OverviewPage overviewPage;
    @BeforeClass
    public void setUp() {
        loginPage = new LoginPage(driver, "https://www.saucedemo.com/");
        productPage= new ProductPage(driver);
        informationPage = new PersonalDataPage(driver);
        yourCartPage = new CartPage(driver);
        finishPage = new FinishPage(driver);
        overviewPage = new OverviewPage(driver);
    }

    @AfterTest
    public void close(){
        driver.close();
    }
}