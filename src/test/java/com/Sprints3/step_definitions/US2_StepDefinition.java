package com.Sprints3.step_definitions;

import com.Sprints3.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US2_StepDefinition {
    LoginPage loginPage = new LoginPage();
    @When("user enter invalid {string} and {string}")
    public void userEnterInvalidAnd(String invalidUserName, String invalidPassWord) {
        loginPage.inputUsername.sendKeys(invalidUserName);
        loginPage.inputPassword.sendKeys(invalidPassWord);
    }

    @And("user click the login button")
    public void userClickTheLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("verify {string} message should be displayed")
    public void verifyMessageShouldBeDisplayed(String message) {
        Assert.assertEquals(message, loginPage.warningMessage.getText());
    }
}
