package co.com.app.davivienda.ui.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Menu extends PageObject {

	public static final Target OPC_PAGOS_RECARGAS = Target.the("Opcion de Pagos y Recargas").locatedBy("//android.view.View[contains(@text, 'Pagos y Recargas')]");
	public static final Target OPC_CONSULTAS = Target.the("Opcion de Consulta").locatedBy("//android.view.View[@text= 'Consultas']");
	public static final Target OPC_PAGAR_MIS_PRODUCTOS = Target.the("Opcion Pagar mis productos").locatedBy("//android.view.View[contains(@text, 'Pagar sus productos')]");
	
}
