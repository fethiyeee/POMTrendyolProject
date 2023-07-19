package cw.tests;


import cw.pages.TrendyolCartPage;
import cw.pages.TrendyolHomePage;
import cw.pages.TrendyolProductPage;
import cw.pages.TrendyolSearchPage;
import cw.utilities.ConfigurationReader;
import cw.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TrendyolTestCase {

   /*
    Gehen Sie zu trendyol
    Suchen Sie nach einem beliebigen Produkt
    Klicken Sie auf das zweite Produkt auf Seite  Suchergebnisse
    Fügen Sie das Produkt in den Warenkorb hinzu
    Testen Sie das Produkt, das Sie dem Warenkorb hinzugefügt haben

    */

    @Test
    public void test() throws InterruptedException, IOException {

        // Gehen Sie zu trendyol
        Driver.getDriver().get(ConfigurationReader.getProperty("trendyolUrl"));

        // Suchen Sie nach einem beliebigen Produkt
        TrendyolHomePage homePage = new TrendyolHomePage();
        homePage.cookiesAkzeptClick();
        homePage.search("skirt");

        // Klicken Sie auf das zweite Produkt auf Seite  Suchergebnisse
        TrendyolSearchPage searchPage = new TrendyolSearchPage();
        searchPage.selectingProduct(1);

        // Fügen Sie das Produkt in den Warenkorb hinzu
        TrendyolProductPage productPage = new TrendyolProductPage();
        productPage.addToCart();
        Thread.sleep(1000);

        // Testen Sie das Produkt, das Sie dem Warenkorb hinzugefügt haben
        TrendyolCartPage cartPage = new TrendyolCartPage();
        cartPage.cart();
        Thread.sleep(1000);

        cartPage.cartList();


        //Screenshot des Warenkorbs
        Driver.takeScreenShot("TrendyolTest");


    }
}

