package runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utils.BaseDriver;


@CucumberOptions(
        features = {"src/test/java/features/Connexion.feature"},
        glue = {"steps"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportConnexionPage.html"}
)

public class ConnexionParalleleTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browser")
    public void beforeClass(String browser) {
        BaseDriver.threadBrowserName.set(browser);
    }

    @AfterClass
    public static void afterClass() {
        Reporter.loadXMLConfig("src/test/java/xmlFiles/ExtentReportSet.xml");
        Reporter.setSystemInfo("User Name", "Erdal Kurucay");
        Reporter.setSystemInfo("Application Name", "Amazon Connexion Page");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Amazon Test Execution Connexion Page Cucumber Report");
    }
}
