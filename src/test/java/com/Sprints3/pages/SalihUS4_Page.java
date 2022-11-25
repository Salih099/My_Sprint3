package com.Sprints3.pages;

import com.Sprints3.utilities.BrowserUtils;
import com.Sprints3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalihUS4_Page {
    public SalihUS4_Page(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//ul[@id='appmenu']/li")
    public List<WebElement> allModules;

    // (//thead)[1]//label[@for='select_all_files']
    //
    @FindBy(xpath = "(//th[@id='headerSelection'])[1]/label")
    public WebElement selectAllCheckBox;

    @FindBy(xpath = "//tbody[@id='Userpass123']//label")
    public List<WebElement> isSelected;

    @FindBy(xpath = "//ul[@id='appmenu']/li[@id='more-apps']/preceding-sibling::li")
    public List<WebElement> modules;

    public void clickModulesWithText(String moduleName) {

        for (int i = 0; i < allModules.size() - 1; i++) {
            BrowserUtils.hover(allModules.get(i));
            if (allModules.get(i).getText().equals(moduleName)) {
                BrowserUtils.clickElement(allModules.get(i));
                break;
            }
        }
    }

}
