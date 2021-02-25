package com.libraryCT.step_definitions;


import com.libraryCT.pages.BorrowingBooksPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class borrowingBooksTable_StepDefinition {
    LoginPage loginPage = new LoginPage();
    BorrowingBooksPage borrowingBooksPage = new BorrowingBooksPage();

    @When("User login as a student")
    public void userLoginAsAStudent() {
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("usernameS1"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("passwordS1"));
        loginPage.signInButton.click();
    }

    @And("User click Borrowing Books module")
    public void userClickBorrowingBooksModule() {
        borrowingBooksPage.borrowingBooksModule.click();
        String actualResult = Driver.getDriver().getCurrentUrl();
        String expectedReslt = "#borrowing-books";
        Assert.assertTrue(actualResult.contains(expectedReslt));
    }

    @Then("User should see the following column names:")
    public void userShouldSeeTheFollowingColumnNames(List<String> columnNames) {
        List<WebElement> actualColumnNames = new ArrayList<>();
        actualColumnNames.addAll(Arrays.asList(borrowingBooksPage.Column1, borrowingBooksPage.Column2, borrowingBooksPage.Column3,
                borrowingBooksPage.Column4, borrowingBooksPage.Column5, borrowingBooksPage.Column6));

        for (int i = 0; i < columnNames.size(); i++) {
            Assert.assertTrue(columnNames.get(i).contains(actualColumnNames.get(i).getText()));



        }


    }


}
