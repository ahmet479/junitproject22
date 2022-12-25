package com.arcane.tests;

import com.arcane.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day07_C19_synchronization2 extends TestBase {
    /*
    Method olustur: isEnabled
    https://the-internet.herokuapp.com/dynamic_controls adresine git
    enable Button'una tikla
    Mesajin “It's enabled!” oldugunu verify et
    Textbox'in enabled oldugunu verify et (textbox'ta yazi yazilabilir)
    Disable button'una tikla
    Mesajin “It's disabled!” oldugunu verify et
    Textbox'in disabled oldugunu verify et (textbox'ta yazi yazilamaz)

    NOTE: .isEnabled(); bir elementin enabled olup olmadigini check eder
     */

    @Test
    public void synchronization2() throws InterruptedException {
//        https://the-internet.herokuapp.com/dynamic_controls adresine git
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

//        enable Button'una tikla
        driver.findElement(By.xpath("//button[.='Enable']")).click();
        Thread.sleep(2000);
//        Mesajin “It's enabled!” oldugunu verify et
        WebElement enabledElement = driver.findElement(By.id("message"));
        Assert.assertTrue(enabledElement.getText().equals("It's enabled!"));
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver,10);

//        Textbox'in enabled oldugunu verify et (textbox'ta yazi yazilabilir)
        driver.findElement(By.xpath("//input[@type='text']")).click();
        Thread.sleep(2000);
//        Disable button'una tikla
        driver.findElement(By.xpath("//button[.='Disable']")).click();

        Thread.sleep(2000);
//        Mesajin “It's disabled!” oldugunu verify et
        WebElement backElement = driver.findElement(By.id("message"));
        Assert.assertTrue(backElement.getText().equals("It's disabled!"));
        Thread.sleep(2000);
//        Textbox'in disabled oldugunu verify et (textbox'ta yazi yazilamaz)
        driver.findElement(By.xpath("//input[@type='text']")).click();
        Thread.sleep(4000);
    }

}

