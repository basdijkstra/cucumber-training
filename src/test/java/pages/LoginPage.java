package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By textfieldUsername = By.name("username");
    private final By textfieldPassword = By.name("password");
    private final By buttonLogin = By.xpath("//input[@value='Log In']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
    }

    public LoginPage open() {

        this.driver.navigate().to("https://parabank.parasoft.com");
        return this;
    }

    public void loginAs(String username, String password) {

        wait.until(ExpectedConditions.elementToBeClickable(textfieldUsername));
        driver.findElement(textfieldUsername).sendKeys(username);

        wait.until(ExpectedConditions.elementToBeClickable(textfieldPassword));
        driver.findElement(textfieldPassword).sendKeys(password);

        wait.until(ExpectedConditions.elementToBeClickable(buttonLogin));
        driver.findElement(buttonLogin).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
