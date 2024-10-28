package learn.letskodeit.com.steps;

import learn.letskodeit.com.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("I am on homepage")
    public void iAmOnHomePage(){

    }

    @When("I click on login link")
    public void clickOnLoginLink(){
        homePage.clickOnLoginLink();
    }

    @When("I click on practise link")
    public void clickOnPractiseLink(){
        homePage.clickOnPractiseLink();
    }

}
