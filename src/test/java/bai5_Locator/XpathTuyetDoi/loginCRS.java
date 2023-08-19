package bai5_Locator.XpathTuyetDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class loginCRS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        System.setProperty("webdriver.http.factory", "jdk-http-client");


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // mo trang web ecommerce
        driver.get("https://cms.anhtester.com/login");



        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[1]/input")).sendKeys("admin@example.com");

        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[2]/input")).sendKeys("123456");

        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/button")).click();

        //4 link text Forgot password

        Thread.sleep(3000);
        //Tắt browser
        driver.quit();
    }
    }

