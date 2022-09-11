package co.com.choucair.challengeUtest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UTestHomePage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button to start registration")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
