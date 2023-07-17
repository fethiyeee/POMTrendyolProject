package cw.tests;


import cw.pages.TrendyolCartPage;
import cw.pages.TrendyolHomePage;
import cw.pages.TrendyolProductPage;
import cw.pages.TrendyolSearchPage;
import cw.utilities.ConfigurationReader;
import cw.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TrendyolTestCase {

    // trendyola gidin
    // herhangi bir urunu arayin
    // arama sonuclarındaki 2. sayfadaki ilk urune tiklayin
    // sepete ekleyin
    // sepete ekledigniz urunu test ediniz

    @Test
    public void test() throws InterruptedException {

        // https://www.trendyol.com a gidilir
        Driver.getDriver().get(ConfigurationReader.getProperty("trendyolUrl"));

        // herhangi bir urunu arayin
        TrendyolHomePage homePage = new TrendyolHomePage();
        homePage.cookiesAkzeptClick();
        homePage.search("schuhe");

        // arama sonuclarındaki 2. sayfadaki ilk urune tiklayin
        TrendyolSearchPage searchPage = new TrendyolSearchPage();

        searchPage.werbungClose();
        searchPage.selectingProduct(1);

        // sepete ekleyin
        TrendyolProductPage productPage = new TrendyolProductPage();
        productPage.addToCart();
        Thread.sleep(1000);

        // sepete ekledigniz urunu test ediniz
        TrendyolCartPage cartPage = new TrendyolCartPage();
        cartPage.cart();
        Thread.sleep(1000);

        cartPage.cartList();




    }
}

