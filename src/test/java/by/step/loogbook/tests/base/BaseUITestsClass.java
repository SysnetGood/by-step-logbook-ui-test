package by.step.loogbook.tests.base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseUITestsClass {

    protected WebDriver driver;

    @BeforeAll
    public void prepareWebDriver () {
        System.setProperty("webdriver.chrome.driver", "C:\\Q1822\\by-step-logbook-ui-test\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }

    @AfterAll
    public void quitDriver () {
        driver.quit();
    }
}
