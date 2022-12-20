package com.arcane;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day03_C7_JavaFaker {
    //Cogunlukla test icin fake data kullaniriz
    //JavaFaker de fake DATA KULLANMAK ICIN OLUSTURULMUSTUR
    //Java fake dependency'i pox.xml eklemistik.
    @Test
    public void fakerTest(){
        //1.Faker data type 'nde object olustur
        Faker faker = new Faker();
        //2. Ardindan fake data kullanabiliriz: firstname, lastname, address, city, state, country

        String fName = faker.name().firstName();
        System.out.println(fName);
        String lName = faker.name().lastName();
        System.out.println(lName);
        String fullName = faker.name().fullName();
        System.out.println(fullName);

        //title
        System.out.println(faker.name().title());
        //city
        System.out.println(faker.address().city());
        //state
        System.out.println(faker.address().state());
        //phone nummer
        System.out.println(faker.phoneNumber().cellPhone());
        //cipcode/post code
        System.out.println(faker.address());
        //rastgele email adresi
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.number().digits(12));

        System.out.println(faker.lordOfTheRings().character());
        System.out.println(faker.animal().name());
        System.out.println(faker.avatar().image());

    }
}
