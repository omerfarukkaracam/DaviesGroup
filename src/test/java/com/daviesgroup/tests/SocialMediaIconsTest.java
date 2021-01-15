package com.daviesgroup.tests;

import com.daviesgroup.pages.DefaultPage;
import com.daviesgroup.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SocialMediaIconsTest extends TestBase {

    @Test(description = "Click on Twitter and LinkedIn Icons and Verify")
    public void test() {

        BrowserUtils.scrollToEndOfPage();
        DefaultPage defaultPage = new DefaultPage();
        defaultPage.twitterButton.click();
        defaultPage.linkedInButton.click();

        ArrayList<String> windowTitles = defaultPage.getWindowTitles();
        List<String> expectedTitles = new ArrayList<>(Arrays.asList("Home - Davies", "Sign Up | LinkedIn", "Davies Group (@Davies_Group) / Twitter"));
        System.out.println("expectedTitles.toString() = " + expectedTitles.toString());
        Assert.assertEquals(defaultPage.getWindowTitles(), expectedTitles, "Verify that social media pages are successfully opened");

    }
}