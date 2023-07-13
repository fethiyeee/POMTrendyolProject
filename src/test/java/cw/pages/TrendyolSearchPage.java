package cw.pages;

import cw.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class TrendyolSearchPage extends TrendyolBasePage{

    public TrendyolSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
