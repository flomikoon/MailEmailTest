package Config;

import org.openqa.selenium.WebDriver;

abstract public class BasePage {
    protected static WebDriver driver;

    protected BasePage(){
    }

    public static void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }


}
