package elements;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;

import static config.DriverFactory.getDriver;

@Name("Left Side Form")
@Block(@FindBy(xpath = "//div[contains(@class, 'su-ivt-helios-web-ui-panel-contentPanel-ContentPanelResources-ContentPanelCss-header')]"))
public class LeftSideForm extends HtmlElement{
    @Name("User name input")
    @FindBy(xpath = "//div[contains(@class, 'su-ivt-helios-web-ui-panel-contentPanel-ContentPanelResources-ContentPanelCss-label')]")
    private HtmlElement nameOfMenuSection;

    @Name("Tree root")
    @FindBy(xpath = "//div[contains(@class, 'su-ivt-helios-web-ui-widgets-tree-customTree-BaseTreeResources-Style-text')]")
    private HtmlElement hierarchyRoot;

    public void waitTextForNewMenuSection(HtmlElement element, String condition) {
        try {
            (new WebDriverWait(getDriver(), 5))
                    .until(ExpectedConditions.textToBePresentInElement(element,condition));
        } catch (Exception e) {
            Assert.fail("Элемент с именем "+condition+" не найден");
        }
    }

    public void waitForHierarchyRoot(HtmlElement element) {
        try {
            (new WebDriverWait(getDriver(), 10))
                    .until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            Assert.fail("Корень иерархии не найден");
        }
    }

    public HtmlElement getNameOfMenuSection() {
        return nameOfMenuSection;
    }
    public HtmlElement getHierarchyRoot() {
        return hierarchyRoot;
    }
}
