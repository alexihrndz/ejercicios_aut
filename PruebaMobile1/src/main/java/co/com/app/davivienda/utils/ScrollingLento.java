package co.com.app.davivienda.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.time.Duration;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class ScrollingLento implements Interaction {

    private int y1;
    private int x1;
    private int y2;
    private int x2;

    public ScrollingLento(int x1, int y1, int x2, int y2) {
        this.y1 = y1;
        this.y2 = y2;
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        @SuppressWarnings("rawtypes")
		AppiumDriver driver = getProxiedDriver();
        @SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(x1, y1))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
                .moveTo(PointOption.point(x2, y2))
                .release()
                .perform();
    }

    public static Performable scrollDown(int x1, int y1, int x2, int y2) {
        return Instrumented.instanceOf(ScrollingLento.class).withProperties(x1, y1, x2, y2);
    }

}