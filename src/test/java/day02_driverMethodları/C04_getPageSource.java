package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C04_getPageSource {
    public static void main(String[] args) {
        //amazon sıtesıne gıdıp kaynak kodlarında "spend less" yazdıgını test edın

        System.setProperty("webdriver.chrome.driver","src/resources/divers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        String sayfaKaynakKodları=driver.getPageSource();
        String arananKelime="smws";
        if (sayfaKaynakKodları.contains(arananKelime)){
            System.out.println("kaynak kodu testi PASSED");
        } else{
            System.out.println("kaynak kodlarında aranan kelıme yok,test FAILED");
        }
        driver.close();
    }
}
