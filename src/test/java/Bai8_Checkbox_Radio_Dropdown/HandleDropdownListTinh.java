package Bai8_Checkbox_Radio_Dropdown;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropdownListTinh extends BaseTest {
    public static void main(String[] args) {
        createBrowser();
        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        Select select=new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
        System.out.println(select.getFirstSelectedOption().getText());
        // lây theo texxt
        select.selectByVisibleText("Tuesday"); //dúng hàm để chọn
        // kiểm tra xem chọn đúng hay chưa
        System.out.println(select.getFirstSelectedOption().getText());

        // lấy theo thứ tự
        select.selectByIndex(4); //Wednesday
        System.out.println(select.getFirstSelectedOption().getText());

        //lấy theo giá trị value
        select.selectByValue("Saturday");
        System.out.println(select.getFirstSelectedOption().getText());

        System.out.println("===============");
        List<WebElement> listOptions= select.getAllSelectedOptions();
        for(WebElement element:listOptions){
            System.out.println(element.getText());
        }
//        System.out.println("======for thuân");
//        for (int i=0;i<listOptions.size();i++){
//            System.out.println(listOptions.get(i).getText());
//
//        }
        closeBrowser();
    }

}
