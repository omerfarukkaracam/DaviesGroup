package com.daviesgroup.pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
public class AboutPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'About')]")
    public WebElement about;

    @FindBy(xpath = "//a[contains(text(),'Locations')]")
    public WebElement locationsLink;

    @FindBy(xpath = "//*[@id=\"desc0_0\"]")
    public WebElement location;


}
