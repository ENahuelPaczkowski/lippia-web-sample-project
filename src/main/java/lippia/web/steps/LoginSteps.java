package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.constants.LoginConstants;
import lippia.web.services.HomePageService;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps{

    @When("the client click on My Account Menu")
    public void navigateToMyAccountMenu() {
        LoginService.clickMyAccountMenu();
    }

    @When("enter {string} in username texbox {string} in password textbox and click on login button")
    public void login(String username, String password) {
        LoginService.enterUsername(username);
        LoginService.enterPassword(password);
        LoginService.clickLoginBuuton();
    }

//    @When("enter <username> in username texbox <password> in password textbox and click on login button")
//    public void loginFail(String username, String password) {
//        LoginService.enterUsername(username);
//        LoginService.enterPassword(password);
//        LoginService.clickLoginBuuton();
//    }

    @Then("login to the web page")
    public void verifyLogin() {
        LoginService.verifyResults();
    }

    @And("enter {string} in password texbox")
    public void enterPassword(String password) {
        LoginService.enterPassword(password);
    }

    @Then("password {string} should be mascked")
    public void verifyMasckedPassword(String password) {
        LoginService.verifyMasckedPassword(password);
    }

    @Then("show message error: {string}")
    public void verifyLoginFail(String message) {
        LoginService.verifyLoginFail(message);
    }
}
