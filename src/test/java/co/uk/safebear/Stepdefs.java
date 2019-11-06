package co.uk.safebear;

import co.uk.safebear.pages.LoginPage;
import co.uk.safebear.pages.ToolsPage;
import co.uk.safebear.utils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class Stepdefs {

    WebDriver browser;
    LoginPage loginPage;
    ToolsPage toolsPage;

    @Before
    public void setup(){

        // This is where we get the Chromedriver or IEDriver etc...
        browser = Driver.getDriver();

        browser.navigate().to(Driver.getUrl());

        loginPage = new LoginPage(browser);
        toolsPage = new ToolsPage(browser);
    }

    @After
    public void tearDown(){
        try {
            Thread.sleep(Integer.parseInt(System.getProperty("sleep", "2000")));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        browser.quit();
    }


    @Given("I am logged out")
    public void i_am_logged_out() {

        Assert.assertEquals("Login Page", loginPage.getTitleOfPage());

    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickSubmitButton();

    }

    @Then("the user is informed that the login is successful")
    public void the_user_is_informed_that_the_login_is_successful() {

        Assert.assertTrue(toolsPage.getMessageText().contains("Successful"));

        Assert.assertEquals("Login Successful", toolsPage.getMessageText());

    }

}
