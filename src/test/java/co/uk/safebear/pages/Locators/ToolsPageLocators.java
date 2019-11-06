package co.uk.safebear.pages.Locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class ToolsPageLocators {

    private By successfulLoginMessage = By.xpath(".//body/div[@class='container']/p/b");

}
