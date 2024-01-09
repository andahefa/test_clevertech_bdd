package utility;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebSite {

    @Steps(shared = true)
    PageObject webSite;

    @Step("To navigate the website.")
    public void navigateTo(String url){
        webSite.setDefaultBaseUrl(url);
        webSite.open();
    }
}
