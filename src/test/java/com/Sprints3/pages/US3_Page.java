package com.Sprints3.pages;

import com.Sprints3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class US3_Page {
    Actions actions = new Actions(Driver.getDriver());

    public US3_Page(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//ul[@id='appmenu']/li")
    public List<WebElement> allModules;

    @FindBy(xpath = "//ul[@id='appmenu']/li[@id='more-apps']/preceding-sibling::li/a")
    public List<WebElement> allModuleText;

    public List<String> getModulesText(){

        List<String> modulesText = new ArrayList<>();
        for (int i = 0; i < allModules.size() -1; i++) {
            actions.moveToElement(allModules.get(i)).perform();
            modulesText.add(allModules.get(i).getText());
        }
        return modulesText;
    }

}
