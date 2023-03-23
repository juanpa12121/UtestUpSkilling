package co.com.tcs.certification.utestupskilling.stepdefinitions;

import co.com.tcs.certification.utestupskilling.tasks.FillTwoSteps;
import co.com.tcs.certification.utestupskilling.userinterfaces.UtestPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.tcs.certification.utestupskilling.utils.Constants.ACTOR_NAME;

public class FillTwoStepsStepDefinitions {

    UtestPage page;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_NAME);
    }

    @Given("^I want to go to utest page$")
    public void iWantToGoToUtestPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn(page));
    }


    @When("^I click on Join Today Option and I fill step one and step two$")
    public void iClickOnJoinTodayOptionAndIFillStepOneAndStepTwo() {
        OnStage.theActorInTheSpotlight().attemptsTo(FillTwoSteps.fillTwoSteps());
    }

    @Then("^I validate Add your address message$")
    public void iValidateAddYourAddressMessage() {

    }




}
