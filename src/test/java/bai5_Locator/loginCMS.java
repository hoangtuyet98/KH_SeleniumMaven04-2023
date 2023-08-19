package bai5_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class loginCMS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        System.setProperty("webdriver.http.factory", "jdk-http-client");


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // mo trang web ecommerce
        driver.get("https://cms.anhtester.com/login");

        //Định vị các element trên trang login CMS
        //1 email
      //  driver.findElement(By.id("email")).sendKeys("admin@example.com");
      //  driver.findElement(By.id("password")).sendKeys("123456");
      //cach 1//  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[1]/input")).sendKeys("admin@example.com");

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");

        driver.findElement(By.tagName("button")).click();

        //4 link text Forgot password
      //  driver.findElement(By.linkText("Forgot password?")).click();
      //  driver.findElement(By.partialLinkText("password")).click();
        Thread.sleep(3000);
        //Tắt browser
        driver.quit();
    }
    }

