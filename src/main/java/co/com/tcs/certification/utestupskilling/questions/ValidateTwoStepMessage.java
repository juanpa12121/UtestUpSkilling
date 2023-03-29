package co.com.tcs.certification.utestupskilling.questions;

import co.com.tcs.certification.utestupskilling.userinterfaces.Step2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateTwoStepMessage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Step2.SPAN_MESSAGE.resolveAllFor(actor).get(0).getText();
    }

    public static ValidateTwoStepMessage isPresent(){
        return new ValidateTwoStepMessage();
    }
}
