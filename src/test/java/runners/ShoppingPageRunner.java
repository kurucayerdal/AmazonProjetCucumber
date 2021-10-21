package runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        features = {"src/test/java/features/Shopping.feature"},
        glue = {"steps"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportShoppingPage.html"}
        // plugin pour extent report
)

public class ShoppingPageRunner extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void afterClass() {
        Reporter.loadXMLConfig("src/test/java/xmlFiles/ExtendReportSet.xml");
        Reporter.setSystemInfo("User Name", "Erdal Kurucay");
        Reporter.setSystemInfo("Application Name", "Amazon Shopping Page");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Amazon Test Execution Shopping Page Cucumber Report");
    }
}
