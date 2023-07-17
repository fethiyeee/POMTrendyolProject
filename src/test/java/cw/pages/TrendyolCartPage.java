package cw.pages;

import cw.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TrendyolCartPage extends TrendyolBasePage {

    public TrendyolCartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="checkbox-")
    List<WebElement> checkboxCart;

    public void cartList() {
        for (WebElement element : checkboxCart) {
            if(element.isSelected()) {
                System.out.println("ürün sepette eklidir");
                break;
            }   else System.out.println("ürün sepette ekli degildir");     }
    }

}
