package utils;

import org. testng.annotations.DataProvider;

/**
 * Los DataProviders
 * */

public class DataProviderTest {
    @DataProvider(name = "LoginDataProvider")
    /**
     * DataProvider para los datos de nuestro login
     * */
    public Object [][] getDatalogIn() { return new Object[][]{{"standard_user", "secret_sauce"} }; }

    @DataProvider(name = "PurchaseDataProvider")
    /**
     * DataProvider para los datos de nuestra informacion personal
     * */
    public Object[][] getDataPurchase(){
        return new Object[][] {{"Josue", "Murillo", "090703", "Checkout: Complete!"} };
    }
}
