package co.com.app.davivienda.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.app.davivienda.utilidades.constantes.Datos.nro_Documento;
import static co.com.app.davivienda.utilidades.constantes.Datos.clave;
import static co.com.app.davivienda.ui.pages.Login.TXT_NRO_DOCUMENTO;
import static co.com.app.davivienda.ui.pages.Login.BTN_INGRESAR;
import static co.com.app.davivienda.ui.pages.Login.TXT_CLAVE;
import static co.com.app.davivienda.ui.pages.Login.BTN_INGRESAR2;
import static co.com.app.davivienda.ui.pages.Login.BTN_REGISTRAR;
import static co.com.app.davivienda.ui.pages.Login.BTN_REGISTRAR_RESULTADO;

public class OpenDavApp implements Task {


	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(TXT_NRO_DOCUMENTO, isVisible()), 
				Enter.theValue(nro_Documento).into(TXT_NRO_DOCUMENTO),
				Click.on(BTN_INGRESAR),
				Enter.theValue(clave).into(TXT_CLAVE),
				Click.on(BTN_INGRESAR2) 
				);
		
			WebElementFacade btonRegistrar; 
			btonRegistrar = BTN_REGISTRAR.resolveFor(actor);
			
			if( btonRegistrar.isPresent()==true) {
				actor.attemptsTo(
						Click.on(BTN_REGISTRAR),
						WaitUntil.the(BTN_REGISTRAR_RESULTADO, isVisible()),
						Click.on(BTN_REGISTRAR_RESULTADO)
						);
			}
	}
	
	public static OpenDavApp ingresarAplicacion() {
		return instrumented(OpenDavApp.class);
	}

}
