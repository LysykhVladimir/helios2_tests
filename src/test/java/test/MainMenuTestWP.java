package test;

import config.DriverFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.LoginPage;

public class MainMenuTestWP extends DriverFactory {

    //Test Data
    private static final String URL = "http://test.helios2.ivt.lan/login.html";
    private static final String LOGIN = "lysykh87";
    private static final String PASSWORD = "lysykh87";

    @BeforeClass
    public void loadPage() throws Exception {
        getDriver().get(URL);
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername(LOGIN)
                .enterPassword(PASSWORD)
                .login();
    }

    @Test(groups = "menuTest")
    public void selectReports() throws Exception {
        IndexPage indexPage = new IndexPage();
        indexPage.mainMenu.goToReportPage();
        indexPage.waitTextInElement("ОТЧЕТЫ");
        indexPage.waitHierarchyRoot();

    }

    @Test(groups = "menuTest")
    public void selectSchedule() throws Exception {
        IndexPage indexPage = new IndexPage();
        indexPage.mainMenu.goToSchedulePage();
        indexPage.waitTextInElement("РАСПИСАНИЕ");
        indexPage.waitHierarchyRoot();
    }

    @Test(groups = "menuTest")
    public void selectInventory() throws Exception {
        IndexPage indexPage = new IndexPage();
        indexPage.mainMenu.goToInventoryPage();
        indexPage.waitTextInElement("ИНВЕНТАРИЗАЦИЯ");
        indexPage.waitHierarchyRoot();
    }
    @Test(groups = "menuTest")
    public void selectService() throws Exception {
        IndexPage indexPage = new IndexPage();
        indexPage.mainMenu.goToServicePage();
        indexPage.waitTextInElement("ОБСЛУЖИВАНИЕ");
        indexPage.waitHierarchyRoot();
    }

    @Test(groups = "menuTest")
    public void selectSettings() throws Exception {
        IndexPage indexPage = new IndexPage();
        indexPage.mainMenu.goToSettingsPage();
        indexPage.waitTextInElement("НАСТРОЙКИ СИСТЕМЫ");
        //indexPage.waitHierarchyRoot();
    }

    @Test(groups = "menuTest")
    public void selectMonitoring() throws Exception {
        IndexPage indexPage = new IndexPage();
        indexPage.mainMenu.goToMonitoringPage();
        indexPage.waitTextInElement("НАБЛЮДЕНИЕ");
        indexPage.waitHierarchyRoot();
    }

    @Test(groups = "menuTest")
    public void selectEvent() throws Exception {
        IndexPage indexPage = new IndexPage();
        indexPage.mainMenu.goToEventPage();
        indexPage.waitTextInElement("СОБЫТИЯ");
        indexPage.waitHierarchyRoot();
    }

    @Test(groups = "menuTest")
    public void selectLightBoxLogs() throws Exception {
        IndexPage indexPage = new IndexPage();
        indexPage.mainMenu.goToLightBoxLogsPage();
        indexPage.waitTextInElement("ЛОГИ УСТРОЙСТВ");
        indexPage.waitHierarchyRoot();
    }

    @Test(groups = "menuTest")
    public void selectLightSensor() throws Exception {
        IndexPage indexPage = new IndexPage();
        indexPage.mainMenu.goToLightSensorsPage();
        indexPage.waitTextInElement("ДАТЧИКИ ОСВЕЩЕННОСТИ");
        indexPage.waitHierarchyRoot();

    }

    @Test(groups = "menuTest")
    public void selectMap() throws Exception {
        IndexPage indexPage = new IndexPage();
        indexPage.mainMenu.goToMapPage();
        indexPage.waitTextInElement("КАРТА");
        indexPage.waitHierarchyRoot();

    }

    @Test(groups = "menuTest")
    public void selectObjects() throws Exception {
        IndexPage indexPage = new IndexPage();
        indexPage.mainMenu.goToObjectsPage();
        indexPage.waitTextInElement("ОБЪЕКТЫ");
        indexPage.waitHierarchyRoot();

    }

    @Test(groups = "menuTest")
    public void selectTask() throws Exception {
        IndexPage indexPage = new IndexPage();
        indexPage.mainMenu.goToTaskPage();
        indexPage.waitTextInElement("ЗАДАЧИ");
        indexPage.waitHierarchyRoot();

    }

    @Test(groups = "menuTest")
    public void selectUserLogs() throws Exception {
        IndexPage indexPage = new IndexPage();
        indexPage.mainMenu.goToUserLogsPage();
        indexPage.waitTextInElement("ДЕЙСТВИЯ ПОЛЬЗОВАТЕЛЕЙ");
        indexPage.waitHierarchyRoot();
    }

    @Test(groups = "menuTest")
    public void selectUsers() throws Exception {
        IndexPage indexPage = new IndexPage();
        indexPage.mainMenu.goToUsersPage();
        indexPage.waitTextInElement("ПОЛЬЗОВАТЕЛИ И РОЛИ");
        indexPage.waitHierarchyRoot();

    }
}
