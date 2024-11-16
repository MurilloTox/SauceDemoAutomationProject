package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataProviderTest;
import utils.baseTest.BaseTest;

/**
 * Iniciamos sesión para luego salir de esta
 * */

public class LogOutTest extends BaseTest {
    @Test(dataProvider = "LoginDataProvider", dataProviderClass = DataProviderTest.class)
    public void logOutTest(String user, String password){
        loginPage.login(user, password);
        productPage.clickOnBurqerMenu();
        Assert.assertTrue(productPage.isElementDisplayed(productPage.getLogOutButton()));
        productPage.logOut();
        Assert.assertTrue(loginPage.isLoginDisplayed());
    }
}
