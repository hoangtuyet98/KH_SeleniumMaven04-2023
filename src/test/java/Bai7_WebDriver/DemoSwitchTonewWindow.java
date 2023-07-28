package Bai7_WebDriver;

import commons.BaseTest;
import org.openqa.selenium.WindowType;

public class DemoSwitchTonewWindow extends BaseTest {
    public static void main(String[] args) {
    createBrowser("edge");

    //Navigate to a page
        driver.get("http://anhtester.com");
       // driver.switchTo().newWindow(WindowType.TAB); // mở 1 tab mới
        driver.switchTo().newWindow(WindowType.WINDOW); // mở window mới
        driver.get("https://www.google.com/");
       // driver.switchTo().window(mainWindow)
    }

}
