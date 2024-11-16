package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataProviderTest;
import utils.baseTest.BaseTest;

public class PurchaseTest extends BaseTest {
    @Test(dataProvider = "LoginDataProvider", dataProviderClass = DataProviderTest.class)
    public void LoginPage(String user, String password) {
        loginPage.login(user,password);
        int counter=0;
        while (counter<4){
            productPage.addRandomProductToCart();
            counter++;
        }
        productPage.goToCart();
        yourCartPage.proceedToCheckout();
    }
    @Test(dataProvider = "PurchaseDataProvider", dataProviderClass = DataProviderTest.class)
    public void TestPurchase(String name, String lastName, String postalIC, String expected){
        informationPage.fillPersonalInformation(name,lastName,postalIC);
        overviewPage.clickOnFinish();
        Assert.assertEquals(finishPage.getText(), expected);
    }
}