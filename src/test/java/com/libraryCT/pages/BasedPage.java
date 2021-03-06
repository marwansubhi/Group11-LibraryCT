package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasedPage {
    public BasedPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[.='Log Out']")
    public WebElement logoutButton;

    @FindBy(xpath = "//*[@id='navbarDropdown']")
    public WebElement logoutDropdown;

    @FindBy(xpath = "//*[.='Books']")
    public WebElement booksModule;

    @FindBy(xpath = "//*[@class='navbar-brand']")
    public WebElement libraryText;

    @FindBy(xpath = "//a[@href='#users']")
    public WebElement usersPageModule;

    @FindBy(xpath = "//a[@href='#books']")
    public WebElement booksPageModule;

    @FindBy(xpath = "//a[@href='#dashboard']")
    public WebElement dashboardPageModule;

    @FindBy(xpath = "//a[@id='navbarDropdown']")
    public WebElement accountHolderLink;

    @FindBy(xpath = "//a[@href='#borrowing-books']")
    public WebElement borrowingBooksModule;

    @FindBy(xpath = "//a[@id='navbarDropdown']//span")
    public WebElement accountName;

}
