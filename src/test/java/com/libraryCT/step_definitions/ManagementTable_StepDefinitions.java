package com.libraryCT.step_definitions;

import com.libraryCT.pages.DashboardPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ManagementTable_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @Given("the user login as a librarian and be on the home page")
    public void the_user_login_as_a_librarian_and_be_on_the_home_page() {

       // Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        String username = ConfigurationReader.getProperty("usernameL");
        String password = ConfigurationReader.getProperty("passwordL");
        loginPage.loginAsLibrarian(username,password);

    }

    @When("the user click users module")
    public void the_user_click_users_module() {
        wait.until(ExpectedConditions.urlContains("dashboard"));
        // Write code here that turns the phrase above into concrete actions
        dashboardPage.clickUsersLink();

    }


    @Then("user should see the following")
    public void user_should_see_the_following(List<String> dataTable) {

        Assert.assertTrue( dashboardPage.areNamesMatch(dataTable));
    }
}
