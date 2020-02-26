package co.com.app.davivienda.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.app.davivienda.ui.pages.PagarMisProductos.BTN_CONTINUAR;
import static co.com.app.davivienda.ui.pages.PagarMisProductos.BTN_PAGAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

import co.com.app.davivienda.ui.pages.PagarMisProductos;

public class Confirmacion implements Task {

	WebElementFacade mensaje;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(		
				Click.on(BTN_CONTINUAR));
		
		actor.attemptsTo(
				WaitUntil.the(BTN_PAGAR, isClickable()),
				Click.on(BTN_PAGAR), //No está haciendo este click por eso se coloca 2 veces
				Click.on(BTN_PAGAR),
				WaitUntil.the(PagarMisProductos.LBL_MENSAJE_RESPUESTA, isVisible())
				//,				WaitUntil.the(PagarMisProductos.LBL_NRO_APROBACION, isVisible())
				
				);
		
		mensaje = PagarMisProductos.LBL_MENSAJE_RESPUESTA.resolveFor(actor);
		
		System.out.println("Mensaje respuesta: " +  mensaje.getText());
		
//		mensaje = PagarMisProductos.LBL_NRO_APROBACION.resolveFor(actor);
//		
//		System.out.println("Nro de Aprobación: " + mensaje.getText());
	}

	public static Confirmacion pagar() {
		// 
		return instrumented(Confirmacion.class);
	}

	
	
}
