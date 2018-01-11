package pages;
import config.DriverFactory;
import elements.AuthorizationForm;

import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;


public class LoginPage {
    private AuthorizationForm authorizationForm;

    public LoginPage() throws Exception {
        HtmlElementLoader.populatePageObject(this, DriverFactory.getDriver());
    }

    public LoginPage enterUsername (String username) {
        authorizationForm.enterUsername(username);
        return this;
    }

    public LoginPage enterPassword (String password) {
        authorizationForm.enterPassword(password);
        return this;
    }

    public IndexPage login() throws Exception {
        authorizationForm.logIn();
        return new IndexPage();
    }
}
