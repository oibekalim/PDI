package com.utilities;

import com.pages.AboutPage;
import com.pages.IndustriesPage;
import com.pages.LoginPage;

public class Pages {
    private AboutPage aboutPage;
    private IndustriesPage industriesPage;
    private LoginPage loginPage;
    private BrowserUtilities browserUtilities;

    public BrowserUtilities browserUtilities(){
        if (browserUtilities==null)
            browserUtilities =new BrowserUtilities();
        return browserUtilities;
    }

    public LoginPage login() {
        if (loginPage==null)
            loginPage=new LoginPage();
        return loginPage;
    }

    public IndustriesPage industriesPage() {
        if (industriesPage==null)
            industriesPage=new IndustriesPage();
        return industriesPage;
    }


}
