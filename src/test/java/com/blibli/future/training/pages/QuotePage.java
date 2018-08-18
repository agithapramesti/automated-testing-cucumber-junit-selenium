package com.blibli.future.training.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("http://gosoft.web.id/wonderfulQuote/")
public class QuotePage extends PageObject {

    @FindBy(xpath = "//textarea[@placeholder='input quotes here']")
    private WebElementFacade inputQuote;

    @FindBy(xpath = "//input[@placeholder=\"input author's name here\"]")
    private WebElementFacade inputAuthor;

    @FindBy(xpath = "//select[@class='form-control']")
    private WebElementFacade selectBackgroundColour;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElementFacade clickBtnAddQuotes;

    public void inputQuote(String quote){
        inputQuote.type(quote);
    }

    public void inputAuthor(String author){
        inputAuthor.type(author);
    }

    public void selectBackgroundColour(String bcColour){
        selectBackgroundColour.selectByVisibleText(bcColour);
    }

    public void clickBtnAddQuotes(){
        clickBtnAddQuotes.click();
    }
}
