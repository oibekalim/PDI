package com.step_definitions;

import com.utilities.ApplicationConstants;
import com.utilities.BrowserUtilities;
import com.utilities.Driver;
import com.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class SmokeTestStepDefinition {

    protected Pages pages=new Pages();



//    @Given("^user on the home page$")
//    public void user_on_the_home_page() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        pages.login().open();
//    }

    @Given("user on the main page")
    public void user_on_the_main_page() {
        pages.industriesPage().open();
    }

    @Then("title of the page should be {string}")
    public void title_of_the_page_should_be(String mainMenuTitle) {
        // Write code here that turns the phrase above into concrete actions
        switch (mainMenuTitle)
        {


            case "Convenience Store Software":
                pages.industriesPage().titleIndustries.click();
                BrowserUtilities.wait(2);
                System.out.println(Driver.getDriver());
                Assert.assertEquals(Driver.getDriver().getTitle(), ApplicationConstants.INDUSTRIES_RETAIL_TITLE);
                break;

            case "ERP Solutions Title":
                pages.industriesPage().titleIndustries.click();
                BrowserUtilities.wait(2);
                Assert.assertEquals(Driver.getDriver().getTitle(), ApplicationConstants.SOLUTIONS_ERP_TITLE);
                break;



            default:
                System.out.println("Wrong Title");

        }



    }


}
