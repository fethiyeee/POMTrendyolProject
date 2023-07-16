package cw.tests;

import cw.pages.TrendyolBasePage;
import cw.pages.TrendyolHomePage;
import cw.utilities.ConfigurationReader;
import cw.utilities.Driver;
import cw.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TrendyolTestCase extends TestBase {



    /*
Install POM framework
go trendy
search for any product
click on the first product on page 2 of the search results
add to cart
Test the product you added to the cart
     */


    @Test
    public void test() {

        driver.get("https://www.trendyol.com/");

        //click cookies..
        // TrendyolHomePage homePage = new TrendyolHomePage();

        WebElement cookies = driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(cookies));

        cookies.click();


        //  homePage.cookiesAccept();

//        search for any product..
        //homePage.searchProduct("Schuhe");

//        close rabatt-window..
        // homePage.rabattWE.click();


//        click on the first product on page 2 of the search results
//        add to cart
//        Test the product you added to the cart


    }


}
