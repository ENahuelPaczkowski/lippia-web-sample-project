package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.RegistrationService;

public class RegistrationSteps extends PageSteps {

    @When("enter '(.*)' in register email-adress textbox")
    public static void enterEmail(String email){
        RegistrationService.enterEmail(email);
    }

    @And("click Register button")
    public void clickRegisterButton() {
        RegistrationService.clickRegisterButton();
    }

    @Then("client registered succesfully and navigate to home page")
    public void clientRegisteredVerify() {

    }

    @And("enter {string} in register password texbox")
    public void enterPassword(String password) {
        RegistrationService.enterPassword(password);
    }

    @Then("show registration message error: {string}")
    public void verifyRegistration() {
    }
}
