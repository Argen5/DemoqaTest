package org.skadate.UI.element_helper;
import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;

public class WebElementActions {


    private static Logger logger = LogManager.getLogger(WebElementActions.class);




    public WebElementActions input(SelenideElement element, String txt){
        logger.warn("I'm trying to write " + txt + " " + element);
        element.clear();
        element.sendKeys(txt);
        logger.info("Succesfully write");
        return this;
    }

    public WebElementActions press(SelenideElement element){
        logger.warn("Trying to click the " + element);
        element.click();
        logger.info("Successfully clicked");
        return this;
    }



    public WebElementActions pressDownAndEnter(SelenideElement element){
        element.sendKeys(Keys.DOWN,Keys.ENTER);
        return this;
    }
    public static void pause(Integer milliseconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        }catch (InterruptedException e){
            System.out.println("error seconds");
        }
    }


    public WebElementActions pressUpAndEnter(SelenideElement element){

        element.sendKeys(Keys.UP,Keys.ENTER);
        return this;
    }

}
