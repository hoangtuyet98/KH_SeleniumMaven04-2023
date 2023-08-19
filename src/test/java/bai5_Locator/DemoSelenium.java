package bai5_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;



        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // mo trang web ecommerce
        driver.get("https://anhtester.com/");

        Thread.sleep(2000);
        //Tắt browser
        driver.quit();
    }

}
