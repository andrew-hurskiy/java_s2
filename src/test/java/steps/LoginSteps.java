package steps;

import io.cucumber.java.en.*;
import pages.LoginPage;


public class LoginSteps {
    
    private LoginPage LoginPage = new LoginPage();

    @Given("^Go to specific page$")
    public void navigateToPage() {
        LoginPage.open();
    }

    @When("^Enter first name$")
    public void enterFirstName() {
        LoginPage.enterFirstName();
    }

    @When("^Enter last name$")
    public void enterLastName() {
        LoginPage.enterLastName();
    }

    @Then("^Sign in$")
    public void signIn() {
        LoginPage.signIn();
    }

}
