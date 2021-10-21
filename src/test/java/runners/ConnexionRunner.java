package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/features/Connexion.feature"},
        glue = {"steps"},
        plugin = {"html:target/cucumber-report", // plugin pour Jenkins Cucumber Report
                "json:target/cucumber.json",}
)

public class ConnexionRunner extends AbstractTestNGCucumberTests {

}
