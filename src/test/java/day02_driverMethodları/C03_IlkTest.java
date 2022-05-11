package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        /*1-->https://www.amazon.com url ıne gıdın
        2-->başlığın amazon kelımesı içerdiğini test edın
        3-->url in https://www.amazon.com a eşit oldugunu test edın
        4-->sayfayı kapatın
         */
        System.setProperty("webdriver.chrome.driver","src/resources/divers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //1-->https://www.amazon.com url ıne gıdın
        driver.get("https://www.amazon.com ");


        // 2-->başlığın Amazon kelımesı içerdiğini test edın
        String actualTitle=driver.getTitle();
        String arananKelime="Amazon";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title "+arananKelime+"yi içermiyor,title testi FAILED");
        }

        //3-->url in https://www.amazon.com a eşit oldugunu test edın

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else{
            System.out.println("actual Url->"+actualUrl+" beklenen url den farklı,test FAILED");
        }
        driver.close();
    }
}
