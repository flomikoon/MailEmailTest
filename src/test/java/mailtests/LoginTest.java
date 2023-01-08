package mailtests;

import Config.BaseTest;
import Page.MainPage;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class LoginTest extends BaseTest {

    String mail = "flomikoonforex1";
    String password = "lfifgjrf18P@";

    @Test
    @Owner("Pavel Krynskij")
    @Description("Вход в mail почту")
    public void failLogin(){
        MainPage mainPage = new MainPage();
        mainPage.clickStartLoginButton();
        Selenide.switchTo().frame($("iframe[class='ag-popup__frame__layout__iframe']"));
        mainPage.insertUserName(mail);
        mainPage.clickInsertPasswordButton();
        mainPage.insertPassword(password);
        mainPage.clickLoginButton();
        System.out.println("Test");
    }

    String correctmail = "flomikoonforex";
    @Test
    @Owner("Pavel Krynskij")
    @Description("Вход в mail почту")
    public void successLogin(){
        MainPage mainPage = new MainPage();
        mainPage.clickStartLoginButton();
        Selenide.switchTo().frame($("iframe[class='ag-popup__frame__layout__iframe']"));
        mainPage.insertUserName(correctmail);
        mainPage.clickInsertPasswordButton();
        mainPage.insertPassword(password);
        mainPage.clickLoginButton();
        System.out.println("Test");
    }
}
