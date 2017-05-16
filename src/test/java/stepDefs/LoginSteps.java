package stepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pageObjects.LoginPage;

/**
 * Created by vikas on 26/02/2017.
 */
public class LoginSteps {
    private LoginPage loginPage;
    public LoginSteps(LoginPage loginPage){ this.loginPage = loginPage;}

    @Given("^I am on login page$")
    public void iAmOnLoginPage() throws Throwable {
        loginPage.goToLoginPage();

    }

    @And("^I enter a keyword \"([^\"]*)\"$")
    public void iEnterAKeyword(String arg0) throws Throwable {
       loginPage.enterKeyword(arg0);
    }
}
