package co.uk.safebear.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

    // Variable that stores the URL.
    // The 'System.getProperty' code allows us to override the URL with a different one (e.g. a different test environment) when we run the tests
    private static final String URL = System.getProperty("url", "http://toolslist.safebear.co.uk:8080");

    private static final String BROWSERNAME = System.getProperty("browser", "Chrome");

    public static String getUrl(){

        return URL;

    }

    public static WebDriver getDriver(){

        ChromeOptions options = new ChromeOptions();

        switch (BROWSERNAME.toUpperCase()){
            case "CHROME":

                System.out.println("Executing on CHROME");

                options.addArguments("start-maximized");

                WebDriverManager.chromedriver().setup();
                return new ChromeDriver(options);

            case "CHROME-HEADLESS":

                // hello

                System.out.println("Executing on CHROME");

                options.addArguments("headless");

                WebDriverManager.chromedriver().setup();
                return new ChromeDriver(options);

            case "IE":

                System.out.println("Executing on IE");

                WebDriverManager.iedriver().setup();
                return new InternetExplorerDriver();

            case "FIREFOX":

                System.out.println("Executing on FireFox");

                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();

            default:
                throw new IllegalArgumentException("The Browser Type is undefined");

        }

    }

}
