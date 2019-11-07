package co.uk.safebear;

import co.uk.safebear.pages.LoginPage;
import co.uk.safebear.pages.ToolsPage;
import co.uk.safebear.utils.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest {

    WebDriver browser;
        LoginPage loginPage;
    ToolsPage toolsPage;

    @Before
    public void setup(){
        browser = Driver.getDriver();
        browser.navigate().to(Driver.getUrl());

        loginPage = new LoginPage(browser);
        toolsPage = new ToolsPage(browser);
    }

    @After
    public void tearDown(){

        browser.quit();
    }

    @Test
    public void successfulLoginTest(){

        Assert.assertEquals("Login Page", loginPage.getTitleOfPage());

        loginPage.enterUsername("tester");
        loginPage.enterPassword("letmein");
        loginPage.clickSubmitButton();

        Assert.assertEquals("Login Successful", toolsPage.getMessageText());

    }



}
