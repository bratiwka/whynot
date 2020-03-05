package Steps;

import Pages.BBC_SignInPage;
import Pages.ContactUsForm;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;
import org.openqa.selenium.support.ui.Select;
import util.Driver;

public class GivenSteps {



    @Given("I am on the contact us page")
    public void givenIAmOnTheContactUsPage() {
        ContactUsForm.startPage();


    }

    @Given("I am on the BBC page")
    public void givenIAmOnTheBBCPage(){
        BBC_SignInPage.startPage();
    }







}
