package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BorrowingBooksPage {
    public BorrowingBooksPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//select[@id='user_list']/option")
    public WebElement userNameInUsers;

    @FindBy(xpath = "//section[@id='borrowing-books']//table//tr/th")
    public List<WebElement> tableHeaderNames;

    @FindBy(className = "card-header")
    public WebElement BorrowedBooksHeader;

    @FindBy(xpath = "//table//td[2]")
    public List<WebElement> namesOfBorrowedBooks;
}
