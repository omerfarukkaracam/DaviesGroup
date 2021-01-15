package com.daviesgroup.tests;

import com.daviesgroup.utilities.ConfigurationReader;
import com.daviesgroup.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class TestBase {
    protected WebDriver driver;
    protected Actions action;
    protected WebDriverWait wait;
    protected String url;
    Logger logger
            = Logger.getLogger(
            TestBase.class.getName());

    @BeforeMethod
    public void setUpMethod(){
        url=ConfigurationReader.get("url");
        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action = new Actions(driver);
        wait = new WebDriverWait(driver,10);
        driver.get(url);
        driver.manage().window().maximize();

    }


    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
       //Close the driver
       Thread.sleep(1000);   //just to be able to see the last page, It should be removed!
       Driver.closeDriver();
    }
}