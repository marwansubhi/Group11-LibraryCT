package com.libraryCT.step_definitions;
import com.github.javafaker.Faker;
import com.libraryCT.pages.DashboardPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.UsersPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class Add_Edit_Users_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    UsersPage usersPage = new UsersPage();
    Faker faker = new Faker();
    Select select;

    @When("I click on Users module")
    public void i_click_on_users_module() {
        dashboardPage.usersPageModule.click();
    }


    @When("click the Add User button")
    public void click_the_Add_User_button() {
        usersPage.addUserButton.click();
    }

    @And("click close button")
    public void clickCloseButton() {
        BrowserUtils.wait(2);
        usersPage.closeButton.click();
        BrowserUtils.wait(2);
    }

    @Then("user form is closed")
    public void userFormIsClosed() {
        Assert.assertFalse(usersPage.closeButton.isDisplayed());
    }


    @Then("click Edit button")
    public void clickEditButton() {
        usersPage.editButtons.get(0).click();
        BrowserUtils.wait(2);
    }

    @And("I fill out user's information form")
    public void iFillOutUserSInformationForm() {
        usersPage.fullNameInput.sendKeys(faker.name().fullName());
        usersPage.passwordInput.sendKeys(faker.internet().password());
        usersPage.emailInput.sendKeys(faker.internet().emailAddress());
        select = new Select(usersPage.userGroupDropdown);
        select.selectByIndex(1);
        select = new Select(usersPage.statusDropdown);
        select.selectByVisibleText("INACTIVE");
        usersPage.addressInput.sendKeys(faker.address().fullAddress());
    }


    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String message) {
        System.out.println(usersPage.newUserCreatedMessage.getText().equals(message) + " - " + usersPage.newUserCreatedMessage.getText());
        Assert.assertTrue(usersPage.newUserCreatedMessage.isDisplayed());
        BrowserUtils.wait(2);
    }


    @When("edit users information")
    public void edit_users_information() {
        usersPage.passwordInput.sendKeys(faker.internet().password());
        usersPage.addressInput.sendKeys(faker.address().fullAddress());
    }

    @When("click Save Changes button")
    public void click_save_changes_button() {
        usersPage.saveChangesButton.click();
    }


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        BrowserUtils.wait(1);
    }

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("usernameL"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("passwordL"));
        BrowserUtils.wait(1);
        loginPage.signInButton.click();
    }



}
