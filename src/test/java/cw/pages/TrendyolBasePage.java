package cw.pages;

import cw.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrendyolBasePage {


    public TrendyolBasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(className="search-bar")
    WebElement textSearch;


    @FindBy(className="basket-preview-icon")
    WebElement cartButton;


    public void search(String searchWord){
        textSearch.sendKeys(searchWord + Keys.ENTER);
    }


    public void cart(){
        cartButton.click();
    }


}
