package com.infarmbureau.incorporated.test.pages.EventRegistration;

import com.infarmbureau.qa.elements.IfbLabel;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class CancellationConfirmationPage extends Page {

    public CancellationConfirmationPage(WebDriver driver) {

        super(driver, SPINNER);
    }

    @FindBy(xpath =  "//*[@id=\"kocontainer\"]/div/div/div[1]/div/div[1]")
    private WebElement registrationcancellationTextElement;

    public IfbLabel registrationcancellationTextField = new IfbLabel(driver, registrationcancellationTextElement);

    @FindBy(xpath = "//*[@id=\"kocontainer\"]/div/div/div[1]/div/div[2]/div")
    private WebElement cancellationTextElement;

    public IfbLabel cancellationtextTextField = new IfbLabel(driver, cancellationTextElement);


}
