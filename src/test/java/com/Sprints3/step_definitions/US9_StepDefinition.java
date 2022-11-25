package com.Sprints3.step_definitions;

import com.Sprints3.pages.US9_Page;
import com.Sprints3.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US9_StepDefinition {
    US9_Page us9Page = new US9_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @And("user click action-icon  from any file on the page")
    public void userClickActionIconFromAnyFileOnThePage() {
        wait.until(ExpectedConditions.visibilityOf(us9Page.clickActionIcon)).click();
    }

    @And("user write a comment inside the input box")
    public void userWriteACommentInsideTheInputBox() {

    }

    @And("user click the submit button to post it")
    public void userClickTheSubmitButtonToPostIt() {

    }

    @Then("Verify the comment is displayed in the comment section")
    public void verifyTheCommentIsDisplayedInTheCommentSection() {

    }

}
