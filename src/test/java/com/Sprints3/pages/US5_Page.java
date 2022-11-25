package com.Sprints3.pages;

import com.Sprints3.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US5_Page {
    public US5_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']//a")
    public List<WebElement> allModules;

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public WebElement pressActionIcon;
    // a there ways you can see it --> //tbody[@id='fileList']//following-sibling::tr
    //tbody[@id='fileList']/tr//a[@class='action action-menu permanent']

    @FindBy(xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']/ul/li/a")
    public List<WebElement> pressAnyOptions;

    @FindBy(xpath = "//div[@id='app-navigation']/ul/li/a")
    public List<WebElement> subModule;

    @FindBy(xpath = "//div[@class='favorite-mark permanent']")
    public List<WebElement> theStarIsThere;

    @FindBy(xpath = "(//span[@class='innernametext'])[1]")
    public WebElement singleFileName;

    @FindBy(xpath = "//tbody/tr/td//span[@class='innernametext']")
    public List<WebElement> allFileNames;

    public void fileName(){
        String fileNameThatWasDeleted= "";
        for (WebElement each : allFileNames) {
            if (each.getText().equalsIgnoreCase(singleFileName.getText())){
                break;
            }
            fileNameThatWasDeleted += ""+each.getText();
        }
        Assert.assertEquals(singleFileName.getText(), fileNameThatWasDeleted);
    }

}
