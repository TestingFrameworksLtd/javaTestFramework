package pageObjects;

        import org.openqa.selenium.By;
        import org.openqa.selenium.support.PageFactory;
        import web.ReadConfigFile;
        import web.BasePageObject;

        import java.io.IOException;

/**
 * Created by vikas on 26/02/2017.
 */
public class LoginPage extends BasePageObject {

    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }

    public void goToLoginPage() throws IOException {
        goToUrl(ReadConfigFile.getPropertyValue("loginUrl"));
    }

    public void enterKeyword(String arg0) {
        driver.findElement(By.name("keywords")).sendKeys(arg0);
    }
}
