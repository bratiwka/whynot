package Steps;

import Pages.BBC_SignInPage;
import Pages.ContactUsForm;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;


public class WhenSteps {


   @When("I complete all fields")
    public void whenICompleteAllFields(){
       ContactUsForm.inputFirstName("John");
       ContactUsForm.inputLastName("Smith");
       ContactUsForm.inputEmail("john@gmail.com");
       ContactUsForm.inputComments("testestesttest");
    }


    @When("I click the submit button")
    public void whenIClickSubmitButton()
    {
       ContactUsForm.clickSubmit();
    }


    @When("I click the sign in button")
    public void whenIClickTheSignInButton(){
        BBC_SignInPage.clickSignIn();
    }

  //  I complete email and password with invalid data

    @When("I complete email and password with invalid data")
    public void whenICompleteFields(){
        BBC_SignInPage.inputUserName("asd");
        BBC_SignInPage.inputPassword("asd");
    }

    //   And I click submit

    @When("I click submit")
    public void whenIClickSubmit(){
       BBC_SignInPage.clickSubmit();
    }


}
