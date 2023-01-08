package Page;

import Config.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage extends BasePage {
    private SelenideElement startLogin = $("button[class='resplash-btn resplash-btn_primary resplash-btn_mailbox-big svelte-1y37831']");
    private SelenideElement userName = $("input[name='username']");
    private SelenideElement password = $("input[name='password']");
    private SelenideElement loginButton = $("button[type='submit'][class='base-0-2-79 primary-0-2-93']");
    private SelenideElement insertPassword = $("button[type='submit'][class='base-0-2-79 primary-0-2-93']");



    public MainPage(){
        open("https://mail.ru");
    }

    @Step("Нажимаем на кнопку войти")
    public void clickStartLoginButton(){
        startLogin.click();
    }

    @Step("Вводим логин {username}")
    public void insertUserName(String username){
        userName.sendKeys(username);
    }

    @Step("Нажимаем на кнопку ввести пароль {username}")
    public void clickInsertPasswordButton(){
        insertPassword.click();
    }
    @Step("Вводим пароль {passwordText}")
    public void insertPassword(String passwordText){
        password.sendKeys(passwordText);
    }
    @Step("Нажимаем на кнопку войти")
    public void clickLoginButton(){
        loginButton.click();
    }
}
