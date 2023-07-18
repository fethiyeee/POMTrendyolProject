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

   /*
     go to trendyol
     search for any product
     click on the second product on page of the search results
     add to cart
     test the product you added to the cart

    */

    @Test
    public void test() throws InterruptedException {

        // go to trendyol
        Driver.getDriver().get(ConfigurationReader.getProperty("trendyolUrl"));

        // search for any product
        TrendyolHomePage homePage = new TrendyolHomePage();
        homePage.cookiesAkzeptClick();
        homePage.search("skirt");

        //click on the second product on page of the search results
        TrendyolSearchPage searchPage = new TrendyolSearchPage();

        //  searchPage.werbungClose();
        searchPage.selectingProduct(1);

        // add to cart
        TrendyolProductPage productPage = new TrendyolProductPage();
        productPage.addToCart();
        Thread.sleep(1000);

        // test the product you added to the cart
        TrendyolCartPage cartPage = new TrendyolCartPage();
        cartPage.cart();
        Thread.sleep(1000);

        cartPage.cartList();


    }
}

