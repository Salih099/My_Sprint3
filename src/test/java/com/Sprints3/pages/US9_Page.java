package com.Sprints3.pages;

import com.Sprints3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US9_Page {
    public US9_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//tbody[@id='fileList']/tr//a[@class='action action-menu permanent']")
    public WebElement clickActionIcon;


}
