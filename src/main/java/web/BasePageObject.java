package web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by vikas on 26/02/2017.
 */
public class BasePageObject {
    protected WebDriver driver;
    public BasePageObject()
    {
        this.driver = SharedDriver.REAL_DRIVER;
        new WebDriverWait(driver,30);
    }

    protected void goToUrl(String url)
    {
        driver.manage().deleteAllCookies();
        driver.get(url);
    }

}
