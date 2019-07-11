package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class Menu {

    public Menu() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='mega-menu-link'])[10]")
    public WebElement titleIndustries;

    @FindBy(xpath = "//a[@class='mega-menu-link'][contains(.,'Solutions')]")
    public WebElement solutionsInMenu;

    @FindBy(xpath = "(//a[@class='links'][contains(.,'ERP')])[1]")
    public WebElement titleERP;




}
