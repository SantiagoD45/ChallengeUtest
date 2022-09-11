package co.com.choucair.challengeUtest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/create_a_new_user.feature",
        tags = "@createNewCount",
        glue = "co.com.choucair.challengeUtest.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class CreateANewCount {
}
