package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US1_login_app_stepDefinition {
    LoginPage loginPage = new LoginPage();

    @Given("the user login as a {string} and {string}")
    public void the_student_login_as_a(String userName, String password) {
        //Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty(userName));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty(password));
        loginPage.signInButton.click();

    }

    @Then("the {string} on {string}")
    public void the_on(String string, String string2) {
        //BrowserUtils.wait
        String actualUrl = Driver.getDriver().getCurrentUrl();
       // Assert.assertTrue(actualUrl.contains(expected));

    }

    @Given("the student login as a {string} and {string}")
    public void theStudentLoginAsAAnd(String arg0, String arg1) {
    }
}
