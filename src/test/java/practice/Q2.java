package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {
    public static void main(String[] args) {


        //         1-java class'imiza chromedriver.exe'yi tanitalim
        System.setProperty("webdriver.chrome.driver","src/resources/divers/chromedriver.exe");
        //         2-driver olusturalim
        WebDriver driver=new ChromeDriver();
        //         3-driver'in tum ekrani kaplamasini saglayalim
        driver.manage().window().maximize();

        //4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bırasın
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //        5-"sahibinden.com" adresine gidelim
        driver.get("https://www.sahibinden.com");
        //        6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
        String title= driver.getTitle();
        System.out.println("sahıbındentitle = " + title);
        String url= driver.getCurrentUrl();
        System.out.println("sahıbındenurl = " + url);
        //        7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim
        if (title.contains("Oto")){
            System.out.println("title Oto içeriyor");
        } else{
            System.out.println("title Oto içermiyor");
        }

        if (url.contains("Oto")){
            System.out.println("url Oto içeriyor");
        } else{
            System.out.println("url Oto içermiyor");
        }
        //        8-Ardindan "gittigidiyor.com" adresine gidelim
        driver.navigate().to("https://www.gittigidiyor.com");
        //        9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini kontrol edelim
        System.out.println(driver.getTitle());
        boolean isTrue=driver.getTitle().contains("Sitesi");
        if (isTrue){
            System.out.println("sitesi kelımesi içeriyor,test passed");
        } else{
            System.out.println("sitesi kelımesı ıcermıyor test faıled");
        }
        //        10-Bi onceki web sayfamiza geri donelim
        driver.navigate().back();
        //        11-sayfayi yenileyelim
        driver.navigate().refresh();
        //        12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        driver.navigate().forward();
        driver.close();
        //        13-En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();


    }
}
