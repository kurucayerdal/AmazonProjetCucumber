Feature: Cherchez un produit et l'ajoutez au panier

  Background: Faire la connexion
    Given Allez sur le site
    When Ecrivez nom d'utilisateur et mot de passe
    Then Utilisateur doit connecte le site avec succes

  Scenario: Cherchez un produit et l'ajoutez au panier et puis le supprimez.
    Given Cherchez "samsung"
    When choisissez marque samsung
    And choisissez Prix electronique deux cent euros a cinq cent euros
    And choisissez Type de telephone portable Monobloc tout tactile
    And choisissez Connectivite de telephone portable quatre G
    And choisissez Fonction de telephone portable Appareil photo
    And choisissez  Memoire interne soixante-quatre Go
    And cliquez le troisieme produit
    And Si en stock, choisissez la quantite deux et ajoutez au panier et allez au panier
    And Comparez que le produit dans le panier etait le produit que vous avez ajoute
    And Supprimez le produit dans le panier
    And Verifiez que le panier est vide
    And Se deconnectez
    Then Verifiez la deconnexion