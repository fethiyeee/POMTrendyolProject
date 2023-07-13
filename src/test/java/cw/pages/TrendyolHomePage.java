package cw.pages;

import cw.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class TrendyolHomePage extends TrendyolBasePage{

    public TrendyolHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
}
