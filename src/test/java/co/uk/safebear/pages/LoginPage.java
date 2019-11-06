package co.uk.safebear.pages;

import co.uk.safebear.pages.Locators.LoginPageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class LoginPage {

    LoginPageLocators locators = new LoginPageLocators();

    @NonNull
    WebDriver browser;

    public String getTitleOfPage(){
        return browser.getTitle();
    }

    public void enterUsername(String username){
        browser.findElement(locators.getUsernameFieldLocator()).sendKeys(username);
    }

    public void enterPassword(String password){
        browser.findElement(locators.getPasswordFieldLocator()).clear();
        browser.findElement(locators.getPasswordFieldLocator()).sendKeys(password);
    }

    public void clickSubmitButton(){
        browser.findElement(locators.getSubmitButtonLocator()).click();
    }

    public String getMessageText(){
        return browser.findElement(locators.getFailedLoginMessage()).getText();
    }

    public boolean isMessageDisplayed(){
        return browser.findElement(locators.getFailedLoginMessage()).isDisplayed();
    }



}
