package co.uk.safebear.pages.Locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginPageLocators {

    // Username
    private By usernameFieldLocator = By.xpath(".//input[@id=\"username\"]");

    // Password
    private By passwordFieldLocator = By.xpath(".//input[@id=\"password\"]");

    // Submit button
    private By submitButtonLocator = By.xpath(".//button[@onclick=\"validate()\"]");

    // Failed login
    private By failedLoginMessage = By.xpath(".//p[@id=\"rejectLogin\"]/b");


}
