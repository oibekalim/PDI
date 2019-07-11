package com.step_definitions;

import com.utilities.ApplicationConstants;
import com.utilities.BrowserUtilities;
import com.utilities.Driver;
import com.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IndustriesStepDefs {

    protected Pages pages = new Pages();

    @When("user clicks on industries module")
    public void user_clicks_on_industries_module() throws InterruptedException {
        pages.industriesPage().open();
        BrowserUtilities.wait(2);

        pages.industriesPage().cookie.click();
        BrowserUtilities.wait(3);

        BrowserUtilities.clickWithJS(Driver.getDriver().findElement(By.xpath("//a[@class='mega-menu-link'][contains(.,'Industries')]")));
        Thread.sleep(2000);

    }

    @Then("click on retail page")
    public void click_on_retail_page() {
        pages.industriesPage().retail.click();
    }

    @Then("check the page title")
    public void check_the_page_title() {
        Assert.assertEquals(ApplicationConstants.INDUSTRIES_RETAIL_TITLE, Driver.getDriver().getTitle());
    }


    @Then("user clicks on erp module")
    public void user_clicks_on_erp_module() {
        pages.industriesPage().erpModule.click();
        Driver.getDriver().navigate().back();
    }

    @Then("click on logistics page")
    public void click_on_logistics_page() {
        pages.industriesPage().logistics.click();
        Driver.getDriver().navigate().back();
    }

    @Then("click on wholesale page")
    public void click_on_wholesale_page() {
        pages.industriesPage().wholesale.click();


    }
}