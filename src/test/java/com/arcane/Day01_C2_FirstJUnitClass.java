package com.arcane;

import com.fasterxml.jackson.core.json.PackageVersion;
import org.junit.*;

public class Day01_C2_FirstJUnitClass {
    //@Test : test case olustur. Bu test cases olusturma ve kosturmaya yardimci olur
    // @Before : Runs before each @Test annotation. tekrarlanan pre condition icin kullanilir
    // @After : Runs after each @Test annotation. tekrarlanan post conditions icin kullanilir
    // @AfterClass, @BeforeClass
    // @Ignore: test case atlatmak icin kullanilir

    @Before
    public void setUp(){
        System.out.println("Bu bir setUp Methodudur");
    }
    @Test
    public void test01(){
        System.out.println("Test case 1");
    }
    @Ignore
    @Test
    public void test02(){
        System.out.println("Test case 2");
    }
    @Ignore
    @Test
    public void test03(){
        System.out.println("Test case 3");


    }
    @After
    public void tearDown(){
        System.out.println("Bu bir tearDown methoduudr");
/*
JUnit Assertion
Expected  = actual, assertion yapilir
 */
    }
    @Test
    public void assertion(){

        //1. Assert.assertTrue()
        Assert.assertTrue(3==3);   //test gecer

        //2.Assert.assertFalse
        Assert.assertFalse(3==4);   //test gecer

        Assert.assertFalse("selenium".contains("a"));   //test basarili

        //3. Assert.assertEquals()
        Assert.assertEquals("java","java");   //test basarili

        Assert.assertEquals("java", "javascript");   // test basarisiz

    }

}
