package com.Sprints3.step_definitions;

import com.Sprints3.pages.US6_Page;
import com.Sprints3.pages.US7_Page;
import com.Sprints3.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US7_StepDefinition {
    US6_Page us6Page = new US6_Page();
    US7_Page us7Page = new US7_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    String enterFileName = "Test123";
    Actions actions = new Actions(Driver.getDriver());

    @And("user clicks the add icon on the top")
    public void userClicksTheAddIconOnTheTop() {
        wait.until(ExpectedConditions.visibilityOf(us7Page.pressPlusIcon)).click();
       //actions.moveToElement(us7Page.pressPlusIcon).click().perform();
    }

    @And("user click {string}")
    public void userClick(String file) {
        for (WebElement each : us7Page.pressNewFolderButton) {
            if (each.getAttribute("data-templatename").equalsIgnoreCase(file)){
                each.click();
            }
        }
    }

    @And("user write a folder name")
    public void userWriteAFolderName() {
        wait.until(ExpectedConditions.visibilityOf(us7Page.enter_NewFileName)).sendKeys(enterFileName);
    }

    @When("the user click submit icon")
    public void theUserClickSubmitIcon() {
        us7Page.click_FileSubmitButton.click();
    }

    @Then("Verify the folder is displayed on the page")
    public void verifyTheFolderIsDisplayedOnThePage() {
        for (WebElement eachFiles : us7Page.allTheFiles) {
            if (eachFiles.getAttribute("data-file").equals(enterFileName)){
                Assert.assertTrue(eachFiles.isDisplayed());
            }
        }
    }

//====================================================================

    @And("user choose a folder from the page")
    public void userChooseAFolderFromThePage() {
        wait.until(ExpectedConditions.visibilityOf(us7Page.aFileToClick)).click();
    }

    String img = "/Users/salih/Desktop/ScreenShots/In case of fire.png";
    @When("the user uploads a file with the upload file option")
    public void theUserUploadsAFileWithTheUploadFileOption() {
        //us7Page.uploadFileButton.click();
        wait.until(ExpectedConditions.visibilityOf(us7Page.uploadFileButton)).sendKeys(img);
    }

    @Then("Verify the file is displayed on the page")
    public void verifyTheFileIsDisplayedOnThePage() {
        for (WebElement each : us7Page.filesThatGotUploaded) {
            if (each.getText().contains(img)){
                Assert.assertTrue(each.isDisplayed());
            }
        }
    }

}
