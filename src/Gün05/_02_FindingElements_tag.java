package Gün05;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class _02_FindingElements_tag {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        driver.get("https://www.hepsiburada.com/");

        List<WebElement>linkler=driver.findElements(By.tagName("a"));
        //bütün a tag li elementleri bul

        for (WebElement e:linkler){
            System.out.println("e.getText() = " + e.getText());
        }

        MyFunc.Bekle(5);
        driver.quit();







    }


}
