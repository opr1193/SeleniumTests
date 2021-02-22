package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class HomePage extends Page {

    @FindBy(xpath = "//*[@id=\"main-nav-container_mn_active\"]/a")
    private WebElement loginElement;

    public IfbLink loginlink = new IfbLink(driver, loginElement);

      @FindBy(xpath= "//*[@id=\"MembershipLink\"]/span/a")
    private WebElement membershipElement;

    public IfbLink membershiplink = new IfbLink(driver, membershipElement);

    @FindBy(xpath= "//*[@id=\"OurProgramsLink\"]/span/a")
    private WebElement ourprogramsElement;

    public IfbLink ourprogramslink = new IfbLink(driver, ourprogramsElement);

    @FindBy(xpath= "//*[@id=\"label-E20B7E4B-D540-6B36-96E3-FF0000F5C395\"]")
    private WebElement publicpolicyElement;

    public IfbLink publicpolicylink = new IfbLink(driver, publicpolicyElement);

    @FindBy(xpath= "//*[@id=\"NewsLink\"]/span/a")
    private WebElement newsElement;

    public IfbLink newslink = new IfbLink(driver, newsElement);


    @FindBy(xpath= "//*[@id=\"EventsLink\"]/span/a")
    private WebElement eventsElement;

    public IfbLink eventslink = new IfbLink(driver, eventsElement);

    @FindBy(xpath= "//*[@id=\"navbar-1\"]/div[6]/div[1]/a")
    //*[@id="navbar-1"]/div[6]/div[1]/a
    private WebElement resourcesElement;

    public IfbLink resourceslink = new IfbLink(driver, resourcesElement);

    @FindBy(xpath = "//*[@id=\"MainContent_TCD01A8B5009_Col01\"]/nav/ul/li[8]/a")
    private WebElement contactElement;

    public IfbLink contactlink = new IfbLink(driver,contactElement );

    @FindBy(xpath = "//*[@id=\"MyAccountLink\"]/span/a")
    private WebElement myaccountElement;

    public IfbLink myAccountlink = new IfbLink(driver, myaccountElement);

    @FindBy(xpath = "//*[@id=\"MainContent_TFC894500006_Col00\"]/div/div/a")
    private WebElement mymemberdealsElement;

    public IfbLink mymemberdealslink = new IfbLink(driver, mymemberdealsElement);

    @FindBy(xpath = "//*[@id=\"navbar-1\"]/div[8]/div/a/span")
    private WebElement logoutElement;

    public IfbLink logoutlink = new IfbLink(driver, logoutElement);

    public HomePage(WebDriver driver) {

        super(driver, SPINNER);
    }
}
