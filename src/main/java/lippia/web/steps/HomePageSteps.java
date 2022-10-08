package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomePageService;

public class HomePageSteps extends PageSteps {

    @Given("the client enter the Home page")
    public void home() {
        HomePageService.navegarWeb();
    }

    @When("the client click on Shop Menu")
    public void clickShopMenu() {
        HomePageService.clickShopMenuButton();
    }

    @When("the client on Home menu button")
    public void clickHomeButton() {
        HomePageService.clickHomeButton();
    }

    @Then("the client verify that Home page has '(.*)' Sliders only")
    public void verifySliders(int numero) {
        HomePageService.verifySlider(numero);
    }

    @Then("the client verify tha Home page has three arrivals only")
    public void verifyArrivals() {
//        HomePageService.verify();
    }
}
