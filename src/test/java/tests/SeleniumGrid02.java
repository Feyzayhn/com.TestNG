package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SeleniumGrid02 {

    WebDriver driver;

    @Test
    public void test01() throws InterruptedException, MalformedURLException {

        driver = new RemoteWebDriver(new URL("http://192.168.1.105:4444"), new EdgeOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
        driver.manage().window().maximize();
        driver.get("https://www.bluerentalcars.com/");

        Thread.sleep(3000);
        String customerService = driver.findElement(By.xpath("(//*[.='Customer Services'])[2]")).getText();
        System.out.println(customerService);
        Thread.sleep(3000);
        System.out.println("Current Thread : " + Thread.currentThread());
        System.out.println("Blue Rental Title : " + driver.getTitle());
        driver.quit();
    }
}
