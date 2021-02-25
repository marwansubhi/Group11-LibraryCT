package com.libraryCT.step_definitions;

import com.libraryCT.pages.*;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import io.cucumber.java.et.Ja;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BorrowedBooks_StepDefinition extends LoginPage {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    DashboardPage dashboardPage = new DashboardPage();
    BooksPage booksPage = new BooksPage();
    BorrowingBooksPage borrowingBooksPage = new BorrowingBooksPage();
    String borrowedBookName;

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User logs in using {string} and {string}")
    public void user_logs_in_using_and(String userName, String password) {
        usernameBox.sendKeys(userName);
        passwordBox.sendKeys(password);
        signInButton.click();
    }

    @When("User lands on Dashboard page")
    public void user_lands_on_dashboard_page() {
        wait.until(ExpectedConditions.visibilityOf(accountName));
        Assert.assertTrue(dashboardPage.bookManagementModule.isDisplayed());
    }

    @When("User goes to Books module")
    public void user_goes_to_books_module() {
        booksModule.click();
        wait.until(ExpectedConditions.visibilityOf(booksPage.bookManagementTable));
    }

    @When("User lends a book if it's available")
    public void user_lends_a_book_if_it_s_available() {
        booksPage.showRecordsDropDown.click();//sets to 500
        booksPage.lastBooksTablePage.click();
        List<WebElement> listOfEnabledToBorrowBooks = new ArrayList<>(booksPage.enabledBooksToBorrow);
        borrowedBookName = booksPage.namesOfEnabledBooksToBorrow.get(0).getText();
        if (!listOfEnabledToBorrowBooks.isEmpty()) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click()", listOfEnabledToBorrowBooks.get(0));
        }
    }

    @Then("User should see the Success message")
    public void user_should_see_the_success_message() {
        Assert.assertTrue(booksPage.successMessage.isDisplayed());
    }

    @Given("User goes to the Borrowing Book module")
    public void user_goes_to_the_borrowing_book_module() {
        borrowingBooksModule.click();
    }

    @Given("User's name is {string}")
    public void user_s_name_is(String string) {
        Assert.assertEquals(string, borrowingBooksPage.userNameInUsers.getText());
    }

    @Then("User can see the borrowed book in the list of his borrowed books")
    public void user_can_see_the_borrowed_book_in_the_list_of_his_borrowed_books() {
        List<String> booksNames = new ArrayList<>();
        for (WebElement eachBookName : borrowingBooksPage.namesOfBorrowedBooks) {
            booksNames.add(eachBookName.getText());
        }
        Assert.assertTrue(booksNames.contains(borrowedBookName));

    }

}
