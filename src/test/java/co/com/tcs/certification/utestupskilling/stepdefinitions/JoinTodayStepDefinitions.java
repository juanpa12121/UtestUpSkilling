package co.com.tcs.certification.utestupskilling.stepdefinitions;

import co.com.tcs.certification.utestupskilling.userinterfaces.UtestPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.tcs.certification.utestupskilling.utils.Constants.ACTOR_NAME;

public class JoinTodayStepDefinitions {

    UtestPage page;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_NAME);
    }

    @Given("^That the user is on the home page$")
    public void thatTheUserIsOnTheHomePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn(page));
    }


    @Then("^The user should see (.*) option$")
    public void theUserShouldSeeJoinTodayOption() {
    }
}
