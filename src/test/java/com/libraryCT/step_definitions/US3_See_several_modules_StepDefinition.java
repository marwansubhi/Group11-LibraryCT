package com.libraryCT.step_definitions;

import com.libraryCT.pages.HomePage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US3_See_several_modules_StepDefinition {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Then("the student should see following modules")
    public void the_student_should_see_following_modules(List<String>modules) {
         List<String> actualText = BrowserUtils.getElementsText(homePage.dashboard);
         BrowserUtils.wait(3);
        System.out.println(modules);
        //Assert.assertTrue(actualText.equals(modules));
    }



    @Then("the librarian should see following modules")
    public void the_librarian_should_see_following_modules(List<String>modules) {
        List<String> actual = BrowserUtils.getElementsText(homePage.dashboard);
        Assert.assertTrue(actual.equals(modules));
    }


}



