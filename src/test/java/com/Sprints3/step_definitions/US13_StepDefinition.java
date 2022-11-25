package com.Sprints3.step_definitions;

import com.Sprints3.pages.US13_Page;
import com.Sprints3.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US13_StepDefinition {
    US13_Page us13Page = new US13_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 9);

    @When("the user clicks the contacts module")
    public void theUserClicksTheContactsModule() {
        wait.until(ExpectedConditions.visibilityOf(us13Page.contactsModuleButton)).click();
    }

    @Then("verify the contact names are in the list")
    public void verifyTheContactNamesAreInTheList() {
        for (WebElement eachNames : us13Page.allContactNames) {
            Assert.assertTrue(eachNames.isDisplayed());
        }
    }
}
