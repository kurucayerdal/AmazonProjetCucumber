$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Connexion.feature");
formatter.feature({
  "line": 2,
  "name": "Faire La Connexion",
  "description": "",
  "id": "faire-la-connexion",
  "keyword": "Feature"
});
formatter.before({
  "duration": 322300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Allez sur le site et se connectez",
  "description": "",
  "id": "faire-la-connexion;allez-sur-le-site-et-se-connectez",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Allez sur le site",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Ecrivez nom d\u0027utilisateur et mot de passe",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Utilisateur doit connecte le site avec succes",
  "keyword": "Then "
});
formatter.match({
  "location": "ConnexionEtape.allezSurLeSite()"
});
formatter.result({
  "duration": 5813405900,
  "status": "passed"
});
formatter.match({
  "location": "ConnexionEtape.ecrivezNomDUtilisateurEtMotDePasse()"
});
formatter.result({
  "duration": 1814177300,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d101.0.4951.67)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PC-1002588\u0027, ip: \u0027172.20.81.123\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_322\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 101.0.4951.67, chrome: {chromedriverVersion: 101.0.4951.41 (93c720db8323..., userDataDir: C:\\Users\\E8509~1.KUR\\AppDat...}, goog:chromeOptions: {debuggerAddress: localhost:64017}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 1fb692bb40fb6ff662f662cb5743cc43\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\r\n\tat pages.Parent.clickFunction(Parent.java:35)\r\n\tat steps.ConnexionEtape.ecrivezNomDUtilisateurEtMotDePasse(ConnexionEtape.java:37)\r\n\tat ✽.When Ecrivez nom d\u0027utilisateur et mot de passe(src/test/java/features/Connexion.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ConnexionEtape.utilisateurDoitConnecteLeSiteAvecSucces()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1657655700,
  "status": "passed"
});
});