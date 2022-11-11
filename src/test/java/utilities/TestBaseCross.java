package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBaseCross {

    /*
       bu classi farkli browserlarda calistirmak istedigimiz crossBrowser package'i
       altindaki classlara extends ile bagladik

       ve sonrasinda bir Xml dosyasi olusturup crossBrowser icin <test> satirinin altina
       browser icin parametre gonderiyoruz
     */



    protected WebDriver driver;

    @Parameters ("browser")
    @BeforeMethod
    public void setUp(@Optional String browser){

        driver = CrossDriver.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @AfterMethod
    public void tearDown(){
      CrossDriver.closeDriver();
    }
}
