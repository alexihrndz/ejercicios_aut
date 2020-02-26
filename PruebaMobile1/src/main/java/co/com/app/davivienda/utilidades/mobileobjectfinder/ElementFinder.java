package co.com.app.davivienda.utilidades.mobileobjectfinder;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import static co.com.app.davivienda.utilidades.constantes.TipoClaseConstante.CLASE_UTILIDAD;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class ElementFinder {
    private static final String ANDROID = "Android";
    private static final String PLATFORM_NAME = "platformName";

    public static String getPlatformCapability() {
        AppiumDriver driver = getProxiedDriver();
        return driver.getCapabilities().getCapability(PLATFORM_NAME).toString();
    }

    public static String dynamicElement(Locator baseLocator) {
        return (getPlatformCapability().equals(ANDROID)) ?  baseLocator.build().getAndroidLocatedBy() : baseLocator.build().getIosLocatedBy();
    }

    public static By theElementBy(Locator baseLocator) {
        return (getPlatformCapability().equals(ANDROID)) ?  baseLocator.build().getAndroid() : baseLocator.build().getIos();
    }

    private ElementFinder() {
        throw new IllegalStateException(CLASE_UTILIDAD);
    }
}