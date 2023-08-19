package Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class DemoListWebElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        WebDriver driver =new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// thời gian chờ đợi tìm kiếm element
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // thời gian chờ đợi load trang, nếu  quá 10s là báo lỗi
        //Navigate to a page
        driver.get("https://www.google.com/");
        Thread.sleep(Long.parseLong("1000"));
        driver.findElement(By.xpath("//textarea[@name='q']")).click();
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium Java");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
        Thread.sleep(Long.parseLong("1000"));

        List<WebElement> listTitle=driver.findElements(By.xpath("//h3"));

        for(int i=0;i<listTitle.size();i++){
            System.out.println(listTitle.get(i).getText());
        }
        Thread.sleep(Long.parseLong("1000"));
        driver.quit();
    }
}
