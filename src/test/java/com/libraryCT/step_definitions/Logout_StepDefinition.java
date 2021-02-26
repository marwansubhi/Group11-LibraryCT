package com.libraryCT.step_definitions;


import com.libraryCT.pages.BasedPage;
import com.libraryCT.pages.LogoutPage;
import com.libraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout_StepDefinition extends BasedPage {

    LogoutPage logoutPage = new LogoutPage();


    @When("student click on test student25 at the right corner")
    public void student_click_on_test_student25_at_the_right_corner() {

        logoutPage.logoutDropdown.click();
        BrowserUtils.wait(2);


    }

    @Then("user click on logout button")
    public void user_click_on_logout_button() {

        logoutPage.logoutButton.click();

    }

}
