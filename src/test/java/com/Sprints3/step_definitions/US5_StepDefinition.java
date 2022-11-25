package com.Sprints3.step_definitions;

import com.Sprints3.pages.US5_Page;
import com.Sprints3.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US5_StepDefinition {
    US5_Page us5Page = new US5_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
//    @Given("user on the dashboard page")
//    public void userOnTheDashboardPage() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
//        loginPage.login(ConfigurationReader.getProperty("user92"),ConfigurationReader.getProperty("password"));
//    }
//
//    @When("the user clicks the {string} module")
//    public void theUserClicksTheModule(String module) {
//
//        for (WebElement each : us5Page.allModules) {
//            if (each.getAttribute("aria-label").equals(module)){
//                each.click();
//                break;
//            }
//        }
//    }

    @When("the user clicks action-icon from any file on the page")
    public void theUserClicksActionIconFromAnyFileOnThePage() {
        wait.until(ExpectedConditions.visibilityOf(us5Page.pressActionIcon)).click();
    }

    @And("user choose the {string} option")
    public void userChooseTheOption(String optionName) {
        for (WebElement each : us5Page.pressAnyOptions) {
            if (each.getAttribute("class").equals(optionName)){
                each.getText();
                each.click();
                break;
            }
        }

    }

    @And("user click the {string} sub-module on the left side")
    public void userClickTheSubModuleOnTheLeftSide(String subModule) {
        for (WebElement each : us5Page.subModule) {
            if (each.getAttribute("class").equals(subModule)){
                each.click();
                break;
            }
        }
    }

    @Then("Verify the chosen file is listed on the table")
    public void verifyTheChosenFileIsListedOnTheTable() {
        for (WebElement each : us5Page.theStarIsThere) {
            Assert.assertTrue(each.isEnabled());
            break;
        }
    }
}
