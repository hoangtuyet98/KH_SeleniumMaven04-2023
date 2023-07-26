package Bai6_WebElement;

import Buoi5_BT_Locators.BT_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElementActions {
    public static void main(String[] args) throws InterruptedException {
        //khơi tạo browser
        WebDriver driver;
        driver=new ChromeDriver();
        driver.manage().window().maximize(); //bung hết cỡ chome lên
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        //SendKey, Click, Clear

        driver.findElement(By.xpath(BT_Locators.inputEmail)).clear();
        driver.findElement(By.xpath(BT_Locators.inputPassword)).clear();
        driver.findElement(By.xpath(BT_Locators.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(BT_Locators.inputPassword)).sendKeys("123456");
      //  driver.findElement(By.xpath(BT_Locators.butonLogin)).click();
        driver.findElement(By.xpath(BT_Locators.inputPassword)).submit(); //nó sẽ bớt đi 1 element

       Thread.sleep(Long.parseLong("2000"));
        driver.quit();   //đóng trình duyệt
    }
}
