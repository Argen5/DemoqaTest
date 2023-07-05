package ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.skadate.UI.page.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public abstract class BaseUiTest {
   private static Logger logger = LogManager.getLogger(BaseUiTest.class);
  public LoginPage loginPage;

   @BeforeClass
    public void setup(){
       loginPage = new LoginPage();
       Configuration.browserSize = "1920x1080";
     open("http://host1861282.hostland.pro/");
   }

   @AfterClass
   public void tearDown() {
      Selenide.closeWebDriver();
   }


}
