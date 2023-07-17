package cw.pages;

import cw.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TrendyolSearchPage extends TrendyolBasePage {

    public TrendyolSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='p-icon icon-close close-icon']")
    public WebElement werbungCloseButton;

    public void werbungClose(){
        werbungCloseButton.click();
    }


    @FindBy(xpath="//div[@class ='product']")
    public List<WebElement> products;


    public void selectingProduct(int index) throws InterruptedException {

        System.out.println("searchPage.products.size() = " +products.size()); // 24
        Thread.sleep(2000);
        products.get(index).click();
        Thread.sleep(1000);
    }


}
