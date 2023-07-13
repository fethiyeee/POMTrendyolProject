package cw.pages;

import cw.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrendyolBasePage {


    public TrendyolBasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


//    @FindBy(xpath = "//button[.='Alle akzeptieren']")
//    public WebElement cookies;

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement cookies;

    @FindBy(xpath = "//input[@class='search-bar']")
    public WebElement searchArea;

    @FindBy(xpath = "//img[@class='basket-icon']")
    public WebElement basketIcon;

    @FindBy(className = "p-icon icon-close close-icon")
    public WebElement rabattWE;






    public void cookiesAccept(){
        cookies.click();

    }

    public void searchProduct(String product){

        searchArea.sendKeys(product+ Keys.ENTER);

    }

    public void alertDismiss(){
        Driver.getDriver().switchTo().alert().dismiss();
    }



}
