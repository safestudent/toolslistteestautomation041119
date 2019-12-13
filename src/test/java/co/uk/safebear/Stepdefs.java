package co.uk.safebear;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.*;

public class Stepdefs {

    private String result;
    private CalculateResult calculateResult = new CalculateResult();

    @When("the user enters the number {int}")
    public void the_user_enters_the_number(Integer input) {
        result = calculateResult.fromInput(input);
    }

    @Then("the word {string} is returned")
    public void the_word_is_returned(String expectedResult) {
        Assert.assertEquals(expectedResult, result);
    }

}
