package web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.IOException;

/**
 * Created by vikas on 26/02/2017.
 */
public class SharedDriver /*extends EventFiringWebDriver*/ {

    public static WebDriver REAL_DRIVER;
   /* private static final Thread CLOSE_THREAD = new Thread(){
        public void run() {REAL_DRIVER.quit();}
    };*/
    public SharedDriver(){/*super (REAL_DRIVER);*/}

    private static String BROWSER_NAME;

    static {
        if (System.getProperty("browserName")!=null)
        {
            BROWSER_NAME = System.getProperty("browserName");
        } else {
            try {
                BROWSER_NAME = ReadConfigFile.getPropertyValue("browser");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if ("firefox".equalsIgnoreCase(BROWSER_NAME))
        startFirefoxDriver();
        else if ("chrome".equalsIgnoreCase(BROWSER_NAME))
            startChromeDriver();
        else if ("ie".equalsIgnoreCase(BROWSER_NAME))
            startIEDriver();
    }

    private static void startIEDriver() {
        System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") + "\\src\\test\\browsers\\IEDriverServer.exe");
        REAL_DRIVER = new InternetExplorerDriver();
    }

    private static void startChromeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\browsers\\chromedriver.exe");
        REAL_DRIVER = new ChromeDriver();
    }

    private static void startFirefoxDriver() {
        REAL_DRIVER = new FirefoxDriver();
    }
}
