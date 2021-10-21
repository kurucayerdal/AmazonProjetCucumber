package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;

public class ShoppingPage {

    public ShoppingPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchInput;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;

    @FindBy(css = "li[aria-label='Samsung']")
    private WebElement marque;

    @FindBy(css = "li[aria-label='200 à 500 EUR']")
    private WebElement prix;

    @FindBy(css = "li[aria-label='Monobloc tout tactile']")
    private WebElement typeDeTelephone;

    @FindBy(xpath = "//li[contains(@aria-label,'4G')]//i")
    private WebElement connectivite;

    @FindBy(css = "li[aria-label='Appareil photo']")
    private WebElement fonction;

    @FindBy(xpath = "//li[contains(@aria-label,'64 Go')]//i")
    private WebElement memoireInterne;

    @FindBy(xpath = "(//h2)[3]//span")
    private WebElement troisiemeProduitText;

    @FindBy(css = "img[data-image-index='3']")
    private WebElement troisiemeProduit;

    @FindBy(id = "availabilityInsideBuyBox_feature_div")
    private WebElement availability;

    @FindBy(name = "quantity")
    private WebElement selectQuantite;

    @FindBy(id = "attachSiNoCoverage")
    private WebElement coverageOption;

    @FindBy(id = "attach-sidesheet-view-cart-button-announce")
    private WebElement panier;

    @FindBy(id = "add-to-cart-button")
    private WebElement ajouterAuPanier;

    @FindBy(css = "#nav-cart")
    private WebElement allerAuPanier;

    @FindBy(css = ".a-truncate-cut")
    private WebElement textProduitDansPanier;

    @FindBy(css = "span[data-action='delete']>span")
    private WebElement supprimerProduit;

    @FindBy(id = "sc-subtotal-label-activecart")
    private WebElement controleAuPanier;

    @FindBy(css = "a[data-nav-ref='nav_youraccount_btn']")
    private WebElement monCompte;

    @FindBy(id = "nav-item-signout")
    private WebElement deconnexion;

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getMarque() {
        return marque;
    }

    public WebElement getPrix() {
        return prix;
    }

    public WebElement getTypeDeTelephone() {
        return typeDeTelephone;
    }

    public WebElement getConnectivite() {
        return connectivite;
    }

    public WebElement getFonction() {
        return fonction;
    }

    public WebElement getMemoireInterne() {
        return memoireInterne;
    }

    public WebElement getTroisiemeProduitText() {
        return troisiemeProduitText;
    }

    public WebElement getTroisiemeProduit() {
        return troisiemeProduit;
    }

    public WebElement getAvailability() {
        return availability;
    }

    public WebElement getSelectQuantite() {
        return selectQuantite;
    }

    public WebElement getAjouterAuPanier() {
        return ajouterAuPanier;
    }

    public WebElement getAllerAuPanier() {
        return allerAuPanier;
    }

    public WebElement getTextProduitDansPanier() {
        return textProduitDansPanier;
    }

    public WebElement getSupprimerProduit() {
        return supprimerProduit;
    }

    public WebElement getControleAuPanier() {
        return controleAuPanier;
    }

    public WebElement getMonCompte() {
        return monCompte;
    }

    public WebElement getDeconnexion() {
        return deconnexion;
    }

    public WebElement getCoverageOption() {
        return coverageOption;
    }

    public WebElement getPanier() {
        return panier;
    }
}
