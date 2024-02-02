package starter.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"starter.stepsDefinitions.ComprasStepDefinition"}, //Screenplay
        snippets = CucumberOptions.SnippetType.CAMELCASE, //navegarPaginaWeb
        plugin = "pretty",
        tags = "@CompraProductos"
)
public class CompraRunner {
}
