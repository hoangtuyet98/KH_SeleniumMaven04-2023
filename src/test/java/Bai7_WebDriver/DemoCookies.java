package Bai7_WebDriver;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class DemoCookies extends BaseTest {
    public static void main(String[] args) {
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
       // driver.findElement(By.xpath("//button[@type='submit']")).click();
         driver.findElement(By.xpath("//button[@type='submit']")).submit();
         //Get all cookies
        Set<Cookie> cookies=driver.manage().getCookies();
        System.out.println(cookies.iterator().next().toString());
    }
}
