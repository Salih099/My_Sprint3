package com.Sprints3.step_definitions;

import com.Sprints3.pages.LoginPage;
import com.Sprints3.pages.SalihUS4_Page;
import com.Sprints3.utilities.ConfigurationReader;
import com.Sprints3.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalihUS4_StepDefinition {
    SalihUS4_Page us4Page = new SalihUS4_Page();
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.login(ConfigurationReader.getProperty("user92"),ConfigurationReader.getProperty("password"));
    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String module) {
//        for (WebElement each : us4Page.allModules) {
//            if (each.getAttribute("aria-label").equals(module)){
//                each.click();
//                break;
//            }
//        }
        us4Page.clickModulesWithText(module);
    }

    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String expectedTitle) {
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

//    ==================================================


    @And("user click the top-left checkbox of the table")
    public void userClickTheTopLeftCheckboxOfTheTable() {
        wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(By.xpath("(//th[@id='headerSelection'])[1]/label")))).click();

    }

    @Then("verify all the files are selected")
    public void verifyAllTheFilesAreSelected() {
        for (WebElement each : us4Page.isSelected) {
            Assert.assertTrue(each.isSelected());
        }
    }
}
