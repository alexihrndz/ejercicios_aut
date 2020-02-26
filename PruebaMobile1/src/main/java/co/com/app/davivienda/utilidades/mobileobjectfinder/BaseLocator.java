package co.com.app.davivienda.utilidades.mobileobjectfinder;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class BaseLocator {
    private String android;
    private String ios;

    public BaseLocator(Locator baseLocatorBuilder) {
        this.android = baseLocatorBuilder.getAndroid();
        this.ios = baseLocatorBuilder.getIos();
    }

    public String getAndroidLocatedBy(){
        return getLocatedBy(android);
    }

    public String getIosLocatedBy(){
        return getLocatedBy(ios);
    }

    public By getAndroid() {
        return getBy(android);
    }

    public By getIos() {
        return getBy(ios);
    }

    private String getLocatedBy(String baseLocator){
        String[] locators = baseLocator.split("\\$");
        return locators[1];
    }

    private By getBy(String baseLocator){
        String[] locators = baseLocator.split("\\$");
        String locator = locators[0];
        String path = locators[1];
        By resp;
        switch (locator){
            case "id":
                resp = MobileBy.id(path);
                break;
            case "xpath":
                resp =MobileBy.xpath(path);
                break;
            case "className":
                resp = By.className(path);
                break;
            default:
                resp = By.id(path);
        }
        return resp;
    }
}