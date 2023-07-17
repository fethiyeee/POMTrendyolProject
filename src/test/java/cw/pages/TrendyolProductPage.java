package cw.pages;

import cw.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrendyolProductPage extends TrendyolBasePage {


    public TrendyolProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath= "//div[@id='add-to-basket']")
    WebElement addToCartButton;


    public void addToCart(){
        addToCartButton.click();
    }

}
