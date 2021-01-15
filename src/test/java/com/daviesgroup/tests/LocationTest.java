package com.daviesgroup.tests;

import com.daviesgroup.pages.AboutPage;
import com.daviesgroup.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class LocationTest extends TestBase{

    @Test(description = "Capture Stoke Office address from the Maps")
    public void test(){
        AboutPage aboutPage=new AboutPage();
        BrowserUtils.hover(aboutPage.about);
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(aboutPage.locationsLink);
        BrowserUtils.scrollToElement(aboutPage.location);
        logger.info("Stoke Office address: "+aboutPage.location.getText());
    }
}
