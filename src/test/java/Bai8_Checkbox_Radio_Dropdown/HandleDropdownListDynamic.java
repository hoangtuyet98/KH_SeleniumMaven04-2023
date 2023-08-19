package Bai8_Checkbox_Radio_Dropdown;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HandleDropdownListDynamic extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createBrowser();
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[normalize-space()='Search Now']/parent::div)/preceding-sibling::div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[normalize-space()='Select a Category']/parent::a)/following-sibling::div//input")).sendKeys("Ho");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[normalize-space()='Select a Category']/parent::a)/following-sibling::div//input")).sendKeys(Keys.ENTER);
        closeBrowser();

    }
}
