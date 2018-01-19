package elements;

import config.DriverFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;

@Name("Left Side Form")
@Block(@FindBy(xpath = "//div[contains(@class, 'su-ivt-helios-web-ui-panel-contentPanel-ContentPanelResources-ContentPanelCss-header')]"))
public class LeftSideForm extends HtmlElement{
    @Name("User name input")
    @FindBy(xpath = "//div[contains(@class, 'su-ivt-helios-web-ui-panel-contentPanel-ContentPanelResources-ContentPanelCss-label')]")
    private HtmlElement nameOfMenuSection;

    public void waitTextForNewMenuSection(HtmlElement element, String condition) {
        try {
            (new WebDriverWait(DriverFactory.getDriver(), 5))
                    .until(ExpectedConditions.textToBePresentInElement(element,condition));
        } catch (Exception e) {
            Assert.fail("Элемент с именем "+condition+" не найден");
        }
    }

    public HtmlElement getNameOfMenuSection() {
        return nameOfMenuSection;
    }
}
