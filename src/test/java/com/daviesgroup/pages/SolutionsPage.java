package com.daviesgroup.pages;
import com.daviesgroup.utilities.BrowserUtils;
import com.daviesgroup.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SolutionsPage extends BasePage{

    public SolutionsPage(){ PageFactory.initElements(Driver.get(),this); }

    @FindBy(xpath = "//p[contains(text(),'View All')]")
    public WebElement viewAllButton;

    @FindBy(id="select2--container")
    public WebElement searchBox;

    @FindBy(className = "select2-search__field")
    public WebElement searchField;

    @FindBy(xpath = "(//h2[contains(text(),'Results')]/../p)[2]")
    public WebElement resultContent;

    public void clickViewAll() throws InterruptedException {
        Thread.sleep(500);
        BrowserUtils.scrollToElement(viewAllButton);
        BrowserUtils.clickWithJS(viewAllButton);

    }

    public void searchFor(String text){

        BrowserUtils.waitForPageToLoad(5);
        searchBox.click();
        searchField.sendKeys( text+ Keys.ENTER);
    }

}
