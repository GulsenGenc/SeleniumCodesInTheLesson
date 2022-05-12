package day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_AmazonSearchTest {
    /*
    1. Bir class oluşturun : AmazonSearchTest
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
a.google web sayfasına gidin. https://www. amazon.com/
b. Search(ara) “city bike”
c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
d. “Shopping” e tıklayın.
e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/divers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a.google web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //b. Search(ara) “city bike”
      WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
      aramaKutusu.sendKeys("city bike"+ Keys.ENTER);
         //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
      //  WebElement sonucYazısı=driver.findElement(By.xpath());
      //  String sonucSayısı=sonucYazısı.getText();

       // System.out.println("sonuc sayısı->"+Integer.valueOf(sonucSayısı));
        //d. “Shopping” e tıklayın.
        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

    }
}
