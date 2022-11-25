package com.Sprints3.step_definitions;

import com.Sprints3.pages.US6_Page;
import com.Sprints3.pages.US7_Page;
import com.Sprints3.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US6_StepDefinition {
// waitForVisibility
    US6_Page us6Page = new US6_Page();
    US7_Page us7Page = new US7_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    //@US6.1
    @When("the users click action-icon from any file on the page to remove")
    public void theUsersClickActionIconFromAnyFileOnThePageToRemove() {
        wait.until(ExpectedConditions.visibilityOf(us6Page.pressActionIcon)).click();
    }

    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verifyThatTheFileIsRemovedFromTheFavoritesSubModuleSTable() {
        Assert.assertTrue(us6Page.removeFromFavorites.isDisplayed());
    }

//==========================================================================================
    //@US6.2
    @When("the user clicks the add icon on the top")
    public void theUserClicksTheAddIconOnTheTop() {
        wait.until(ExpectedConditions.visibilityOf(us6Page.pressPlusIcon)).click();
    }

    String verifyUploadedFileName = "";
//========================================================================
/*
    @And("users uploads file with the upload file option")
    public void usersUploadsFileWithTheOption() {
//        for (WebElement each : us6Page.chooseOneDocumentOptions) {
//            each.click();
//            each.click();
//            if (each.getAttribute("class").equalsIgnoreCase(uploadFile)){
//                each.click();
//                each.sendKeys("/Users/salih/Desktop/ScreenShots/In case of fire.png");
//            }
//        }
        String uploadedFileName = "In case of fire.png";
        verifyUploadedFileName += uploadedFileName;
        //wait.until(ExpectedConditions.visibilityOf(us6Page.uploadFileButton)).click();
        us6Page.uploadFileButton.sendKeys("/Users/salih/Desktop/ScreenShots/"+uploadedFileName);
    }
 */
//========================================================================
    @And("users uploads file with the {string} option")
    public void usersUploadsFileWithTheOption(String options) {

        String uploadedFileName = "In case of fire.png";
        verifyUploadedFileName += uploadedFileName;
        for (WebElement eachOption : us6Page.pickAnOptions) {
            if (eachOption.getText().equalsIgnoreCase(options)){
                //wait.until(ExpectedConditions.visibilityOf(us6Page.uploadFileButton)).click();
                us7Page.uploadFileButton.sendKeys("/Users/salih/Desktop/ScreenShots/"+uploadedFileName);
            }
        }

    }

    @Then("verify the file is displayed on the page")
    public void verifyTheFileIsDisplayedOnThePage() {

        for (WebElement eachFile : us6Page.allUploadedFiles) {
            if (eachFile.getAttribute("data-file").equals(verifyUploadedFileName)){
               Assert.assertTrue(eachFile.isDisplayed());
            }
        }


    }

}
