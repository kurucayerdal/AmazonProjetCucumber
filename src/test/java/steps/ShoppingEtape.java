package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.ShoppingPage;

import static pages.Parent.*;

public class ShoppingEtape {

    private final ShoppingPage shoppingPage;

    public ShoppingEtape(ShoppingPage shoppingPage) {
        this.shoppingPage = shoppingPage;
    }

    @Given("^Cherchez \"([^\"]*)\"$")
    public void cherchez(String produit) {
        sendKeysFunction(shoppingPage.getSearchInput(), produit);
        clickFunction(shoppingPage.getSearchButton());
    }

    @When("^choisissez marque samsung$")
    public void choisissezMarqueSamsung() {
        clickFunction(shoppingPage.getMarque());
    }

    @And("^choisissez Prix electronique deux cent euros a cinq cent euros$")
    public void choisissezPrixElectroniqueDeuxCentEurosACinqCentEuros() {
        clickFunction(shoppingPage.getPrix());
    }

    @And("^choisissez Type de telephone portable Monobloc tout tactile$")
    public void choisissezTypeDeTelephonePortableMonoblocToutTactile() {
        clickFunction(shoppingPage.getTypeDeTelephone());
    }

    @And("^choisissez Connectivite de telephone portable quatre G$")
    public void choisissezConnectiviteDeTelephonePortableQuatreG() {
        clickFunction(shoppingPage.getConnectivite());
    }

    @And("^choisissez Fonction de telephone portable Appareil photo$")
    public void choisissezFonctionDeTelephonePortableAppareilPhoto() {
        clickFunction(shoppingPage.getFonction());
    }

    @And("^choisissez  Memoire interne soixante-quatre Go$")
    public void choisissezMemoireInterneSoixanteQuatreGo() {
        clickFunction(shoppingPage.getMemoireInterne());
    }

    String textTroisiemeProduit;

    @And("^cliquez le troisieme produit$")
    public void cliquezLeTroisiemeProduit() {
        textTroisiemeProduit = getTextElement(shoppingPage.getTroisiemeProduitText());
        clickFunction(shoppingPage.getTroisiemeProduit());
    }

    String availibilite;

    @And("^Si en stock, choisissez la quantite deux et ajoutez au panier et allez au panier$")
    public void siEnStockChoisissezLaQuantiteDeuxEtAjoutezAuPanierEtAllezAuPanier() {
        availibilite = getTextElement(shoppingPage.getAvailability());
        if (availibilite.toLowerCase().contains("en stock")) {
            selectByValue(shoppingPage.getSelectQuantite(), "2");
        }
        clickFunction(shoppingPage.getAjouterAuPanier());
        clickFunction(shoppingPage.getAllerAuPanier());
    }

    @And("^Comparez que le produit dans le panier etait le produit que vous avez ajoute$")
    public void comparezQueLeProduitDansLePanierEtaitLeProduitQueVousAvezAjoute() {

        String textProduitInCart = getTextElement(shoppingPage.getTextProduitDansPanier());
        System.out.println("textProduitInCart = " + textProduitInCart);
        System.out.println("textTroisiemeProduit = " + textTroisiemeProduit);
        Assert.assertTrue(textTroisiemeProduit.toLowerCase().contains(textProduitInCart.toLowerCase().substring(0,30)));
    }

    @And("^Supprimez le produit dans le panier$")
    public void supprimezLeProduitDansLePanier() {
        clickFunction(shoppingPage.getSupprimerProduit());
    }

    @And("^Verifiez que le panier est vide$")
    public void verifiezQueLePanierEstVide() {
        elementContainsText(shoppingPage.getControleAuPanier(), "0 article");
    }

    @And("^Se deconnectez$")
    public void seDeconnectez() {
        moveToElement(shoppingPage.getMonCompte());
        clickFunction(shoppingPage.getDeconnexion());
    }

    @Then("^Verifiez la deconnexion$")
    public void verifiezLaDeconnexion() {
        isTextVisible("merdan");
    }
}
