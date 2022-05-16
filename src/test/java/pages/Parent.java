package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.BaseDriver;


public class Parent {

    public static WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 20);
    public static Actions actions = new Actions(BaseDriver.getDriver());
    public static JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
    public static Select select;

    public static void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void scrollToElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public static void  clickFunction(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public static void sendKeysFunction(WebElement element, String StrValue) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(StrValue);
    }

    public static void moveToElement(WebElement element) {
        waitUntilVisible(element);
        actions.moveToElement(element).perform();
    }

    public static void selectByValue(WebElement element, String value) {
        waitUntilVisible(element);
        select = new Select(element);
        select.selectByValue(value);
    }

    public static String getTextElement(WebElement element) {
        waitUntilVisible(element);
        return element.getText();
    }

    public static void elementContainsText(WebElement element, String text) {
        waitUntilVisible(element);
        String elementText = element.getText();
        Assert.assertTrue(elementText.toLowerCase().contains(text.toLowerCase()));
    }

    public static void isTextVisible(String text) {

        if (BaseDriver.getDriver().getPageSource().contains(text)) {
            System.out.println(text + " is present.");
        } else System.out.println(text + " is absent!");
    }
}
