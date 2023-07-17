package cw.pages;

import cw.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrendyolHomePage extends TrendyolBasePage {

    public TrendyolHomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement cookiesAkzeptierenButton;

    public void cookiesAkzeptClick(){
        cookiesAkzeptierenButton.click();
    }


}
