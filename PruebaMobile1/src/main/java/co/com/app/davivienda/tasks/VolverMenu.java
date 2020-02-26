package co.com.app.davivienda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.app.davivienda.ui.pages.ConsultaConsolidada;
public class VolverMenu implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(ConsultaConsolidada.BTN_FLECHA_IZQ), Click.on(ConsultaConsolidada.BTN_FLECHA_IZQ));
	}
	public static VolverMenu voler() {
		return instrumented(VolverMenu.class);
	}
}
