package org.skadate.UI.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.skadate.UI.dataProviders.ConfigReader;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage extends BasePage {
    public SelenideElement signIn = $x("/html/body/div[1]/div[1]/div/div[1]/div[1]/div/div[2]/div/div/div[1]");

    public SelenideElement userName =$x("//*[@id=\"input_base_identity\"]");


   public SelenideElement userPassword = $(By.id("input_base_password"));
   public SelenideElement submit =$(By.id("input_base_submit"));

   public SelenideElement forgotpassword = $x("//*[@id=\"form_base_sign-in\"]/div/div[1]/div[2]/div[3]/p[2]/a");
   public SelenideElement exit = $x("/html/body/div[1]/div/div[1]/div/div[2]/div/div/div[4]/div/div/div[2]/ul/li[8]/div/a");





    public LoginPage clickToSignIn() {
        elementActions.press(signIn);
        return this;
    }
    public LoginPage fillUpUsernameAndPassword() {
        userName.sendKeys(ConfigReader.getProperty("username"));
        userPassword.sendKeys(ConfigReader.getProperty("password"));
        submit.click();
        return this;
    }

    public LoginPage mandatoryfilds(){
        submit.click();
        return this;
    }

    public LoginPage invalidcred(){
        userName.setValue(fakerGenerator.randomfullName());
        userPassword.setValue(fakerGenerator.randompassword());
        submit.click();
        return this;
    }




}
