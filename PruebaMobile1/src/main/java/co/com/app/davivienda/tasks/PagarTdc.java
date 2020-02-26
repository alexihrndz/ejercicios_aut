package co.com.app.davivienda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.app.davivienda.utils.ScrollingLento;
import static co.com.app.davivienda.ui.pages.Menu.OPC_PAGOS_RECARGAS;
import static co.com.app.davivienda.ui.pages.PagarMisProductos.CAMPO_PRODUCTO_PAGAR;
import static co.com.app.davivienda.ui.pages.PagarMisProductos.TDC;
import static co.com.app.davivienda.ui.pages.PagarMisProductos.CAMPO_MONTO;
import static co.com.app.davivienda.ui.pages.PagarMisProductos.OPC_OTRO_MONTO;
import static co.com.app.davivienda.ui.pages.PagarMisProductos.CAMPO_OTRO_MONTO;
import static co.com.app.davivienda.ui.pages.Menu.OPC_PAGAR_MIS_PRODUCTOS;
import static co.com.app.davivienda.utilidades.constantes.Datos.monto_pagar;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static co.com.app.davivienda.utils.ManejoTeclado.ocultarTeclado;
import static co.com.app.davivienda.ui.pages.ConsultaConsolidada.BTN_MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PagarTdc implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(BTN_MENU),
				WaitUntil.the(OPC_PAGOS_RECARGAS, isVisible()),
				Click.on(OPC_PAGOS_RECARGAS),
				WaitUntil.the(OPC_PAGAR_MIS_PRODUCTOS, isVisible()),
				Click.on(OPC_PAGAR_MIS_PRODUCTOS),
				WaitUntil.the(CAMPO_PRODUCTO_PAGAR, isVisible()),
				Click.on(CAMPO_PRODUCTO_PAGAR)
				);

		// falta una validación de que si el producto destino no está en la pantalla debe buscarla en la siguiente página 		
		// similar a lo que se hizo con el registro del dispositivo
		
//		ScrollingLento.scrollDown(500, 1500, 500, 500);
//		ScrollingLento.scrollDown(500, 1500, 500, 500);
//		ScrollingLento.scrollDown(500, 1500, 500, 500);
//		ScrollingLento.scrollDown(500, 1500, 500, 500);
		
		actor.attemptsTo(WaitUntil.the(TDC, isVisible()),
				Click.on(TDC),
				WaitUntil.the(CAMPO_MONTO, isVisible()),
				Click.on(CAMPO_MONTO),
				Click.on(OPC_OTRO_MONTO),
				Enter.theValue(Integer.toString(monto_pagar)).into(CAMPO_OTRO_MONTO)
				);
		
		//Esconde teclado
//		WebDriver driver = getProxiedDriver();
//		((AppiumDriver)driver).hideKeyboard();
		ocultarTeclado();
	}

	public static PagarTdc prepararPago () {
		return instrumented(PagarTdc.class);
	}
}
