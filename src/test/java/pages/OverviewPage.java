package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

/**
 * Pagina de la confirmacion
 * */

public class OverviewPage extends BasePage {
    public OverviewPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id ="finish")
    private WebElement btnFinish;

    public void clickOnFinish(){
        btnFinish.click();
    }
}
