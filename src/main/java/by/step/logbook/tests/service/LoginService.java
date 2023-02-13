package by.step.logbook.tests.service;

import by.step.logbook.tests.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginService extends BaseService{

    private LoginPage loginPage = new LoginPage(driver);

    public LoginService(WebDriver driver) {
        super(driver);
    }

    public LoginPage getLoginPage() {
        Logger logger = LoggerFactory.getLogger(LoginService.class);
        logger.info("HELLO FROM GET LOGIN PAGE METHOD");
        return loginPage;
    }
}
