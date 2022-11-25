package com.Sprints3.pages;

import com.Sprints3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US7_Page {
    public US7_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul/li/a[@class='menuitem']")
    public List<WebElement> pressNewFolderButton;

    @FindBy(xpath = "//ul/li/a[@class='menuitem']")
    public WebElement enter_NewFileName;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement click_FileSubmitButton;

    @FindBy(xpath = "//tbody[@id='fileList']/tr")
    public List<WebElement> allTheFiles;

//====================================================================

    @FindBy(xpath ="(//tbody[@id='fileList']/tr[@data-type='dir'])[1]")
    public WebElement aFileToClick;

    @FindBy(xpath = "//ul//label[@data-action='upload']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//tbody[@id='fileList']//span[@class='innernametext']")
    public List<WebElement> filesThatGotUploaded;

    @FindBy(xpath = "//a[@class='button new']/span[@class='icon icon-add']/..")
    public WebElement pressPlusIcon;


}
