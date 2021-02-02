package avianca.prjoject.AviancaPrueba;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(plugin = { "json:target/cucumber/cucumber.json", "html:target/cucumber/cucumber-html-report",
			"junit:target/cucumber/cucumber.xml",
			"pretty", }, features = "src/test/resources/features/BuscarVuelo.feature")
	public class BuscarVueloRunner {

	}
