package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.MyAccountService;
import lippia.web.services.RegistrationService;

public class MyAccountSteps extends PageSteps{

    @And("leads to Dashboard of the site")
    public void verifyDashboard() {
        MyAccountService.verifyDashboard();
    }

    @When("click on Logout button")
    public void clickLogoutButton() {
        MyAccountService.clickLogoutButton();
    }

    @Then("verify loguot successfully")
    public void verifyLoguotSuccessfully() {
        MyAccountService.verifyLogout();
    }

    @When("click on Account Details")
    public void clickAccountDetails() {
        MyAccountService.clickAccountdetailButton();
    }

    @Then("verify change password in accounts details")
    public void verifyChangePasswordOption() {
        MyAccountService.verifyPasswordChangeOption();
    }
}
