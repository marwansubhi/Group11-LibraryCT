package com.libraryCT.pages;

import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage extends BasedPage {

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardModule;

    @FindBy(xpath = "//div//h2[@id='user_count']")
    public WebElement usersCount;

    @FindBy(xpath = "//h3[.='Book Management'] ")
    public WebElement bookManagementModule;

    @FindBy(xpath = "//*[@href='#users']")
    private WebElement usersLink;

    @FindBy(how = How.XPATH, using = "//*[@id='tbl_users']/thead/tr[1]/th")
    private List<WebElement> headerNames;

    public void clickUsersLink() {
        this.usersLink.click();
    }

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public boolean areNamesMatch(List<String> expectedNames) {
        List<String> actualNames = BrowserUtils.getElementsText(this.headerNames);
        if (actualNames.equals(expectedNames)) return true;
        else return false;
    }

}
