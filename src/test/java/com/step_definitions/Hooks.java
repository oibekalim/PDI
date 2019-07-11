package com.step_definitions;

import com.utilities.DBUtilities;
import com.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp() throws InterruptedException {
        // driver = Driver.getDriver();
        Driver.getDriver().manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
       /* driver.get(ConfigurationReader.getProperty("url"));
        Thread.sleep(15000);*/
    }


    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()) {

            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.embed(screenshot, "image/png");
        }

        Driver.closeDriver();
    }

//    // @Before(value = "@dbb")
//    @Before(value = "@db")
//    public void setUpDBConnection(){
//        DBUtilities.createConnection();
//    }
//
//    //   @After(value = "dbb")
//    @After(value = "@db")
//    public void closeDBConnection(){
//        DBUtilities.closeConnection();
//    }
}
