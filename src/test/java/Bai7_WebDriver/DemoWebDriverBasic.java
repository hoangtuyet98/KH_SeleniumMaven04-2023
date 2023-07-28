package Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DemoWebDriverBasic {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// thời gian chờ đợi tìm kiếm element
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // thời gian chờ đợi load trang, nếu  quá 10s là báo lỗi


        // Navigate to a page
        driver.navigate().to("http://anhtester.com");
        driver.findElement(By.xpath("//a[@id='btn-login']")).click();
        Thread.sleep(Long.parseLong("2000"));

        // Điều hướng lịch sử trang trước đó
         driver.navigate().back();
        Thread.sleep(Long.parseLong("1000"));
        //Điều hướng đến trang tiếp sau
        driver.navigate().forward();
        Thread.sleep(Long.parseLong("1000"));
        //làm mới trang hiện tại
        driver.navigate().refresh();

        // get the title of page
        String title=driver.getTitle();

       // get the current URL
         String url=driver.getCurrentUrl();

         //Get the current page HTML source
        String html=driver.getPageSource();

        System.out.println("Title "+title);
        System.out.println("current URL "+url);
        System.out.println("PageSource "+html);
        System.out.println("Title "+html);
        driver.quit();
    }
}
