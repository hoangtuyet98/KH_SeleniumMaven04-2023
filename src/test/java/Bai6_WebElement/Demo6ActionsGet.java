package Bai6_WebElement;

import Buoi5_BT_Locators.BT_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo6ActionsGet {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.manage().window().maximize(); //bung hết cỡ chome lên
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        // getText
        String headerPage=driver.findElement(By.xpath(BT_Locators.heaaderLoginPage)).getText();
        System.out.println("Header Login Page "+headerPage);
        //getCssValue
        String buttonLoginBGColor=driver.findElement(By.xpath(BT_Locators.butonLogin)).getCssValue("background-color");
        System.out.println("background-color"+buttonLoginBGColor);

        String testcolor=driver.findElement(By.xpath(BT_Locators.butonLogin)).getCssValue("color");
        System.out.println("testcolor"+testcolor);

        //getAttribute
        String buttonAttribute=driver.findElement(By.xpath(BT_Locators.butonLogin)).getAttribute("type");
        System.out.println("type value"+buttonAttribute);
        System.out.println("class value"+driver.findElement(By.xpath(BT_Locators.butonLogin)).getAttribute("class"));

        System.out.println("testcolor"+testcolor);

        // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));  // trang nào load hơn 10s sẽ báo lỗi

        driver.get("https://crm.anhtester.com/admin/authentication");
        //lấy kích cỡ, chiu cao
        Dimension dimension=driver.findElement(By.xpath(BT_Locators.butonLogin)).getSize();
        System.out.println("Height"+dimension.getHeight());
        System.out.println("Width"+dimension.getWidth());

        driver.findElement(By.xpath(BT_Locators.inputEmail)).sendKeys("hoangtuyet010498@gmail.com");
        driver.findElement(By.xpath(BT_Locators.inputPassword)).sendKeys("123456");

        System.out.println("văn bản gợi ý" + driver.findElement(By.xpath(BT_Locators.inputEmail)).getAttribute("value"));
        System.out.println("văn bản gợi ý" + driver.findElement(By.xpath(BT_Locators.inputPassword)).getAttribute("value"));
        //////////////////////////////////

        driver.get("https://anhtester.com/login");
        System.out.println("văn bản gợi ý" +driver.findElement(By.xpath("//input[@placeholder='Email']")).getAttribute("placeholder"));




        Thread.sleep(Long.parseLong("2000"));
        driver.quit();   //đóng trình duyệt
    }
}
