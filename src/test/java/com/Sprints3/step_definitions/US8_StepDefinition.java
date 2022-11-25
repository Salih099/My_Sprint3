package com.Sprints3.step_definitions;

import com.Sprints3.pages.US5_Page;
import com.Sprints3.pages.US8_Page;
import com.Sprints3.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US8_StepDefinition {
    US5_Page us5Page = new US5_Page();
    US8_Page us8Page = new US8_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    @And("user click action-icon from any file on the page")
    public void userClickActionIconFromAnyFileOnThePage() {
        wait.until(ExpectedConditions.visibilityOf(us8Page.clickActionIcon)).click();
    }

    @When("the user clicks the {string} sub-module on the left side")
    public void theUserClicksTheSubModuleOnTheLeftSide(String subModules) {
        for (WebElement each : us8Page.subModulesOptions) {
            if (each.getText().equals(subModules)){
                each.click();
                break;
            }
        }
    }

    @Then("Verify the deleted file is displayed on the page")
    public void verifyTheDeletedFileIsDisplayedOnThePage() {
        us5Page.fileName();
    }

}
