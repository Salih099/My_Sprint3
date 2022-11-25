package com.Sprints3.pages;

import com.Sprints3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US11_Page {
    public US11_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchBoxOnTalkModule;

    @FindBy(xpath = "//ul[@class='app-navigation__list']//span[@class='acli__content__line-one__title']")
    public List<WebElement> searchForTheGroupName;

    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement startChattingBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitTheMessage;

    @FindBy(xpath = "//div[@class='rich-text--wrapper']")
    public List<WebElement> allMessagesChat;

}
