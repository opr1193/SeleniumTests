package com.infarmbureau.incorporated.test.pages;

import com.infarmbureau.qa.elements.*;
import com.infarmbureau.qa.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.infarmbureau.qa.enums.Spinner.SPINNER;

public class ResourcesPage extends Page {

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[1]")
    private WebElement agintheclassroomElement;
    public IfbLink agintheclassroomlink = new IfbLink(driver, agintheclassroomElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a[1]")
    private WebElement classroomcenterElement;
    public IfbLink classroomcenterlink = new IfbLink(driver, classroomcenterElement);
    
    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a[1]")
    private WebElement accurateagbookElement;
    public IfbLink accurateagbooklink = new IfbLink(driver, accurateagbookElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[2]")
    private WebElement additionallinksElement;
    public IfbLink additionallinks = new IfbLink(driver, additionallinksElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[3]")
    private WebElement AITCElement;
    public IfbLink AITClink = new IfbLink(driver, AITCElement);

    @FindBy(xpath = "//*[@id=\"Teacher_Name\"]")
    private WebElement AITCTeachernameElement;
    public IfbTextBox AITCteachernametextbox = new IfbTextBox(driver, AITCTeachernameElement);

    @FindBy(xpath = "//*[@id=\"Teacher_Email\"]" )
    private WebElement AITCteacheremailElement;
    public IfbTextBox AITCteacheremailtextbox = new IfbTextBox(driver, AITCteacheremailElement);

    @FindBy(xpath = "//*[@id=\"School_Name\"]")
    private WebElement AITCschoolnameElement;
    public IfbTextBox AITCschoolnametextbox = new IfbTextBox(driver, AITCschoolnameElement);

    @FindBy(xpath = "//*[@id=\"School_Address_Street\"]")
    private WebElement AITCschooladdressElement;
    public IfbTextBox AITCschooladdresstextbox = new IfbTextBox(driver, AITCschooladdressElement);

    @FindBy(xpath = "//*[@id=\"School_Address_City\"]")
    private WebElement AITCschoolcityElement;
    public IfbTextBox AITCschoolcitytextbox = new IfbTextBox(driver, AITCschoolcityElement);

    @FindBy(xpath = "//*[@id=\"School_Address_State\"]")
    private WebElement AITCschoolstateElement;
    public IfbDropDown AITCschoolstatedropdown = new IfbDropDown(driver, AITCschoolstateElement);

    @FindBy(xpath = "//*[@id=\"School_Address_Zip\"]")
    private WebElement AITCschoolzipElement;
    public IfbTextBox AITCschoolziptextbox = new IfbTextBox(driver, AITCschoolzipElement);

    @FindBy(xpath = "//*[@id=\"School_Address_County\"]")
    private WebElement AITCschoolcountyElement;
    public IfbDropDown AITCschoolcountydropdown = new IfbDropDown(driver, AITCschoolcountyElement);

    @FindBy(xpath = "//*[@id=\"SchoolYear\"]")
    private WebElement AITCschoolyearElement;
    public IfbTextBox AITCschoolyeartextbox = new IfbTextBox(driver, AITCschoolyearElement);

    @FindBy(xpath = "//*[@id=\"AllGradeLevels_7__IsSelected\"]")
    private WebElement AITCgradelevelElement;
    public IfbCheckBox AITCgradelevelcheckbox = new IfbCheckBox(driver, AITCgradelevelElement);

    @FindBy(xpath = "//*[@id=\"AllDepartments_7__IsSelected\"]")
    private WebElement AITCdepElement;
    public IfbCheckBox AITCdepcheckbox = new IfbCheckBox(driver, AITCdepElement);

    @FindBy(xpath = "//*[@id=\"NumberOfStudents\"]")
    private WebElement AITCnoofstudentsElement;
    public IfbTextBox AITCnoofstudentstextbox = new IfbTextBox(driver, AITCnoofstudentsElement);

    @FindBy(xpath = "//*[@id=\"HasBooks\"]")
    private WebElement AITCagthemebooksElement;
    public IfbDropDown AITCagthemebooksdropdown = new IfbDropDown(driver, AITCagthemebooksElement);

    @FindBy(xpath = "//*[@id=\"HasVolunteers\"]" )
    private WebElement AITCvolunteerElement;
    public IfbDropDown AITCvolunteerdropdown = new IfbDropDown(driver, AITCvolunteerElement);

    @FindBy(xpath = "//*[@id=\"HasFieldTrips\"]")
    private WebElement AITCagthemedfieldElement;
    public IfbDropDown AITCagthemeddropdown = new IfbDropDown(driver, AITCagthemedfieldElement);

    @FindBy(xpath = "//*[@id=\"AllThemes_1__IsSelected\"]")
    private WebElement AITCsubjectElement;
    public IfbCheckBox AITCsubjectcheckbox = new IfbCheckBox(driver, AITCsubjectElement);

    @FindBy(xpath = "//*[@id=\"aitcForm\"]/div/div[17]/div/input")
    private WebElement AITCregisterElement;
    public IfbButton AITCregisterbutton = new IfbButton(driver, AITCregisterElement);

    @FindBy(xpath = "//*[@id=\"main-nav-container_mn_active\"]/a")
    private WebElement AITClogoutElement;
    public  IfbLink AITClogoutlink = new IfbLink(driver, AITClogoutElement);

    @FindBy(xpath = "//*[@id=\"MainContent_T51928A07018_Col01\"]/nav/ul/li[1]/ul/li[1]/a")
    private WebElement AITCformclassroomElement;
    public IfbLink AITCformclassroomlink = new IfbLink(driver, AITCformclassroomElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[2]")
    private WebElement AITCadoptclassroomElement;
    public IfbLink AITCadoptclassroomlink = new IfbLink(driver, AITCadoptclassroomElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[3]")
    private WebElement AITCvolunteercenterElement;
    public IfbLink AITCvolunteercenterlink = new IfbLink(driver, AITCvolunteercenterElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a[1]")
    private WebElement AITCvolunteerrecogprogramElement;
    public IfbLink AITCvolunteerrecogprogramlink = new IfbLink(driver, AITCvolunteerrecogprogramElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[2]")
    private WebElement AITCvolunteerrecogprogramlevelsElement;
    public IfbLink AITCvolunteerrecogprogramlevelslink = new IfbLink(driver, AITCvolunteerrecogprogramlevelsElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col00\"]/div/nav/ol/li[5]/a")
    private WebElement AITCbacktovolunteercenterElement;
    public IfbLink AITCbacktovolunteercenterlink = new IfbLink(driver, AITCbacktovolunteercenterElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[4]" )
    private WebElement AITCprogramsandeventsElement;
    public IfbLink AITCprogramsandeventslink = new IfbLink(driver, AITCprogramsandeventsElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a")
    private WebElement AITCgrantsElement;
    public IfbLink AITCgrantslink = new IfbLink(driver, AITCgrantsElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col00\"]/div/nav/ol/li[5]/a")
    private WebElement AITCgrantsprogramsElement;
    public IfbLink AITCgrantsprogramslink = new IfbLink(driver, AITCgrantsprogramsElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[5]")
    private WebElement AITCscholarshipsElement;
    public IfbLink AITCscholarshipslink = new IfbLink(driver, AITCscholarshipsElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col00\"]/div/nav/ol/li[4]/a")
    private WebElement backtoAITCElement;
    public IfbLink backtoAITClink = new IfbLink(driver, backtoAITCElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[2]")
    private WebElement leadersinactionElement;
    public IfbLink leadersinactionlink = new IfbLink(driver, leadersinactionElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[3]")
    private WebElement womensleadershipElement;
    public IfbLink womensleadershiplink = new IfbLink(driver, womensleadershipElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a")
    private WebElement districteducationElement;
    public IfbLink districteducationlink = new IfbLink(driver, districteducationElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[4]")
    private WebElement youngfarmersElement;
    public IfbLink youngfarmerslink = new IfbLink(driver, youngfarmersElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a[1]")
    private WebElement statecommitteeElement;
    public IfbLink statecommitteelink = new IfbLink(driver, statecommitteeElement);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/div/a[1]")
    private WebElement district1Element;
    public IfbLink district1link = new IfbLink(driver, district1Element);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[2]")
    private WebElement district2Element;
    public IfbLink district2link = new IfbLink(driver, district2Element);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[3]")
    private WebElement district3Element;
    public IfbLink district3link = new IfbLink(driver, district3Element);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[4]")
    private WebElement district4Element;
    public IfbLink district4link = new IfbLink(driver, district4Element);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[5]")
    private WebElement district5Element;
    public IfbLink district5link = new IfbLink(driver, district5Element);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[6]")
    private WebElement district6Element;
    public IfbLink district6link = new IfbLink(driver, district6Element);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[7]")
    private WebElement district7Element;
    public IfbLink district7link = new IfbLink(driver, district7Element);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[7]")
    private WebElement district8Element;
    public IfbLink district8link = new IfbLink(driver, district8Element);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[9]")
    private WebElement district9Element;
    public IfbLink district9link = new IfbLink(driver, district9Element);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col03\"]/div/div/a[10]")
    private WebElement district10Element;
    public IfbLink district10link = new IfbLink(driver, district10Element);

    @FindBy(xpath = "//*[@id=\"Contentplaceholder_T4958B839001_Col00\"]/div/nav/ol/li[3]/a")
    private WebElement backtoyoungfarmersElement;
    public IfbLink backtoyoungfarmerslink = new IfbLink(driver, backtoyoungfarmersElement);

































    



    public ResourcesPage(WebDriver driver) {

        super(driver, SPINNER);

    }
}
