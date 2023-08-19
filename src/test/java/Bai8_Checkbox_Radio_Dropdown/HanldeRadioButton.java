package Bai8_Checkbox_Radio_Dropdown;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HanldeRadioButton extends BaseTest {
    public static void main(String[] args) {
        createBrowser();
        driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        //Handel Browser
       boolean checkRadioMale= driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).isSelected();
        System.out.println("Male: "+checkRadioMale);
        boolean checkRadioFemale= driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Female']")).isSelected();
        System.out.println("Female: "+checkRadioFemale);

        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).click();
        boolean checkRadioMaleSelected= driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).isSelected();
        System.out.println("Male: "+checkRadioMaleSelected);
        System.out.println("Female: "+checkRadioFemale);

        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Female']")).click();
        boolean checkRadioFemaleSelected= driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Female']")).isSelected();
        boolean checkRadioMaleSelected1= driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).isSelected();
        System.out.println("Female: "+checkRadioFemaleSelected);
        System.out.println("Male: "+checkRadioMaleSelected1);

        //Hanlde Multi RadioButton
        List <WebElement> listRadio=driver.findElements(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label//input"));
        System.out.println("Radio Tatol: "+listRadio.size());
        for(int i=0;i<listRadio.size();i++){
            System.out.println("radio thư: "+(i+1)+listRadio.get(i).isSelected());
        }

        listRadio.get(1).click();  //click radio thứ 2
        List <WebElement> listRadio2=driver.findElements(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label//input"));
        System.out.println("Radio Tatol: "+listRadio2.size());
        int count1=0;
        int count2=0;
        for(int i=0;i<listRadio2.size();i++){
            System.out.println("radio thư: "+(i+1)+listRadio.get(i).isSelected());
            //kiểm tra đúng sai
            if(listRadio.get(1).isSelected()==true)
                count1++;
            if(listRadio.get(i).isSelected()==false)
                count2++;
        }
        //kiểm tra đúng sai

        closeBrowser();
    }
}
