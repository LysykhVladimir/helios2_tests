package test;
import config.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.LoginPage;

public class LoginTestWP extends DriverFactory {

    //Test Data
    @DataProvider
    public  Object[][] testData() {
        return new Object[][] {
                new Object[] {"http://test.helios2.ivt.lan/login.html", "lysykh87", "lysykh87", "Vladimir Lysykh"},
                new Object[] {"http://test3.helios2.ivt.lan/login.html", "lysykh87", "lysykh87", "Владимир Лысых"},
                new Object[] {"http://gw.helios2.ivt.lan/login.html", "lysykh_vv", "lysykh87", "Владимир Лысых"},
        };
    }

    @Test(dataProvider = "testData", groups = "login test")
    public void logInToWebsite(String url, String login, String password, String user_name) throws Exception {
        getDriver().get(url);

        LoginPage loginPage = new LoginPage();
        IndexPage indexPage = loginPage.enterUsername(login)
                .enterPassword(password)
                .login();

       Assert.assertEquals(user_name, indexPage.mainMenu.getUser_name().getText());
    }
}
