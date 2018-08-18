package com.blibli.future.training.steps.serenity;

import com.blibli.future.training.pages.QuotePage;
import net.thucydides.core.annotations.Step;

public class EndUserQuoteSteps {


    QuotePage quotePage;

    @Step
    public void openPage(){

        quotePage.open();
    }

    @Step
    public void inputQuote(String quote){

        quotePage.inputQuote(quote);
    }

    @Step
    public void inputAuthor(String author){

        quotePage.inputAuthor(author);
    }

    @Step
    public void selectBackgroundColour(String colour){

        quotePage.selectBackgroundColour(colour);
    }

    @Step
    public void clickAddQuote(){

        quotePage.clickBtnAddQuotes();
    }
}
