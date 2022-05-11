package day01_seleniyumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        /*en ilkel halıyle otomasyon yapmak için classımıza otomasyon için gereklı olan webdriver ın yerını gostermemız gerekır
        bunun için java kutuphanesınden System.setProperty() methodu kullanırız
        method 2 parametre  ıstemektedır
        ilk kullanacagımız driver.chrome.driver
        ikincisi ise bı driverin fiziki yolu :
         */
        System.setProperty("webdriver.chrome.driver","src/resources/divers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        driver.get("https://www.trendyol.com");
        Thread.sleep(2000);
        driver.close();
    }
}
