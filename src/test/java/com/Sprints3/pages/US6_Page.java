package com.Sprints3.pages;

import com.Sprints3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US6_Page {
    public US6_Page() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "(//a[@data-action='menu'][1]/span)[1]")
    public WebElement pressActionIcon;

       //span[@class='icon icon-star-dark']
    @FindBy(xpath = "(//div[@class='fileActionsMenu popovermenu bubble open menu']//a)[3]")
    public WebElement removeFromFavorites;


    @FindBy(xpath = "//a[@class='button new']/span[@class='icon icon-add']")
    public WebElement pressPlusIcon;
    //div[@class='actions creatable']//a[@class='button new'] <- same but different


//    @FindBy(xpath = "//div[@class='newFileMenu popovermenu bubble menu open menu-left']/ul/li")
//    public List<WebElement> chooseOneDocumentOptions;

//========================================================================
//    @FindBy(xpath = "//ul//label[@data-action='upload']")
//    public WebElement uploadFileButton; // <- old way
    @FindBy(xpath = "//ul/li//span[@class='displayname']")
    public List<WebElement> pickAnOptions;
//========================================================================
    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> allUploadedFiles;

}
