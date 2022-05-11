package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/divers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        /*
       Eger testimiz sirasinda birden fazla sayfa arasinda ileri geri hareket edeceksek
    driver.get() yerine driver.navigate().to() method'unu kullaniriz
     ve sonrasinda forward(), back() veya refresh() method'larini kullanabiliriz
         */

        //amazona geri dönelim
        driver.navigate().back();
        Thread.sleep(2000);

        //yenıden facebook a gıdelım
        driver.navigate().forward();
        Thread.sleep(2000);

        //sayfayı refrsh yapalım
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();


    }
}
