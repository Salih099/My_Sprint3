package com.Sprints3.step_definitions;

import com.Sprints3.pages.Adidas_Page;
import com.Sprints3.utilities.BrowserUtils;
import com.Sprints3.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adidas_StepDefinition {
    Adidas_Page adidasPage = new Adidas_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
    Alert alert = Driver.getDriver().switchTo().alert();
    @Given("customer goes to the website")
    public void customer_goes_to_the_website() {
        Driver.getDriver().get("https://www.demoblaze.com/index.html");

    }

    @When("Navigate to Laptop → Sony vaio i5 and click on Add to cart. Accept pop up confirmation.")
    public void navigateToLaptopSonyVaioIAndClickOnAddToCartAcceptPopUpConfirmation() {
       BrowserUtils.waitForPageToLoad(4);
       adidasPage.clickLaptops.click();
       BrowserUtils.waitForPageToLoad(4);
       adidasPage.clickSonyVaioI5.click();
       BrowserUtils.waitForPageToLoad(4);
       adidasPage.clickAddToCart.click();
    }


//    @When("Click on {string}.")
//    public void clickon(String placeorder) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("Fill in all web form fields.")
//    public void fill_in_all_web_form_fields() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("Click on {string}")
//    public void click_on(String asdf) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("Capture and log purchase Id and Amount.")
//    public void capture_and_log_purchase_id_and_amount() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Assert purchase amount equals expected.")
//    public void assert_purchase_amount_equals_expected() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Click on {string}")
//    public void click_on(String strasdfing) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
}
