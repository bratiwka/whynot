package Steps;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.Driver;

import static org.junit.Assert.assertEquals;

public class ThenSteps {



    @Then("the form is successfully completed")
    public void thenTheFormIsSuccessfullyCompleted(){
        String expected = "Thank You for your Message!";
        WebElement element =
                Driver.getDriver().findElement(By.xpath("//h1"));

        String actual = element.getText().trim();
        assertEquals(expected,actual);
    }

     //  Then an error message is displayed

    @Then("an error message is displayed")
    public void thenAnErrorMessageIsDisplayed(){

        String expected = "Sorry   that password is too short." +
                " It needs to be eight characters or more.";

        WebElement element =
              Driver.getDriver().findElement
                      (By.xpath("//p[@class='form-message__text']"));

        String actual = element.getText().trim();
        assertEquals(expected, actual);



    }






}
