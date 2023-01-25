package co.com.bancolombia.certification.advantagedemo.stepdefinitions;

import co.com.bancolombia.certification.advantagedemo.models.CreateUserModel;
import co.com.bancolombia.certification.advantagedemo.tasks.CreateUser;
import co.com.bancolombia.certification.advantagedemo.utils.AppiumDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import java.net.MalformedURLException;
import java.util.List;

public class CreateUsersSteps {
    @Given("^I want to go to the page of Advantage Demo$")
    public void iWantToGoToThePageOfAdvantageDemo() throws MalformedURLException {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Daniel Cano");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(AppiumDriver.app()));;
    }

    @When("^I enter the information to create the user$")
    public void iEnterTheInformationToCreateTheUser(List<CreateUserModel> user) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateUser.createUser(user));
    }

    @Then("^I validate the correct user was created$")
    public void iValidateTheCorrectUserWasCreated() {
    }
}
