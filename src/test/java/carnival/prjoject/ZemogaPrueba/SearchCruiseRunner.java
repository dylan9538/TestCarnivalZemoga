package carnival.prjoject.ZemogaPrueba;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(plugin = { "json:target/cucumber/cucumber.json", "html:target/cucumber/cucumber-html-report",
			"junit:target/cucumber/cucumber.xml",
			"pretty", }, features = "src/test/resources/features/SearchCruise.feature")
	public class SearchCruiseRunner {

	}
	