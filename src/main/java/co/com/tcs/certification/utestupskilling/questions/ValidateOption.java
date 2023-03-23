package co.com.tcs.certification.utestupskilling.questions;

import co.com.tcs.certification.utestupskilling.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateOption implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return HomePage.BTN_JOIN_TODAY.resolveAllFor(actor).get(0).getText();
    }

    public static ValidateOption isPresent(){
        return new ValidateOption();
    }
}
