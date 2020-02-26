package co.com.app.davivienda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.app.davivienda.ui.pages.ListadoMisCuentas;
import co.com.app.davivienda.utilidades.constantes.Datos;
import net.serenitybdd.core.pages.WebElementFacade;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static co.com.app.davivienda.ui.pages.ConsultaConsolidada.LBL_CUENTAS;
import static co.com.app.davivienda.ui.pages.ListadoMisCuentas.CUENTA_DEBITO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultarSaldoFinalCuenta implements Task {

	WebElementFacade mensaje;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		WebElementFacade cuentasConsolidadas;
		cuentasConsolidadas = LBL_CUENTAS.resolveFor(actor);
		
		boolean st = true;
		int i = 1;
		do {
			st = cuentasConsolidadas.isPresent();
			if(i > 3) st= false;
		}while(!st );
		
		actor.attemptsTo(
				WaitUntil.the(LBL_CUENTAS, isClickable()), 
				Click.on(LBL_CUENTAS),
				WaitUntil.the(CUENTA_DEBITO, isVisible())
				);
			
		mensaje = ListadoMisCuentas.CUENTA_DEBITO.resolveFor(actor);
		
		Datos.saldoFinal = mensaje.getText();
		System.out.println("Saldo final ->>  " + Datos.saldoFinal);
		
	}

	public static ConsultarSaldoFinalCuenta leeSaldo() {
		return instrumented(ConsultarSaldoFinalCuenta.class);
	}

}
