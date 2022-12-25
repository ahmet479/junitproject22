package com.arcane.tests;

import com.arcane.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Day07_C18_TestBaseDemo extends TestBase {
    /*
    test1 google'da “balik kizartma tavasi” ara
    Ardindan sayfanin “balik kizartma tavasi” icerdigini verify et
    ——————————-
    test2 amazon'da “balik kizartma tavasi” ara
    Ardindan sayfanin “balik kizartma tavasi” icerdigini verify et
    */
    @Test
    public void test1() throws InterruptedException {
        //    test1 google'da “balik kizartma tavasi” ara
        driver.get("https://google.com");
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("balik kizartma tavasi");
//    Ardindan sayfanin “balik kizartma tavasi” icerdigini verify et

        Thread.sleep(3000);
        Assert.assertTrue(driver.getPageSource().contains("balik kizartma tavasi"));

    }

    @Test
    public void test2() throws InterruptedException {
//    test2 amazon'da “balik kizartma tavasi” ara
        driver.get("https://amazon.com");

        Thread.sleep(3000);
        driver.findElement(By.id("")).sendKeys("balik kizartma tavasi" + Keys.ENTER);

        Thread.sleep(3000);
        //    Ardindan sayfanin “balik kizartma tavasi” icerdigini verify et

        Assert.assertTrue(driver.getPageSource().contains("balik kizartma tavasi"));

    }
}