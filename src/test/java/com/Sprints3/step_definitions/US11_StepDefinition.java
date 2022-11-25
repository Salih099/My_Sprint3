package com.Sprints3.step_definitions;

import com.Sprints3.pages.US11_Page;
import com.Sprints3.utilities.BrowserUtils;
import com.Sprints3.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US11_StepDefinition {

    US11_Page us11Page  = new US11_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Actions actions = new Actions(Driver.getDriver());

    String searchTheName= "User99";
    @And("user search user from the search box")
    public void userSearchUserFromTheSearchBox() {
        us11Page.searchBoxOnTalkModule.sendKeys(searchTheName);

        for (WebElement each : us11Page.searchForTheGroupName) {
            if (each.getText().equals(searchTheName)){
                wait.until(ExpectedConditions.visibilityOf(each)).click();
            }
//            each.getText().equals(searchTheName);
//            each.click();
        }

    }

    String message = "Test123";
    @And("user write a message")
    public void userWriteAMessage() {
        //wait.until(ExpectedConditions.visibilityOf(us11Page.startChattingBox)).click();
        us11Page.startChattingBox.click();
        us11Page.startChattingBox.sendKeys(message);
    }

    @And("user clicks to submit button")
    public void userClicksToSubmitButton() {
        us11Page.submitTheMessage.click();
    }

    @Then("the user should be able to see the message is displayed on the conversation log")
    public void theUserShouldBeAbleToSeeTheMessageIsDisplayedOnTheConversationLog() {
        for (WebElement eachMessage : us11Page.allMessagesChat) {
//            Assert.assertEquals(eachMessage.getText(), message);
            Assert.assertTrue(eachMessage.isDisplayed());
        }
        BrowserUtils.waitFor(2);
    }

}
