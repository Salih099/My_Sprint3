package com.Sprints3.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy (css = "input#user")
    public WebElement inputUsername;

    @FindBy (css = "input#password")
    public WebElement inputPassword;

    @FindBy (css = "input#submit-form")
    public WebElement loginButton;

    public void login(String userName, String passWord){
        inputUsername.sendKeys(userName);
        inputPassword.sendKeys(passWord);
        loginButton.click();
    }

    @FindBy(className = "warning_wrongPasswordMsg")
    public WebElement warningMessage;

}
