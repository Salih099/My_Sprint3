package com.Sprints3.pages;

import com.Sprints3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US14_Page {
    public US14_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy(xpath = "//a[@class='header-menu__trigger']")
    public WebElement clickTheMagnifierButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='unified-search__result-content']//strong")
    public WebElement fileNameIsDisplayedOnSearchBar;

}
