package com.Sprints3.pages;

import com.Sprints3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US10_Page {

    public US10_Page() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//div[@id='app-settings']/div[@id='app-settings-header']")
    public WebElement clickSettingButton;

    // This will click the first 2 of the checkboxes, While....
    @FindBy(xpath = "//div[@id='files-app-extra-settings']")
    public List<WebElement> clickTheBox_2outOf3;

    // .... this one will click the 3 checkbox
    @FindBy(xpath = "//div[@id='files-setting-showhidden']")
    public WebElement clickTheBox_3outOf3;

    @FindBy(xpath = "//a[@class='icon-quota svg']")
    public WebElement clickStorageUsage;
    @FindBy(xpath = "//a[@class='icon-quota svg']/p")
    public WebElement getTextOfStorageUsage;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement clickThePlusBox;
    @FindBy(xpath = "//label[@for='file_upload_start']")
    public WebElement uploadAFile;

}
