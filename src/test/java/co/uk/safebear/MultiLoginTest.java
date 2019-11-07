package co.uk.safebear;

import co.uk.safebear.pages.LoginPage;
import co.uk.safebear.pages.ToolsPage;
import co.uk.safebear.utils.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class MultiLoginTest {

    WebDriver jillsBrowser;
    WebDriver bobsBrowser;
    LoginPage jillsLoginPage;
    LoginPage bobsLoginPage;
    ToolsPage jillsToolsPage;
    ToolsPage bobsToolsPage;

    @Before
    public void setup(){
        jillsBrowser = Driver.getDriver();
        bobsBrowser = Driver.getDriver();
        jillsLoginPage = new LoginPage(jillsBrowser);
        bobsLoginPage = new LoginPage(bobsBrowser);
        jillsToolsPage = new ToolsPage(jillsBrowser);
        bobsToolsPage = new ToolsPage(bobsBrowser);

        jillsBrowser.navigate().to(Driver.getUrl());
        bobsBrowser.navigate().to(Driver.getUrl());
    }

    @After
    public void tearDown(){

        jillsBrowser.quit();
        bobsBrowser.quit();
    }

    @Test
    public void twoPeopleLoginTest(){

        Assert.assertEquals("Login Page", bobsLoginPage.getTitleOfPage());
        Assert.assertEquals("Login Page", jillsLoginPage.getTitleOfPage());


        bobsLoginPage.enterUsername("tester1");
        bobsLoginPage.enterPassword("letmein");
        bobsLoginPage.clickSubmitButton();

        Assert.assertEquals("Login Successful", bobsToolsPage.getMessageText());

        jillsLoginPage.enterUsername("tester2");
        jillsLoginPage.enterPassword("letmein");
        jillsLoginPage.clickSubmitButton();

        Assert.assertEquals("Login Successful", jillsToolsPage.getMessageText());

    }


}
