package test;
import config.DriverFactory;
import config.ExcelDataConfig;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.LoginPage;

public class LoginTestWP extends DriverFactory {

    //Test Data
    @DataProvider
    public Object[][] testData() {
        ExcelDataConfig config = new ExcelDataConfig("src/test/java/test/testData/LoginTestData.xlsx");
        return config.getDataFromExcel();
    }

    @Test(dataProvider = "testData", groups = "loginTest")
    public void logInToWebsite(String url, String login, String password, String user_name) throws Exception {
        getDriver().get(url);

        LoginPage loginPage = new LoginPage();
        IndexPage indexPage = loginPage.enterUsername(login)
                .enterPassword(password)
                .login();

       Assert.assertEquals(user_name, indexPage.mainMenu.getUser_name().getText());
    }
}
