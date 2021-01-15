package com.daviesgroup.pages;

import com.daviesgroup.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DefaultPage extends BasePage {

    public DefaultPage(){ PageFactory.initElements(Driver.get(),this); }



}
