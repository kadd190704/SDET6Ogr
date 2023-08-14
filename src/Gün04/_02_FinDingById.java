package Gün04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FinDingById {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353/");

        WebElement isimKutusu =driver.findElement(By.id("first_8")); // ID ile eleman bulma
        isimKutusu.sendKeys("Kader");//kutucuklara yazı gönderme

        WebElement soyadKutusu=driver.findElement(By.id("last_8"));
        soyadKutusu.sendKeys("Taşdemir");


        MyFunc.Bekle(280);
        driver.quit();


    }
}
