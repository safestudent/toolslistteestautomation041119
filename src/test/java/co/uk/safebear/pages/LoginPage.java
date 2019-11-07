package co.uk.safebear.pages;

import co.uk.safebear.pages.Locators.LoginPageLocators;
import co.uk.safebear.utils.Waits;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

@RequiredArgsConstructor
public class LoginPage {

    LoginPageLocators locators = new LoginPageLocators();

    @NonNull
    WebDriver browser;

    public String getTitleOfPage(){
        return browser.getTitle();
    }

    public void enterUsername(String username){
         Waits.waitForElement(locators.getUsernameFieldLocator(), browser).sendKeys(username);
    }

    public void enterPassword(String password){
        Waits.waitForElement(locators.getPasswordFieldLocator(), browser).clear();
        Waits.waitForElement(locators.getPasswordFieldLocator(), browser).sendKeys(password);
    }

    public void clickSubmitButton(){
        Waits.waitForElement(locators.getSubmitButtonLocator(), browser).click();
    }

    public String getMessageText(){
        return Waits.waitForElement(locators.getFailedLoginMessage(), browser).getText();
    }

    public boolean isMessageDisplayed(){
        return Waits.waitForElement(locators.getFailedLoginMessage(), browser).isDisplayed();
    }



}
