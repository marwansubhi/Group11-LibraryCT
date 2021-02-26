package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "navbarDropdown")
    public WebElement rightNavigationBAr;

    @FindBy(className = "dropdown-item")
    public WebElement logOutButton;

    @FindBy(linkText = "Users")
    public WebElement usersPageLink;

    @FindBy(xpath = "(//span[@class='title'])[2]")
    public WebElement borrowingBooksLink;

    @FindBy(linkText = "Books")
    public WebElement booksPageLink;

    @FindBy(linkText = "Dashboard")
    public WebElement dashboardPageLink;

    @FindBy(xpath = "//ul[@id='menu_item']//li")
    public List<WebElement> dashboard;
}

