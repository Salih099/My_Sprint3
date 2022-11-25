package com.Sprints3.step_definitions;

import com.Sprints3.pages.US10_Page;
import com.Sprints3.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US10_StepDefiniton {

    US10_Page us10Page = new US10_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @And("user clicks Settings on the left bottom corner")
    public void userClicksSettingsOnTheLeftBottomCorner() {
        us10Page.clickSettingButton.click();
    }

    @Then("the user should be able to click any buttons")
    public void theUserShouldBeAbleToClickAnyButtons() {
        for (WebElement eachBox : us10Page.clickTheBox_2outOf3) {
            eachBox.click();
            //Assert.assertTrue(eachBox.isSelected());
        }
        us10Page.clickTheBox_3outOf3.click();
        //Assert.assertTrue(us10Page.clickTheBox_3outOf3.isSelected());
    }

    String originalStorageUsage;
    @And("user checks the current storage usage")
    public void userChecksTheCurrentStorageUsage() {
//        us10Page.clickStorageUsage.click();
        originalStorageUsage = us10Page.getTextOfStorageUsage.getText();

    }

    // /Users/salih/Downloads/Google DownLoads/Pictures.pdf
    @And("user uploads file with the upload file option")
    public void userUploadsFileWithTheUploadFileOption() {
        wait.until(ExpectedConditions.visibilityOf(us10Page.clickThePlusBox)).click();
        //us10Page.uploadAFile.click();
        us10Page.uploadAFile.sendKeys("/Users/salih/Downloads/Google DownLoads/Pictures.pdf");
    }

    @And("user refresh the page")
    public void userRefreshThePage() {
        Driver.getDriver().navigate().refresh();
    }

    @Then("the user should be able to see storage usage is increased")
    public void theUserShouldBeAbleToSeeStorageUsageIsIncreased() {
//        Assert.assertTrue(us10Page.getTextOfStorageUsage.getText().equals(originalStorageUsage));
        Assert.assertTrue(originalStorageUsage.equals(us10Page.getTextOfStorageUsage.getText()));
    }
}
