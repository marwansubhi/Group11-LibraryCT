package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("librarian on the login page")
    public void librarian_on_the_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);


    }

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
        String username = ConfigurationReader.getProperty("usernameL");
        String password = ConfigurationReader.getProperty("passwordL");
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);


    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        String expected = "dashboard";

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains(expected));

        String actual = Driver.getDriver().getCurrentUrl();
        System.out.println("actual = " + actual);
        Assert.assertTrue(actual.contains(expected));

    }


    @When("student on the login page")
    public void student_on_the_login_page() {
        String url = ConfigurationReader.getProperty("qa2_url");
        Driver.getDriver().get(url);


    }

    @When("login as a student")
    public void login_as_a_student() {
        String username = ConfigurationReader.getProperty("student52_user");
        String password = ConfigurationReader.getProperty("student52_pass");

        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.signInButton.click();


    }


        @Then("books should be displayed")
    public void books_should_be_displayed() {
            String expected = "books";


            wait.until(ExpectedConditions.urlContains(expected));

            String actual = Driver.getDriver().getCurrentUrl();
            System.out.println("actual = " + actual);
            Assert.assertTrue(actual.contains(expected));

            Driver.closeDriver();





        }





    }















