package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class BBC_SignInPage {


    @FindBy(id = "idcta-username")
    private static WebElement signIn;

    @FindBy(xpath = "//input[@id='user-identifier-input']")
    private static WebElement userName;

    @FindBy(id = "password-input")
    private static WebElement password;

    @FindBy(id = "submit-button")
    private static WebElement submit;




    private static String URL = "https://www.bbc.com/news";

    public static void startPage(){
        PageFactory.initElements(Driver.getDriver(),
                BBC_SignInPage.class);
        Driver.getDriver().get(URL);
    }

    public static void clickSignIn(){
        signIn.click();
    }

    public static void inputUserName(String text){
        userName.sendKeys(text);
    }

    public static void inputPassword(String text){
        password.sendKeys(text);
    }

    public static void clickSubmit(){
        submit.click();
    }











}
