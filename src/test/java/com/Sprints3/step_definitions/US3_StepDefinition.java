package com.Sprints3.step_definitions;

import com.Sprints3.pages.LoginPage;
import com.Sprints3.pages.US3_Page;
import com.Sprints3.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US3_StepDefinition {
    US3_Page us3Page = new US3_Page();
    LoginPage loginPage = new LoginPage();

    @When("the users log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
        loginPage.login(ConfigurationReader.getProperty("user92"), ConfigurationReader.getProperty("password"));
    }

    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModuleNames) {

        List<String> actualModuleNames = us3Page.getModulesText();
        Assert.assertEquals(expectedModuleNames, actualModuleNames);

//        for (WebElement each : us3Page.allModuleText) {
//            if (each.getAttribute("aria-label").equals(expectedModuleNames)){
//                each.getText();
//            }
//        }
//============================
//           List<String> actualModuleNames = new DashboardPage().getModulesText();
//           Assert.assertEquals(expectedModuleNames,actualModuleNames);
//============================
        // List<String> elemTexts = new ArrayList<>();
        //        for (WebElement el : list) {
        //            elemTexts.add(el.getText());
        //        }
        //        return elemTexts;

    }

}
