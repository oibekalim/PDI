package com.pages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndustriesPage extends  Menu{

    public IndustriesPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@tabindex='4']")
    public WebElement cookie;

   // @FindBy(xpath = "(//a[@class='mega-menu-link'])[10]")
   // @FindBy(xpath = "//li[@id='mega-menu-item-3043']")
    public WebElement industriesInMenu;

    @FindBy(xpath = "//a[@class='mega-menu-link'][contains(.,'Retail')]")
    public WebElement retail;

    @FindBy(xpath = "(//a[@class='links'][contains(.,'ERP')])[1]")
    public WebElement erpModule;

    @FindBy(xpath = "//a[@class='mega-menu-link'][contains(.,'Logistics')]")
    public WebElement logistics;

    @FindBy(xpath = "//a[@class='mega-menu-link'][contains(.,'Wholesale')]")
    public WebElement wholesale;






    public void login(){
//        username.sendKeys(ConfigurationReader.getProperty("username"));
//        password.sendKeys(ConfigurationReader.getProperty("password"));
//        loginButton.click();
    }


    public void open() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
}
