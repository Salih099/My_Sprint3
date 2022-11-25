package com.Sprints3.pages;

import com.Sprints3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adidas_Page {
    public Adidas_Page(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "(//a[@id='itemc'])[2]")
    public WebElement clickLaptops;

    @FindBy(xpath = "(//a[@href='prod.html?idp_=8'])[1]")
    public WebElement clickSonyVaioI5;

    @FindBy(xpath = "(//a[.='Add to cart'])")
    //  (//a[@onclick='addToCart(8)'])   <- other way to find
    public WebElement clickAddToCart;

}
