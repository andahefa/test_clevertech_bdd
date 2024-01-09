package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import steps.LoginSteps;
import steps.ValidationLoginStep;
import utility.Constants;
import utility.WebSite;

import java.util.List;

public class LoginDefinitions {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginSteps login;

    @Steps(shared = true)
    ValidationLoginStep validate;

    @Given("the user navigates to the website")
    public void userNavigateTo(){
        url.navigateTo(Constants.BASEURL);
    }

    @When("ingresa usuario {string} y contrasena {string}")
    public void userlogin(String usuario, String contrasena){
        login.typeUsername(usuario);
        login.typeContrasena(contrasena);
        login.clickBtnLogin();
    }

    @Then("la aplicacion deberia mostrar el modulo principal del producto")
    public void validateLoginCorrectamente(){
        Assert.assertTrue(validate.titleIsVisible());

    }

}
