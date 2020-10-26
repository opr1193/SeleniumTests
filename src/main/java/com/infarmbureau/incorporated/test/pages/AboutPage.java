package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.IfbButton;
import com.infarmbureau.qa.elements.IfbDropDown;
import com.infarmbureau.qa.elements.IfbLink;
import com.infarmbureau.qa.elements.IfbTextBox;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class AboutPage extends Page {


    @FindBy(xpath = "//*[@id=\"label-E50D7E4B-D540-6B36-96E3-FF0000F5C395\"]")
    private WebElement aboutElement;

    public IfbLink aboutlink = new IfbLink(driver, aboutElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[1]")
    private WebElement missionElement;

    public IfbLink missionlink = new IfbLink(driver, missionElement );

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[2]")
    private WebElement leadershipElement;

    public IfbLink leadershiplink = new IfbLink(driver, leadershipElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a[1]")
    private WebElement randyelement;

    public IfbLink randylink = new IfbLink(driver, randyelement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[2]")
    private WebElement kendellelement;

    public IfbLink kendelllink = new IfbLink(driver, kendellelement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[3]" )
    private WebElement isabellaelement;

    public  IfbLink isabellalink = new IfbLink(driver, isabellaelement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[4]")
    private WebElement markelement;

    public IfbLink marklink = new IfbLink(driver, markelement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[5]")
    private WebElement boardofdirectorsElement;

    public IfbLink boardofdirectorslink = new IfbLink(driver, boardofdirectorsElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a[6]")
    private WebElement districtElement;

    public IfbLink districtlink = new IfbLink(driver, districtElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a[7]")
    private WebElement youngfarmersElement;

    public IfbLink youngfarmerslink = new IfbLink(driver, youngfarmersElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[4]/ul/li[1]/a")
    private WebElement stateyoungElement;

    public IfbLink stateyounglink = new IfbLink(driver, stateyoungElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[2]")
    private WebElement collegiateElement;

    public IfbLink collegiatelink = new IfbLink(driver, collegiateElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[3]")
    private WebElement awardsElement;

    public IfbLink awardslink = new IfbLink(driver, awardsElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[4]")
    private WebElement activitiesElement;

    public IfbLink activitieslink = new IfbLink(driver, activitiesElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[5]")
    private WebElement infb100Element;

    public  IfbLink infb100link = new IfbLink(driver, infb100Element);

    @FindBy(xpath ="//*[@id='header-content']/div/div/div/div/div/div[1]/div[1]/div[1]")

    private WebElement menuElement;

    public IfbLink menulink = new IfbLink(driver, menuElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[3]")
    private WebElement staffElement;

    public IfbLink stafflink = new IfbLink(driver, staffElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a[1]")

    private WebElement adminElement;

    public IfbLink adminlink = new IfbLink(driver, adminElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[2]")

    private WebElement legalElement;

    public IfbLink legallink = new IfbLink(driver, legalElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[4]")
    private WebElement organisationElement;

    public IfbLink organisationlink = new IfbLink(driver, organisationElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[5]")
    private WebElement publicElement;

    public IfbLink publiclink = new IfbLink(driver, publicElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[3]")
    private WebElement marketingElement;

    public IfbLink marketinglink = new IfbLink(driver, marketingElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[3]/ul/li[6]/a")
    private WebElement regionalElement;

    public IfbLink regionallink = new IfbLink(driver, regionalElement);


    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[4]")
    private WebElement countyElement;

    public IfbLink countylink = new IfbLink(driver, countyElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[5]")
    private WebElement historyElement;

    public IfbLink historylink = new IfbLink(driver, historyElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a[1]")
    private WebElement historyoneElement;

    public IfbLink historyonelink = new IfbLink(driver, historyoneElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[6]/ul/li[1]/a")
    private WebElement  ifbhundredElement;

    public  IfbLink ifbhundredlink = new IfbLink(driver, ifbhundredElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a[2]")
    private WebElement ifbadvocacyElement;

    public IfbLink ifbadvocacylink = new IfbLink(driver, ifbadvocacyElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a[3]")
    private WebElement ifbwomenElement;

    public IfbLink ifbwomenlink = new IfbLink(driver, ifbwomenElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a[4]")
    private WebElement ifbyouthElement;

    public IfbLink ifbyouthlink = new IfbLink(driver, ifbyouthElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a[5]")
    private WebElement datesofincElement;

    public IfbLink datesofinclink = new IfbLink(driver, datesofincElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[6]")
    private WebElement ifbpastElement;

    public  IfbLink ifbpastlink = new IfbLink(driver, ifbpastElement);

    @FindBy(xpath = "//*[@id=\"MainContent_TCD01A8B5009_Col01\"]/nav/ul/li[7]/a")
    private WebElement careersElement;

    public IfbLink careerslink = new IfbLink(driver, careersElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[7]")

    private WebElement contactElement;

    public IfbLink contactlink = new IfbLink(driver, contactElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[8]/a")
    private WebElement contacttElement;

    public IfbLink contacttlink = new IfbLink(driver, contacttElement );


    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col02\"]/div[2]/div/p[1]/a")
    private WebElement contactusElement;

    public IfbLink contactuslink = new IfbLink(driver, contactusElement);

    @FindBy(xpath = "//*[@id=\"contactUsForm\"]/div/div[2]/div/div[1]/div[1]/div[1]")
    private WebElement typeElement;

    public IfbDropDown type = new IfbDropDown(driver, typeElement);

    @FindBy(xpath = "//*[@id=\"contactUsForm\"]/div/div[2]/div/div[3]/div[1]/div[1]")
    private WebElement membenhelptypeElement;

    public IfbLink membenhelptype = new IfbLink(driver, membenhelptypeElement);


    @FindBy(id = "FirstName")
    private WebElement firstnameElement;

    public IfbTextBox  firstname = new IfbTextBox(driver, firstnameElement);

    @FindBy(id = "LastName")
    private WebElement lastnameElement;

    public IfbTextBox lastname = new IfbTextBox(driver, lastnameElement);

    @FindBy(id = "Email")
    private WebElement emailinputElement;

    public IfbTextBox emailinput = new IfbTextBox(driver, emailinputElement );


    @FindBy(xpath = "//*[@id=\"contactUsForm\"]/div/div[4]/div/div[5]/div[1]/div[1]")
    private WebElement contactedElement;

    public IfbDropDown contacted = new IfbDropDown(driver, contactedElement);

    @FindBy(xpath = "//*[@id=\"MembershipNumber\"]")
    private WebElement membershipnumberElement;

    public IfbTextBox membershipnumber = new IfbTextBox(driver, membershipnumberElement);

    @FindBy(xpath = "//*[@id=\"Username\"]")
    private WebElement usernameElement;

    public IfbTextBox username = new IfbTextBox(driver, usernameElement);

    @FindBy(css = "#Comments")
    private WebElement commentsElement;

    public IfbTextBox comments = new IfbTextBox(driver, commentsElement);

    @FindBy(xpath = "//*[@id=\"MemberBenefitsHelpType\"]")
    private WebElement memberbenefitsElement;

    public  IfbDropDown memberbenefits = new IfbDropDown(driver, memberbenefitsElement);

    @FindBy(xpath = "//*[@id=\"ContactMethodDDL\"]")

    private WebElement membercontactedElement;

    public IfbDropDown membercontacted = new IfbDropDown(driver, membercontactedElement);

    @FindBy(id = "Comments")

    private WebElement descriptionElement;

    public IfbTextBox description = new IfbTextBox(driver, descriptionElement);

    @FindBy(xpath = "//*[@id=\"LoginHelpType\"]")
    private WebElement loginhelptypeWlement;

    public IfbDropDown loginhelptype = new IfbDropDown(driver, loginhelptypeWlement);

    @FindBy(id = "SubmitButton")
    private WebElement submitButtonElement;

    public IfbButton submit = new IfbButton(driver, submitButtonElement);



    public AboutPage(WebDriver driver) {

        super(driver, SPINNER);
    }
}