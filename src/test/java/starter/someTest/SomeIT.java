package starter.someTest;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class SomeIT {

    @Managed
    WebDriver aDriver;

    @Test
    public void createTestOutcomeWithScreenshot() {
        Actor actor = new Actor("Performance Tester");
        actor.can(BrowseTheWeb.with(aDriver));
        actor.attemptsTo(
            Open.url("https://google.com/")
        );
    }
}


