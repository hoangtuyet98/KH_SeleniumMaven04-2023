package bai6WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo3ActionsCheck {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        driver=new ChromeDriver();
        driver.manage().window().maximize(); //bung hết cỡ chome lên
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://anhtester.com/");
        WebElement tagH1=driver.findElement(By.xpath("//h1[normalize-space()='Anh Tester Automation Testing']"));
        //demo isDisplayed(xem nó có hiển thị trên WEb hay ko
        boolean checkDisplay= tagH1.isDisplayed();  //trả về True/False
        System.out.println(checkDisplay);
        Thread.sleep(Long.parseLong("2000"));


        // demo isEnabled(khi nào nó được Enable
        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");
        driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).click();
        WebElement buttonSubmit=driver.findElement((By.xpath("//button[normalize-space()='Submit']")));
        if(buttonSubmit.isEnabled()==false){
            System.out.println("kết quả kiểm tra isEnabled"+"True");
        }else
            System.out.println("false");

        // demo isSelected( dành cho checkbox, radio button)
        driver.get("https://crm.anhtester.com/admin/authentication");
        WebElement checkboxRemember =driver.findElement(By.xpath("//input[@type='checkbox']"));
        Thread.sleep(Long.parseLong("2000"));
        if(checkboxRemember.isSelected()==false){
            System.out.println("kết quả kiểm tra isSelected"+" True");
        }else
            System.out.println("false");
        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
        if(checkboxRemember.isSelected()==false){
            System.out.println("kết quả kiểm tra isSelected"+" True");
        }else
            System.out.println("tích rui kiểm tra lại"+" false");
        driver.quit();   //đóng trình duyệt
    }

}
