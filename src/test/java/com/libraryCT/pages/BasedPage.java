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

}
