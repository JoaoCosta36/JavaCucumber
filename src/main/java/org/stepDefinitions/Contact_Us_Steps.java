package org.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Contact_Us_Steps {
    private WebDriver driver;

    public Contact_Us_Steps() {
    }

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/drivers/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        this.driver = new ChromeDriver(chromeOptions);
        this.driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        this.driver.quit();
    }

    @Given("I access webdriver university contact us page")
    public void i_access_webdriver_university_contact_us_page() throws InterruptedException {
        this.driver.get("http://webdriveruniversity.com/Contact-Us/contactus.html");
        Thread.sleep(3000);
    }

    @When("I enter a first name")
    public void i_enter_a_first_name() {
    }

    @And("I enter a last name")
    public void i_enter_a_last_name() {
    }

    @And("I enter an email address")
    public void i_enter_an_email_address() {
    }

    @And("I enter a commment")
    public void i_enter_a_commment() {
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
    }
}
