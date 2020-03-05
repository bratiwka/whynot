package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class ContactUsForm {


    @FindBy(name = "first_name")
    private static WebElement firstName;

    @FindBy(name = "last_name")
    private static WebElement lastName;

    @FindBy(name = "email")
    private static WebElement email;

    @FindBy(name = "message")
    private static WebElement comments;


    @FindBy(xpath = "//input[@type='submit']")
    private static WebElement submit;


    private static String URL = "http://webdriveruniversity.com/Contact-Us/contactus.html";


    public static void startPage(){
        PageFactory.initElements(Driver.getDriver(), ContactUsForm.class);
        Driver.getDriver().get(URL);
    }

    public static void inputFirstName(String text){
        firstName.sendKeys(text);
    }

    public static void inputLastName(String text){
        lastName.sendKeys(text);
    }

    public static void inputEmail(String text){
        email.sendKeys(text);
    }

    public static void inputComments(String text){
        comments.sendKeys(text);
    }

    public static void clickSubmit(){
        submit.click();
    }





}
