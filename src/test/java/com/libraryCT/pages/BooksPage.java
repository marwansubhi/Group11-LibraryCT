package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BooksPage extends BasedPage {

    @FindBy(xpath = "//table//th")
    public List<WebElement> bookTableNames;

    @FindBy(xpath = "//table[@id='tbl_books']")
    public WebElement bookManagementTable;

    @FindBy(xpath = "//tbody//td[1]")
    public List<WebElement> borrowBookButton;

    @FindBy(xpath = "//tbody//td[1]/a")
    public List<WebElement> checkIfDisabled;

    @FindBy(xpath = "//select[@name='tbl_books_length']/option[7]")
    public WebElement showRecordsDropDown;

    @FindBy(xpath = "(//tr//a[not(contains(@class, \"disabled\"))])/../../td[3]")
    public List<WebElement> namesOfEnabledBooksToBorrow;

    @FindBy(xpath = "(//tr//a[not(contains(@class, \"disabled\"))])")
    public List<WebElement> enabledBooksToBorrow;

    @FindBy(xpath = "//a[@title='Last']/..")
    public WebElement lastBooksTablePage;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement successMessage;

}
