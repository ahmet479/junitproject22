package com.arcane.tests;

import com.github.javafaker.File;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Day08_C21_FileExistTest {
    /*
    Method: dosyaVarmi
    1- Masaustundeki bir dosyayi secin
    2- Bu dosyanin bilgisayarinizda bulunup bulunmadigini verify edin
    */

    @Test
    public void dosyaVarMi() {
        String homePath = System.getProperty(("user.home"));
        System.out.println(homePath);   //C:\Users\RANDABERG
        //"C:\Users\RANDABERG\Desktop\indir.jpeg"

        String cicekPath = homePath + "\\Desktop\\indir.jpeg";

        System.out.println(cicekPath);

        boolean varMi = Files.exists(Paths.get(cicekPath));
        Assert.assertTrue(varMi);


    }
    }