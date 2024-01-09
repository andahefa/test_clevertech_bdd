package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//body/center/form[@name='f']/div[@id='available']/table[@id='listing']/tbody/tr[2]/td[4]/input[1]")
    protected WebElementFacade lblLoginExitoso;

    @FindBy(xpath = "//input[contains(@type,'text')]")
    private List<WebElementFacade> input;

    public List<WebElementFacade> getInput() {
        return input;
    }

}
