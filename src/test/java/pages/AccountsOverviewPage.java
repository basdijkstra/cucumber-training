package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountsOverviewPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By textlabelPageHeader = By.xpath("//h2[text()='Account Bananas']");

    public AccountsOverviewPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
    }

    public boolean isOpened() {

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(textlabelPageHeader));
            return true;
        }
        catch (WebDriverException e) {
            return false;
        }
    }
}
