package com.arcane;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class Day03_C5_GoogleAramaTest {

    /*
    Yeni class olustur : GoogleAramaTest
    Test method'u  olustur ve asagidaki task'i tamamlayin.
    Kullanici https://www.google.com gider
    Seachbox'i locate et ve  "porselen caydanlik" aransin.
    Bununla baglantili Google'da kac tane sonuc gosteriliyor test edin
    */

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        /*
        Implicitly wait ekleme
        -30 saniye kadar bekle eger ihtiyac duyarsan ===bu Java'da Thread sleap() gibi degildir
        -Eger driver 1 saniyeye ihtiyac duyarsa -SADECE 1 saniye bekler(ImplicitliyWait => dinamik bir beklemedir)
        -Neden beklemeye ihtiyac duyariz:
        1-Internet yavas olabilir
        2-Bilgisayarimizin ozelliklerinden dolayi yavas olabilir
        3-Datbase yavas olabilir.
        4-Sayfadaki resim, video ve iframe'lerden dolayi sayfa yavas olabilir.
         */

    }
    @Test
    public void caydanlikBul(){
     //   Kullanici https://www.google.com gider
        driver.get("https://www.google.com");
        //Cerezleri kabul et
        driver.findElement(By.xpath("//div[@class='QS5gu sy4vM']")).click();

     //Seachbox'i locate et ve  "porselen caydanlik" aransin.
        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("porselen caydanlik"+ Keys.ENTER);

        //Bununla baglantili Google'da kac tane sonuc gosteriliyor test edin
//        String sonucSayisi = driver.findElement(By.xpath("//div[@id='result-stats']")).getText().substring(9,16);
        String [] sonucSayisi = driver.findElement(By.xpath("//div[@id='result-stats']")).getText().split("");


        System.out.println(sonucSayisi[2]);

    }
    @After
    public void tearDown(){
       driver.close();
    }
    }


