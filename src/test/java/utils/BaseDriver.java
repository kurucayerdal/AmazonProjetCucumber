package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseDriver {

    //Her thrad'e özel olacak ve static olduğu için o thread deki bütün classlar aynı driver'ı kullanmış olacak.
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>(); // WebDriver1,   WebDriver2
    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();//chrome,        firefox

    public static WebDriver getDriver() {

        //XML'den gelmeyen tarayıcı adı ile çalışan senaryolar için default setleme yapıldı.
        //default browser olarak chrome atandı.
        if (threadBrowserName.get() == null) {
            threadBrowserName.set("chrome");
        }

        if (threadDriver.get() == null) // bu hatta driver var mı? Bu pipe-line (paralel hatta) driver var mı?
        {
            switch (threadBrowserName.get()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    threadDriver.set(new ChromeDriver());
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set(new FirefoxDriver());
                    break;
            }
        }
        return threadDriver.get();
    }

    public static void DriverQuit() {

        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            WebDriver driver = threadDriver.get();
            driver = null;
            threadDriver.set(driver);
        }
    }
}
