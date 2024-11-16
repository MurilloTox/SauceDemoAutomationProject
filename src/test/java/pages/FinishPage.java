package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class FinishPage extends BasePage {
    public FinishPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#header_container .header_secondary_container .title")
    private WebElement FinalText;

    public String getText(){
        return FinalText.getText();
    }
}