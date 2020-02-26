package co.com.app.davivienda.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/PagarMisProductos.feature",
		glue="co.com.app.davivienda.stepdefinitions",
		snippets = SnippetType.CAMELCASE
		) 
public class PagarMisProductosRunner {

}
