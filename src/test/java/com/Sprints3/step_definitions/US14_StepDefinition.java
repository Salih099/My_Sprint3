package com.Sprints3.step_definitions;

import com.Sprints3.pages.US14_Page;
import com.Sprints3.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US14_StepDefinition {

    US14_Page us14Page = new US14_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 9);

    @When("the user clicks the magnifier icon on the right top")
    public void theUserClicksTheMagnifierIconOnTheRightTop() {
        us14Page.clickTheMagnifierButton.click();
    }

    String searchText = "user";
    @And("users search any existing file\\/folder\\/user name")
    public void usersSearchAnyExistingFileFolderUserName() {
        wait.until(ExpectedConditions.visibilityOf(us14Page.searchBox)).sendKeys(searchText);
    }

    @Then("verify the app displays the expected result option")
    public void verifyTheAppDisplaysTheExpectedResultOption() {
        wait.until(ExpectedConditions.visibilityOf(us14Page.fileNameIsDisplayedOnSearchBar));
        Assert.assertTrue(us14Page.fileNameIsDisplayedOnSearchBar.getText().equalsIgnoreCase(searchText));

        //Assert.assertEquals(us14Page.fileNameIsDisplayedOnSearchBar.equals(searchText));
    }
}
