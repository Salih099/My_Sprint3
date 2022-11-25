package com.Sprints3.pages;

import com.Sprints3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US13_Page {
    public US13_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='active'])[1]")
    public WebElement contactsModuleButton;

    @FindBy(xpath = "//div[@class='vue-recycle-scroller__item-wrapper']/div")
    public List<WebElement> allContactNames;

}
