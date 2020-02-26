package co.com.app.davivienda.ui.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ConsultaConsolidada extends PageObject {

	public static final Target LBL_CUENTAS = Target.the("Etiqueta Cuentas").locatedBy("//android.view.View[contains(@text, 'Saldo total')][@index='0']");
	public static final Target BTN_FLECHA_IZQ = Target.the("Boton Felcha Izquierda").locatedBy("//android.view.View[contains(@text, 'fleIzquierda')]");
	public static final Target BTN_MENU = Target.the("Boton menu").locatedBy("//android.view.View[contains(@text, 'iconmenu')]");
	
	
}
