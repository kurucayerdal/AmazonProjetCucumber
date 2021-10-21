package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import utils.BaseDriver;
import utils.ExcelUtility;

public class Hooks {

    @Before // Fonctionne avant chaque scénario.
    public void before(Scenario scenario) {
        System.out.println("Scenario starts");
        System.out.println("Scenario ID: " + scenario.getId());
        System.out.println("Scenario Name: " + scenario.getName());
    }

    @After  // Fonctionne après chaque scénario.
    public void after(Scenario scenario) {
        System.out.println("Scenario is finished");
        System.out.println("Scenario result: " + scenario.getStatus());
        System.out.println("Is scenario failed? : " + scenario.isFailed());

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String time = dateTime.format(formatter);

        if (scenario.isFailed()) //S'il y a une erreur dans le scenario, il prend une photo d'écran.
        {
            TakesScreenshot ts = (TakesScreenshot) BaseDriver.getDriver();
            File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshotFile, new File("target/FailedScreenShots/" + scenario.getId() + time + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //J'ai écrit cette méthode dans ExcelUtility pour écrire le résultat du test après chaque
        // fonctionnalité dans un fichier Excel.
        ExcelUtility.writeExcel("src/test/java/TestResults/TestResults.xlsx",
                scenario, BaseDriver.threadBrowserName.get(), dateTime.format(formatter));
        BaseDriver.DriverQuit();  // J'ai écrit cette méthode pour déconnecter de la driver.
    }
}
