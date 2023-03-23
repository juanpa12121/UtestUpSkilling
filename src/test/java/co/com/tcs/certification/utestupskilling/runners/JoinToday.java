package co.com.tcs.certification.utestupskilling.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/join_today.feature",
        glue = "co.com.tcs.certification.utestupskilling.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class JoinToday {
}
