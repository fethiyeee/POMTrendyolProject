package cw.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class ParametersBrowserClass {


    protected WebDriver driver;


    //Browser konfigurasyonlarini yapalim..

    @BeforeMethod

    //her seferinde elle browser i degistirmemek icin methodumuza parametre olarak hepsini ekledik.
    //eger herhangi bir parametre gonderilmezse default olarak chrom ile olustur dedik..

    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser) {

        if (driver == null) {
            switch (browser) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;


            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @AfterMethod
    public void tearDown() {
        // en son tekrar null a atiyoruz ki sonra tekrar test icin null oldugunu gorup calissin);

        if (driver != null) {
           // driver.quit();
            driver = null;
        }
    }
}
