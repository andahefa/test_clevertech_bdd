package steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ValidationPage;

import java.time.Duration;
import java.util.List;

public class ValidationLoginStep extends ValidationPage {

    @Step("Validar visualizacion despues del login")
    public Boolean titleIsVisible() {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(
                ExpectedConditions.visibilityOf(lblLoginExitoso));

        List<WebElementFacade> inputs = getInput();

        for (WebElementFacade input : inputs) {
            input.sendKeys("1");
        }

        return lblLoginExitoso.isVisible();
    }
}
