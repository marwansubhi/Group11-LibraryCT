package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasedPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='inputEmail']")
    public WebElement usernameInput;

    @FindBy(xpath = "//*[@id='inputPassword']")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//img[@class='mb-4']")
    public WebElement loginLogo;

    @FindBy(id = "inputEmail")
    public WebElement usernameBox;

    @FindBy(id = "inputPassword")
    public WebElement passwordBox;

    @FindBy(className = "mt-5 mb-3 text-muted text-center")
    public WebElement yearText;


}
