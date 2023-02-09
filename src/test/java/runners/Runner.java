package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "src\\test\\java\\features\\TechFiosLogin.feature",
		features = "classpath:features",
		glue = "steps",
	  	tags = "@LoginFromDbfeature",
		monochrome = true,
		dryRun = false,
		plugin = {
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json"
		}
		
		)
public class Runner {

	
	
}//Background keyword run each and every scenario
