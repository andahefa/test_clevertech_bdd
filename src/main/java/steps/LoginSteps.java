package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class LoginSteps extends LoginPage {

    @Step("Ingresar usuario")
    public void typeUsername(String username){
        txtUsername.sendKeys(username);
    }

    @Step("Ingresar contrasena")
    public void typeContrasena(String contrasena){
        txtContrasena.sendKeys(contrasena);
    }

    @Step("Click button login")
    public void clickBtnLogin(){
        btnLogin.click();
    }
}
