package co.com.app.davivienda.ui.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PagarMisProductos extends PageObject {

	public static final Target CAMPO_PRODUCTO_PAGAR = Target.the("Campo producto a pagar").locatedBy("//android.view.View[@text='Producto a pagar']");
//	public static final Target TDC = Target.the("Tarjeta ****2537").locatedBy("//android.view.View[contains(@text ,'****2537')][@index='0']");
	public static final Target TDC = Target.the("Tarjeta ****3796").locatedBy("//android.view.View[contains(@text ,'****3796')][@index='0']");
	public static final Target CAMPO_MONTO = Target.the("Campo Monto a Pagar").locatedBy("//android.view.View[contains(@text ,'Monto Ingrese el monto del pago')]");
	public static final Target OPC_OTRO_MONTO = Target.the("Opcion otro monto").locatedBy("//android.widget.RadioButton[@resource-id='radioPayAmount']");
	public static final Target CAMPO_OTRO_MONTO = Target.the("Campo otro monto").locatedBy("//android.widget.EditText[@resource-id='inputPayOwnProductsAmount']");
	public static final Target BTN_CONTINUAR = Target.the("Boton continuar").locatedBy("//android.view.View[@resource-id='btnPayOwnProducts02']");
	public static final Target BTN_PAGAR = Target.the("Boton pagar").locatedBy("//android.view.View[@resource-id='btnPayOwnProducts01']");
	public static final Target LBL_MENSAJE_RESPUESTA = Target.the("Respuesta del pago").locatedBy("//android.widget.ListView/android.view.View[1]/android.view.View[2]");
	public static final Target LBL_NRO_APROBACION = Target.the("Nro de aprobación").locatedBy("//android.view.View[contains(@text, 'Número de aprobación')]");
	
	
	
	
}
