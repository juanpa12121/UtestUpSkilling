package co.com.tcs.certification.utestupskilling.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target BTN_JOIN_TODAY = Target.the("join today option").located(By.className("unauthenticated-nav-bar__sign-up"));
}
