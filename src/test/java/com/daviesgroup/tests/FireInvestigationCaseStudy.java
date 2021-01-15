package com.daviesgroup.tests;

import com.daviesgroup.pages.SolutionsPage;
import com.daviesgroup.utilities.BrowserUtils;
import com.daviesgroup.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FireInvestigationCaseStudy extends TestBase {


    @Test(description = "Navigate to Fire Investigation Case Study")
    public void test() throws InterruptedException {
      //  Click on ‘Solutions’ – Scroll down and click on ‘View All’  – look for ‘Fire investigation’ Case study and click on it
        SolutionsPage solutionsPage=new SolutionsPage();
        solutionsPage.navigateToPage("Solutions");
        BrowserUtils.waitFor(5);
        solutionsPage.clickViewAll();
        solutionsPage.searchFor("Fire investigation");
        Assert.assertEquals(Driver.get().getTitle(),"Fire investigation - Davies","Validate if it’s navigated to right page");

        //Capture the Results section from ‘Fire Investigation’ case study.
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(false);", solutionsPage.resultContent);
        logger.info("Results: "+solutionsPage.resultContent.getText());

    }
}