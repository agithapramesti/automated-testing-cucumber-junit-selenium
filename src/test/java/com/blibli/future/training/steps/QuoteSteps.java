package com.blibli.future.training.steps;

import com.blibli.future.training.steps.serenity.EndUserQuoteSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class QuoteSteps {

    @Steps
    EndUserQuoteSteps gegeSteps;

    @Given("^User open wonderful quote page$")
    public void userOpenWonderfulQuotePage() throws Throwable {

        gegeSteps.openPage();
    }

    @When("^User input quote \"([^\"]*)\"$")
    public void userInputQuote(String quote) throws Throwable {

        gegeSteps.inputQuote(quote);
    }

    @And("^User type author \"(.*)\"$")
    public void userTypeAuthor(String author) throws Throwable {

        gegeSteps.inputAuthor(author);
    }

    @And("^User select colour \"([^\"]*)\"$")
    public void userSelectColour(String colour) throws Throwable {

        gegeSteps.selectBackgroundColour(colour);
    }

    @And("^User click add quote button$")
    public void userClickAddQuoteButton() throws Throwable {

        gegeSteps.clickAddQuote();
    }

    @Then("^Quote should be added$")
    public void quoteShouldBeAdded() throws Throwable {


    }

    @Then("^User should see quote \"([^\"]*)\"$")
    public void userShouldSeeQuote(String quote) throws Throwable {

        gegeSteps.shouldSeeQuote(quote);
    }
}
