package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(name = "user")
    protected WebElementFacade txtUsername;

    @FindBy(name = "password")
    protected WebElementFacade txtContrasena;

    @FindBy(className = "button")
    protected WebElementFacade btnLogin;

}
