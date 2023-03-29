package co.com.tcs.certification.utestupskilling.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Sleeper;

import static co.com.tcs.certification.utestupskilling.userinterfaces.HomePage.BTN_JOIN_TODAY;
import static co.com.tcs.certification.utestupskilling.userinterfaces.Step1.*;
import static co.com.tcs.certification.utestupskilling.userinterfaces.Step2.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class FillTwoSteps implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_JOIN_TODAY),
                Enter.theValue("Juan Pablo").into(TXT_FIRST_NAME),
                Enter.theValue("Rivera").into(TXT_LAST_NAME),
                Enter.theValue("juanpa564912@gmail.com").into(TXT_EMAIL),
                SelectFromOptions.byVisibleText("January").from(LST_MONTH),
                SelectFromOptions.byVisibleText("21").from(LST_DAY),
                SelectFromOptions.byVisibleText("2000").from(LST_YEAR),
                Click.on(BTN_NEXT),
                Enter.theValue("Medellin").into(TXT_CITY),
                SendKeys.of(Keys.ARROW_DOWN).into(TXT_CITY),
                SendKeys.of(Keys.ENTER).into(TXT_CITY),
                Enter.theValue("055413").into(TXT_POSTAL_CODE)
        );

    }

    public static FillTwoSteps fillTwoSteps(){
        return instrumented(FillTwoSteps.class);
    }
}
