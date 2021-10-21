package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;

public class ConnexionPage extends Parent {

    public ConnexionPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(name = "accept")
    private WebElement acceptCookies;

    @FindBy(id = "nav-link-accountList")
    private WebElement compteEtListe;

    @FindBy(css = ".nav-action-inner")
    private WebElement identifiezVous;

    @FindBy(name = "email")
    private WebElement emailInput;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(name = "password")
    private WebElement motDePasseInput;

    @FindBy(id = "signInSubmit")
    private WebElement sIdentifierButton;



    public WebElement getAcceptCookies() {
        return acceptCookies;
    }

    public WebElement getCompteEtListe() {
        return compteEtListe;
    }

    public WebElement getIdentifiezVous() {
        return identifiezVous;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getMotDePasseInput() {
        return motDePasseInput;
    }

    public WebElement getsIdentifierButton() {
        return sIdentifierButton;
    }

}
