package stepDefine;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import pageObjects.DemoPage;

public class DemoStep {
    DemoPage demoPage;
    Actor staff = new Actor("admin");

    @Given("Open web page")
    public void openWebPage() {
        demoPage.open();
    }

    @When("Select the {string} radio button option.")
    public void selectTheRadioButtonOption(String values) {
        staff.attemptsTo(Click.on(demoPage.getRadioName(values)));
    }

    @And("Click the {string} Button")
    public void clickTheButton(String values) {
        staff.attemptsTo(Click.on(demoPage.BTN_NEXT));
    }

    @Then("Assert text {string} exists")
    public void assertTextExists(String values) {
        staff.attemptsTo(Ensure.that(demoPage.TXT_HAVE_A_NICE_DAY.getText()).isEqualTo(values));
    }
}
