package co.uk.safebear.pages;

import co.uk.safebear.pages.Locators.ToolsPageLocators;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class ToolsPage {

    ToolsPageLocators locators = new ToolsPageLocators();

    @NonNull
    WebDriver browser;

    public String getPageTitle(){
        return browser.getTitle();
    }

    public String getMessageText(){
        return browser.findElement(locators.getSuccessfulLoginMessage()).getText();
    }
}
