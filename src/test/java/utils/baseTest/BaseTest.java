package utils.baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import pages.*;

import java.sql.DriverManager;

/**
 * Test del que nuestros demas test van a heredar
 * */

public class BaseTest {
    private static DriverManager driverManager;
    public WebDriver driver = new ChromeDriver();
    public LoginPage loginPage;
    public ProductPage productPage;
    public PersonalDataPage informationPage;
    public CartPage yourCartPage;
    public FinishPage finishPage;
    public OverviewPage overviewPage;
    @BeforeClass
    /**
     * SetUp para inicializar las pages que usaremos durante el test
     * */
    public void setUp() {
        String browserType = System.getProperty("browserName");
        WebDriver driver = null;
        if (browserType == null || browserType.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        loginPage = new LoginPage(driver, "https://www.saucedemo.com/");
        productPage= new ProductPage(driver);
        informationPage = new PersonalDataPage(driver);
        yourCartPage = new CartPage(driver);
        finishPage = new FinishPage(driver);
        overviewPage = new OverviewPage(driver);
    }

    @AfterTest
    /**
     * Metodo que cierra la ventana cuando termina el test
     * */
    public void close(){
        driver.close();
    }
}