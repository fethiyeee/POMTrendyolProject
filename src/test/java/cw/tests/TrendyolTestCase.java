package cw.tests;

import cw.pages.TrendyolBasePage;
import cw.pages.TrendyolHomePage;
import cw.utilities.ConfigurationReader;
import cw.utilities.Driver;
import org.testng.annotations.Test;

public class TrendyolTestCase {



    /*
Install POM framework
go trendy
search for any product
click on the first product on page 2 of the search results
add to cart
Test the product you added to the cart
     */


    @Test
    public void test(){

        //go trendy..
        Driver.getDriver().get(ConfigurationReader.getProperty("trendyolUrl"));

        //click cookies..
        TrendyolHomePage homePage=new TrendyolHomePage();

//        search for any product..
        homePage.searchProduct("Schuhe");

//        close rabatt-window..
        homePage.rabattWE.click();


//        click on the first product on page 2 of the search results
//        add to cart
//        Test the product you added to the cart









    }


}
