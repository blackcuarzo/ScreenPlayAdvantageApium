package co.com.bancolombia.certification.advantagedemo.stepdefinitions;

import co.com.bancolombia.certification.advantagedemo.tasks.BuyLaptop;
import co.com.bancolombia.certification.advantagedemo.tasks.LoginUser;
import co.com.bancolombia.certification.advantagedemo.utils.AppiumDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import java.net.MalformedURLException;

public class BuyLaptopSteps {
  @Given("^I login a user$")
  public void iLoginAUser() throws MalformedURLException {
    OnStage.setTheStage(Cast.ofStandardActors());
    OnStage.theActorCalled("Daniel Cano");
    OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(AppiumDriver.app()));
    OnStage.theActorInTheSpotlight().attemptsTo(LoginUser.loginUser());
  }

  @When("^I buy a laptop$")
  public void iBuyALaptop() {
    OnStage.theActorInTheSpotlight().attemptsTo(BuyLaptop.buyLaptop());
  }

  @Then("^I validate a laptop was bought$")
  public void iValidateALaptopWasBought() {
    // Write code here that turns the phrase above into concrete actions
  }

}
