package ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class LoginTests extends BaseUiTest{
    @Test(priority = 3)
    @Description("Verify that user can login with valid credentials")
    @Feature("Login")
    public void SignInTest(){
        loginPage.clickToSignIn();
        sleep(4000);
        loginPage  .fillUpUsernameAndPassword();
        SelenideElement loggedInUsername = $x("/html/body/div[1]/div[1]/div/div[1]/div[1]/div/div[2]/div/div/div[1]");
        String expectedUsername = "UPGRADE";
        loggedInUsername.shouldHave(text(expectedUsername));
    }
    @Test(priority = 1)
    @Description("Validation of mandatory fields")
    @Feature("Login")
    public void testMandatoryFields(){
        loginPage.clickToSignIn().
                mandatoryfilds();
        $("body > div.ow_message_cont > div > div > div").shouldHave(text("Please fill the form properly"));
        refresh();
    }
    @Test(priority = 2)
    @Description("Login with incorrect credentials")
    @Feature("Login")
    public void testincorrectcredentialss(){
        refresh();
        loginPage.clickToSignIn().invalidcred();
        $("body > div.ow_message_cont > div > div > div").shouldHave(text("Invalid username or email"));
        refresh();
    }
}
