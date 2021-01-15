package com.daviesgroup.tests;

import com.daviesgroup.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AmazonTest {

    /**
     * navigate to amazon.com
     * type selenium in the searchbox
     * click search button
     */

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("https://www.amazon.co.uk/");


        //locate searchbox
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        //type selenium
        searchBox.sendKeys("Selenium");

        Thread.sleep(1000);
        //locate searchButton
        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));

        searchButton.click();

        String resultMessage = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();

        System.out.println(resultMessage);

        driver.quit();


    }


}
