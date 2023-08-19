package bai6WebElement;

import bai5_Locator.BT_LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo6ActionsGet {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        System.setProperty("webdriver.http.factory", "jdk-http-client");


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));  // trang nào load hơn 10s sẽ báo lỗi
        driver.get("https://crm.anhtester.com/admin/authentication");
//        Dimension dimension=driver.findElement(By.xpath(BT_LocatorsCRM.butonLogin)).getSize();
//        System.out.println("Height"+dimension.getHeight());
//        System.out.println("Width"+dimension.getWidth());
        driver.findElement(By.xpath(BT_LocatorsCRM.inputEmail)).sendKeys("hoangtuyet010498@gmail.com");
        driver.findElement(By.xpath(BT_LocatorsCRM.inputPassword)).sendKeys("123456");
        System.out.println("văn bản gợi ý" + driver.findElement(By.xpath(BT_LocatorsCRM.inputEmail)).getAttribute("value"));
        System.out.println("văn bản gợi ý" + driver.findElement(By.xpath(BT_LocatorsCRM.inputPassword)).getAttribute("value"));
        //////////////////////////////////

        driver.get("https://anhtester.com/login");
      System.out.println("văn bản gợi ý1" +driver.findElement(By.xpath("//input[@placeholder='Email']")).getAttribute("placeholder"));


        // driver.findElement(By.id("password")).sendKeys("123456");


        Thread.sleep(2000);
        //Tắt browser
        driver.quit();
    }
}
