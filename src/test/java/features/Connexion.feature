
  Feature: Faire La Connexion
    Scenario: Allez sur le site et se connectez
      Given Allez sur le site
      When Ecrivez nom d'utilisateur et mot de passe
      Then Utilisateur doit connecte le site avec succes