package examples;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AccountsOverviewPage;
import pages.LoginPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginUserInterfaceStepDefinitions {

    private User user;
    private WebDriver driver;

    @Before("@userinterface")
    public void startBrowser() {

        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
    }

    @Given("John is a registered ParaBank user")
    public void john_is_a_registered_para_bank_user() {

        this.user = new User("john", "demo");
    }

    @When("they log in using their credentials")
    public void they_log_in_using_their_credentials() {

        new LoginPage(this.driver)
                .open()
                .loginAs(this.user.getUsername(), this.user.getPassword());
    }

    @Then("they can access restricted areas of ParaBank")
    public void they_can_access_restricted_areas_of_para_bank() {

        boolean isLoggedIn = new AccountsOverviewPage(this.driver).isOpened();

        assertThat(isLoggedIn).isTrue();
    }

    @After("@userinterface")
    public void closeBrowser() {

        this.driver.quit();
    }

}
