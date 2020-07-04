package parallel;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/parallel",
		glue="parallel",
		dryRun=false,
		monochrome = true,
//		strict= true,
		tags="",
		plugin= {
				"pretty",
				"html:target/CcDefaultReport",
				"json:target/cucumber.json",
				"rerun:target/failed.txt"
		}
		)
public class RunCucumberTest {

}
