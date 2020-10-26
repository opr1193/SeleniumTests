package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.IfbButton;
import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.elements.IfbTextBox;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class LoginPage extends Page {



    @FindBy(id = "username")
    private WebElement userNameElement;
    public IfbTextBox usernameTextField = new IfbTextBox(driver, userNameElement);

    @FindBy(id = "password")
    private WebElement passwordElement;
    public IfbTextBox passwordTextField = new IfbTextBox(driver, passwordElement);



    //@FindBy(xpath = "//*[@id=\"fm1\"]/div[2]/input[4]")
    @FindBy(xpath = "//*[@id=\"fm1\"]/div[3]/div[2]/input[4]")

    private WebElement loginElement;
    public IfbLink loginLink = new IfbLink(driver,loginElement);

    public LoginPage(WebDriver driver) {

        super(driver, SPINNER);
    }
}