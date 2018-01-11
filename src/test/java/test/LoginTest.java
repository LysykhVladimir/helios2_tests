package test;
import config.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.LoginPage;

public class LoginTest extends DriverFactory {

    //Test Data
    private static final String URL = "http://test.helios2.ivt.lan/login.html";
    private static final String LOGIN = "lysykh87";
    private static final String PASSWORD = "lysykh87";
    private static final String USER_NAME = "Vladimir Lysykh";

    @BeforeClass
    public void loadPage() throws Exception {
        getDriver().get(URL);
    }

    @Test(groups = "login test")
    public void logInToWebsite() throws Exception {
       LoginPage loginPage = new LoginPage();
       IndexPage indexPage = loginPage.enterUsername(LOGIN)
                .enterPassword(PASSWORD)
                .login();

       Assert.assertEquals(USER_NAME, indexPage.mainMenu.getUser_name().getText());
    }
}
