package com.libraryCT.step_definitions;

import com.libraryCT.pages.DashboardPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.UsersPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BookRecords_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    UsersPage usersPage = new UsersPage();
    DashboardPage dashboardPage = new DashboardPage();
    Select select;

//    @Given("User on the login page")
//    public void user_on_the_login_page() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//    }

    @Given("User login as a librarian")
    public void user_login_as_a_librarian() {
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("usernameL"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("passwordL"));
        loginPage.signInButton.click();

    }
//    @When("User clicks on {string} link")
//    public void user_clicks_on_link(String string) {
//    dashboardPage.usersPageModule.click();
//
//    }
//    @When("Show records default value should be {int}")
//    public void show_records_default_value_should_be(Integer expected) {
//
//        BrowserUtils.waitForVisibility(usersPage.showRecordsDropdown, 5);
//
//        select = new Select(usersPage.showRecordsDropdown);
//        String actual = select.getFirstSelectedOption().getText();
//
//        Assert.assertEquals(expected + "", actual);
//
//    }


    @Then("Show records should have following options")
    public void show_records_should_have_following_options(List<String> options) {
        BrowserUtils.wait(2);
        select = new Select(usersPage.showRecordsDropdown);
        List<WebElement> webElements = select.getOptions();
        List<String> actualText = BrowserUtils.getElementsText(webElements);

        Assert.assertEquals(options, actualText);
    }




}
