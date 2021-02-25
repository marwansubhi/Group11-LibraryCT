package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasedPage {

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardModule;

    @FindBy(xpath = "//div//h2[@id='user_count']")
    public WebElement usersCount;

    @FindBy(xpath = "//h3[.='Book Management'] ")
    public WebElement bookManagementModule;


}
