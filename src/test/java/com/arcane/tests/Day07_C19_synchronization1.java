package com.arcane.tests;

import com.arcane.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day07_C19_synchronization1 extends TestBase {
    /*
    method olustur: synchronization1
    1- https://the-internet.herokuapp.com/dynamic_controls adresine git
    2- remove button'una tiklayin
    3- Mesajin “It's gone!” oldugunu verify edin
    4- Add button'una tiklayin
    5- Mesajin “It's back!” oldugunu verify edin
    */
@Test
    public void synchronization1(){
//    1- https://the-internet.herokuapp.com/dynamic_controls adresine git
    driver.get("https://the-internet.herokuapp.com/dynamic_controls");
//            2- remove button'una tiklayin
    driver.findElement(By.xpath("")).click();

//            3- Mesajin “It's gone!” oldugunu verify edin
    //1. yol
//    WebElement goneElement = driver.findElement(By.id("message")).click();
//    Assert.assertTrue(goneElement.getText().equals(""));
      //  2,yol

    //wait.until();

//            4- Add button'una tiklayin
    driver.findElement(By.xpath("")).click();

//            5- Mesajin “It's back!” oldugunu verify edin
    WebElement backElement = driver.findElement(By.id(""));
    Assert.assertTrue(backElement.getText().equals(""));

}
}