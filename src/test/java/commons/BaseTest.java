package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public  class BaseTest {
   public static WebDriver driver;
    public static void createBrowser(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// thời gian chờ đợi tìm kiếm element
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // thời gian chờ đợi load trang, nếu  quá 10s là báo lỗi
    }
    public static void createBrowser(String browserName){
        if(browserName.equals("chrome")){
            driver =new ChromeDriver();
        }
        if(browserName.equals("edge")){
            driver =new EdgeDriver();
        }
        if(browserName.equals("firefox")){
            driver =new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// thời gian chờ đợi tìm kiếm element
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // thời gian chờ đợi load trang, nếu  quá 10s là báo lỗi
    }
    public static void closeBrowser(){
        try {
            Thread.sleep(Long.parseLong("2000"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    public void sleep(double second){

    }
}
