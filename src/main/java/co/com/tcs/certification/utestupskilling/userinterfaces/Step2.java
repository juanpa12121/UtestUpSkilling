package co.com.tcs.certification.utestupskilling.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Step2 {

    public static final Target TXT_CITY = Target.the("List city name").located(By.id("city"));

    public static final Target TXT_POSTAL_CODE= Target.the("Postal code").located(By.id("zip"));

    public static final Target LST_COUNTRY = Target.the("Country list").located(By.cssSelector("input[placeholder='Select a country']"));

    public static final Target SPAN_MESSAGE = Target.the("Span message").located(By.className("sub-title"));
}
