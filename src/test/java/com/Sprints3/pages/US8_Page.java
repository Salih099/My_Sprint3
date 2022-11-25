package com.Sprints3.pages;

import com.Sprints3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US8_Page {
    public US8_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//tbody[@id='fileList']/tr//a[@class='action action-menu permanent']")
    public WebElement clickActionIcon;

    @FindBy(xpath = "//tbody[@id='fileList']/tr//a[@class='action action-menu permanent']/../../span/span")
    public List<WebElement> theFileThatWasDeleted;

    @FindBy(xpath = "//ul[@class='with-icon']/li/a")
    public List<WebElement> subModulesOptions;

    @FindBy(xpath = "(//tbody[@id='fileList'])[12]/tr//a/span[@class='nametext extra-data']/span[@class='innernametext']")
    public List<WebElement> eachNameOfTheFilesOnDeleteModule;


}
