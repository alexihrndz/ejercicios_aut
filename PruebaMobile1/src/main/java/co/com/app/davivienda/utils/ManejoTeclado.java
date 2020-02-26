package co.com.app.davivienda.utils;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class ManejoTeclado  {

	@SuppressWarnings("rawtypes")
	public static void ocultarTeclado() {
				
		WebDriver driver = getProxiedDriver();
		((AppiumDriver)driver).hideKeyboard();
		
	}
}
