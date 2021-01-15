package com.daviesgroup.pages;

import com.daviesgroup.utilities.BrowserUtils;
import com.daviesgroup.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public abstract class BasePage {
    public BasePage(){ PageFactory.initElements(Driver.get(),this); }

    @FindBy(xpath = "//a[@href='https://twitter.com/Davies_Group']")
    public WebElement twitterButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/daviesgroup/']")
    public WebElement linkedInButton;


    public ArrayList<String> getWindowTitles(){
        Set<String> windows = Driver.get().getWindowHandles();

            ArrayList<String> windowTitles =new ArrayList<>();
            Iterator<String> window = windows.iterator();

            do {
                String windowHandle = window.next().toString();
                Driver.get().switchTo().window(windowHandle);
                BrowserUtils.waitForPageToLoad(5);
                windowTitles.add(Driver.get().getTitle());

        } while (window.hasNext());

        return windowTitles;
    }

    public void navigateToPage(String title){
        WebElement page=Driver.get().findElement(By.xpath("(//a[text()='"+title+"'])[1]"));
        page.click();
    }






}


