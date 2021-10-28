package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.surveymonkey.com/r/9MVSPYS")
public class DemoPage extends PageObject {

    public WebElementFacade getRadioName(String name) {
        return find(By.xpath("//span[contains(text(),'" + name + "')]"));
    }

    @FindBy(xpath = "//button[@class='btn small next-button survey-page-button user-generated notranslate']")
    public WebElementFacade BTN_NEXT;

    @FindBy(xpath = "//div[@class='h3 page-subtitle  user-generated notranslate']")
    public WebElementFacade TXT_HAVE_A_NICE_DAY;

}
