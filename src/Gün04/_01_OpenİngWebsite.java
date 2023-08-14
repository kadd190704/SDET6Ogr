package Gün04;

import Utlity.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpenİngWebsite {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");//web sayfasını açma

        MyFunc.Bekle(3);
        //driver.close(); //o anda aktif olan açık tarayıcıyı kapatıyor
        //hafızadan siliyor
        driver.quit();//program çalışırken açılmış bütün tarayıcıları hem
        //kapatır hem de hafızadan siler



    }
}
