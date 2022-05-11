package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodları {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/divers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
        ileride wait konusunu daha genıs olarak ele alacagız
        bir sayfa açılırken ilk başta sayfanın içerisinde bulunan elementlere gore
        bır yuklenme suresıne ıhtıyac vardır
        veya bır web elementının kullanılabılmesı için zaman ıhtıyac olabılır
        implicitlyWait bıze sayfanın yuklenmesı ve sayfadakı elementlere ulaşım için beklenecek maxımum
        sure belırleme olanagı tanır
         */
        driver.get("https://www.amazoon.com");
        driver.close();
    }
}
