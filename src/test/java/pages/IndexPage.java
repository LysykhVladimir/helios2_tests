package pages;
import config.DriverFactory;
import elements.LeftSideForm;
import elements.MainMenu;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;


public class IndexPage extends DriverFactory {
    public MainMenu mainMenu;
    public LeftSideForm leftSideForm;

    public IndexPage() throws Exception {
        HtmlElementLoader.populatePageObject(this, DriverFactory.getDriver());
    }

    public void waitTextInElement(String condition){
        leftSideForm.waitTextForNewMenuSection(leftSideForm.getNameOfMenuSection(),condition);
    }
}
