package runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        features = {"src/test/java/features/Connexion.feature"},
        glue = {"steps"},
        plugin = { // oluşturalacak raporun yeri ve adı veriliyor.
                "html:target/cucumber-report", //jenkins için eklendi
                "json:target/cucumber.json",}
       //"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportConnexionPage.html",
)

public class ConnexionRunner extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void afterClass() {
//        Reporter.loadXMLConfig("src/test/java/xmlFiles/ExtendReportSet.xml");
//        Reporter.setSystemInfo("User Name", "Erdal Kurucay");
//        Reporter.setSystemInfo("Application Name", "Amazon Connexion Page");
//        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
//        Reporter.setSystemInfo("Department", "QA");
//        Reporter.setTestRunnerOutput("Amazon Test Execution Connexion Page Cucumber Report");
    }

}
