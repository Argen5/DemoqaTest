package org.skadate.UI.element_helper;
import com.github.javafaker.Faker;

import java.text.NumberFormat;
import java.util.Locale;

public class FakerGenerator {
    Faker faker = new Faker();

    public String randomfullName(){
        return faker.name().fullName();
    }
    public String randompassword(){
        return faker.internet().password();
    }

    public String randomFirstName(){
        return faker.name()
                .firstName();
    }
    public String randomLastName(){
        return faker.name().lastName();
    }
    public String randomAge(){
        int minAge = 15;
        int maxAge = 65;
        Integer randomAge =faker.number().numberBetween(minAge,maxAge);
        return randomAge.toString();
    }
    public String randomSalary(){
        int minSalary = 5000;
        int maxSalary = 100000;
        Integer randomSalary = faker.number().numberBetween( minSalary, maxSalary);
        return randomSalary.toString();
    }
    public String randomDepartment(){
        return faker.job().position();
    }

    public String randomEmail(){
        return faker.internet().emailAddress();
    }
    public String randomCurrentAddress(){
        return faker.address().streetAddressNumber();
    }
}
