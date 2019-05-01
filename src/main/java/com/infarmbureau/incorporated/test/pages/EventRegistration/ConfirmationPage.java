package com.infarmbureau.incorporated.test.pages.EventRegistration;

import com.infarmbureau.qa.elements.IfbLabel;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class ConfirmationPage extends Page {

    public ConfirmationPage(WebDriver driver) {

        super(driver, SPINNER);
    }

    @FindBy(xpath =  "//*[@id=\"kocontainer\"]/div/div/div[1]/div/div[2]/div[2]/div[1]/h6")
    private WebElement confirmationTextElement;

    public IfbLabel confirmationTextField = new IfbLabel(driver, confirmationTextElement);

    @FindBy(xpath = "//*[@id=\"kocontainer\"]/div/div/div[1]/div/div[2]/div[2]/div[1]/h2")
    private WebElement confirmationNumberElement;

    @FindBy(xpath = "//*[@id=\"kocontainer\"]/div/div/div[1]/div/div[2]/div[2]/div[1]/h6") //*[@id="kocontainer"]/div/div/div[1]/div/div[2]/div[2]/div[1]/h2
    private WebElement memberConfirmationTextElement;

    @FindBy(xpath = "//*[@id=\"kocontainer\"]/div/div/div[1]/div/div[2]/div[2]/div[1]/h2")
    private WebElement memberConfirmationNumberElement;



    public IfbLabel confirmationNumber = new IfbLabel(driver, confirmationNumberElement);

    public IfbLabel memberConfirmationTextField = new IfbLabel(driver, memberConfirmationTextElement);


    public IfbLabel memberConfirmationNumber = new IfbLabel(driver, memberConfirmationNumberElement);


}
