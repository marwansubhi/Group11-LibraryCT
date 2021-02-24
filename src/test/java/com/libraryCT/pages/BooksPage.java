package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BooksPage extends BasedPage{

    @FindBy(xpath = "//table//th")
    public List<WebElement> bookTableNames;


}
