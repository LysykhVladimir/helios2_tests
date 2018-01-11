package elements;

import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;

@Name("AuthorizationForm")
@Block(@FindBy(id = "container"))
public class AuthorizationForm extends HtmlElement{
    @Name("User name input")
    @FindBy(id = "user")
    private TextInput userName;

    @Name("Password input")
    @FindBy(id = "pass")
    private TextInput pass;

    @Name("Log in button")
    @FindBy(xpath = "//div[@id='container']/a/img")
    private Button logInButton;

    public AuthorizationForm enterUsername (String username) {
        userName.sendKeys(username);
        return this;
    }

    public AuthorizationForm enterPassword (String password) {
        pass.sendKeys(password);
        return this;
    }

    public void logIn(){
        logInButton.click();
    }

}
