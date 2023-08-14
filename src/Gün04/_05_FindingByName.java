package Gün04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FindingByName {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353/");

        WebElement firstName= driver.findElement(By.name("q8_name[first]")); //name ile bulma
        firstName.sendKeys("Kader");
        WebElement lastName=driver.findElement(By.name("q8_name[last]")); //name ile bulma
        lastName.sendKeys("Taşdemir");
        WebElement btnSubmit= driver.findElement(By.id("input_2"));
        btnSubmit.click();

        //textBox ları name ile bulup adınızı ve soyadınızı doldurun
        //ve butonu da id veya name ile bulup tıklatın












        MyFunc.Bekle(200);
        driver.quit();


    }
}
