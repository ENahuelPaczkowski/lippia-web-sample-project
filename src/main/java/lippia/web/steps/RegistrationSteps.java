package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;

public class RegistrationSteps extends PageSteps {

    @When("enter 'nahuelpaco@gmail.com' in email-adress textbox")
    public static void enterEmail(String email){

    }

    @And("click Register button")
    public void clickRegisterButton() {
        
    }

    @Then("client registered succesfully and navigate to home page")
    public void clientRegisteredSuccesfullyAndNavigateToHomePage() {

    }
}
