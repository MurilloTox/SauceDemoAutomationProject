package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataProviderTest;
import utils.baseTest.BaseTest;

/**
 * Test para remover los artículos del carrito
 * */

public class RemoveTest extends BaseTest {

    @Test(dataProvider = "LoginDataProvider", dataProviderClass = DataProviderTest.class)
    public void removeTest(String user, String password) {
        loginPage.login(user, password);
        for(int i=0; i<3; i++){
            productPage.addRandomProductToCart();
        }
        productPage.goToCart();
        yourCartPage.removeThreeItems();
        Assert.assertEquals(yourCartPage.checkCantCart(),"");
    }
}
