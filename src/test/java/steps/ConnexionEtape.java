package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ConnexionPage;
import utils.BaseDriver;
import utils.ExcelUtility;

import java.util.List;

import static pages.Parent.*;

public class ConnexionEtape {

    private final ConnexionPage connexionPage;

    public ConnexionEtape(ConnexionPage connexionPage) {
        this.connexionPage = connexionPage;
    }

    @Given("^Allez sur le site$")
    public void allezSurLeSite() {
        WebDriver driver = BaseDriver.getDriver();
        driver.get("https://www.amazon.fr/");
        driver.manage().window().maximize();
    }

    @When("^Ecrivez nom d'utilisateur et mot de passe$")
    public void ecrivezNomDUtilisateurEtMotDePasse() {

        List<List<String>> list = ExcelUtility.getListData("src/test/java/resources/NomDUtilisateur.xlsx", "Page1", 2);

        clickFunction(connexionPage.getAcceptCookies());
        moveToElement(connexionPage.getCompteEtListe());
        clickFunction(connexionPage.getIdentifiezVous());
        sendKeysFunction(connexionPage.getEmailInput(), list.get(0).get(0));
        clickFunction(connexionPage.getContinueButton());
        sendKeysFunction(connexionPage.getMotDePasseInput(), list.get(0).get(1));
        clickFunction(connexionPage.getsIdentifierButton());
    }

    @Then("^Utilisateur doit connecte le site avec succes$")
    public void utilisateurDoitConnecteLeSiteAvecSucces() {
        isTextVisible("merdan");
    }

}
