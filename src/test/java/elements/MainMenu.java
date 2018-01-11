package elements;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Button;

@Name("Main menu")
@Block(@FindBy(className = "GGTUI1GBNBE-su-ivt-helios-web-ui-layout-LayoutView_LayoutUiBinderImpl_GenCss_style-header"))
public class MainMenu extends HtmlElement{
    @Name("Watch select")
    @FindBy(name = "watch")
    private Button monitoringButton;

    @Name("Schedule select")
    @FindBy(name = "schedule")
    private Button scheduleButton;

    @Name("Objects select")
    @FindBy(name = "admin")
    private Button objectButton;

    @Name("Reports select")
    @FindBy(name = "reports")
    private Button reportButton;

    @Name("Task select")
    @FindBy(name = "workJournal")
    private Button taskButton;

    @Name("Event select")
    @FindBy(name = "monitoring")
    private Button eventButton;

    @Name("Map select")
    @FindBy(name = "map")
    private Button mapButton;

    @Name("Inventory select")
    @FindBy(name = "inventory")
    private Button inventoryButton;

    @Name("Users select")
    @FindBy(name = "users")
    private Button usersButton;

    @Name("User's logs select")
    @FindBy(name = "userLogs")
    private Button userLogsButton;

    @Name("Service select")
    @FindBy(name = "service")
    private Button serviceButton;

    @Name("Setting select")
    @FindBy(name = "settings")
    private Button settingsButton;

    @Name("Light's box logs select")
    @FindBy(name = "lightBoxLogs")
    private Button lightBoxLogsButton;

    @Name("Light's sensors select")
    @FindBy(name = "lightSensors")
    private Button lightSensorsButton;

    @Name("User name")
    @FindBy(css = "span.GGTUI1GBG5C-su-ivt-helios-web-ui-profile-resources-UserProfileResources-Style-name")
    private HtmlElement user_name;


    public void goToMonitoringPage(){
        monitoringButton.click();
    }

    public void goToSchedulePage(){
        scheduleButton.click();
    }

    public void goToObjectsPage(){
        objectButton.click();
    }

    public void goToReportPage(){
        reportButton.click();
    }
    public void goToTaskPage(){
        taskButton.click();
    }

    public void goToEventPage(){
        eventButton.click();
    }

    public void goToMapPage(){
        mapButton.click();
    }

    public void goToInventoryPage(){
        inventoryButton.click();
    }

    public void goToUsersPage(){
        usersButton.click();
    }

    public void goToUserLogsPage(){
        userLogsButton.click();
    }

    public void goToServicePage(){
        serviceButton.click();
    }

    public void goToSettingsPage(){
        settingsButton.click();
    }

    public void goToLightBoxLogsPage(){
        lightBoxLogsButton.click();
    }

    public void goToLightSensorsPage(){
        lightSensorsButton.click();
    }

    public HtmlElement getUser_name() {
        return user_name;
    }
}
