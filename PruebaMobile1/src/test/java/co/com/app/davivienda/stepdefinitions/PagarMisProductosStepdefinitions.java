package co.com.app.davivienda.stepdefinitions;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static co.com.app.davivienda.tasks.VolverMenu.voler;
import static co.com.app.davivienda.tasks.PagarTdc.prepararPago;
import static co.com.app.davivienda.tasks.ConsultarSaldoInicialCuenta.leeSaldo;
import static co.com.app.davivienda.tasks.OpenDavApp.ingresarAplicacion;
import static co.com.app.davivienda.tasks.Confirmacion.pagar;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import co.com.app.davivienda.questions.SaldoFinal;

import co.com.app.davivienda.tasks.ConsultarSaldoFinalCuenta;


public class PagarMisProductosStepdefinitions {

	String alexi = "Alexi";


	@Given("^el cliente selecciona del menu la opcion Pagar mis Productos$")
	public void elClienteSeleccionaDelMenuLaOpcionPagarMisProductos() {
		OnStage.setTheStage(new OnlineCast());
		    theActorCalled(alexi).wasAbleTo(ingresarAplicacion(), leeSaldo()); 
		    
	}

	@When("^ingresa a la pantalla de preparacion, selecciona el producto origen, producto destino$")
	public void ingresaALaPantallaDePreparacionSeleccionaElProductoOrigenProductoDestino() {
		theActorInTheSpotlight().attemptsTo(prepararPago());
		
	}

	@When("^ingresa en el campo monto, se realiza el pago con exito$")
	public void ingresaEnElCampoMontoSeRealizaElPagoConXito() {
		theActorInTheSpotlight().attemptsTo(pagar());
		
	}

	@Then("^verifico que el pago sea exitoso$")
	public void verificoQueElPagoSeaExitoso() {
		theActorInTheSpotlight().attemptsTo(
				voler(),
				ConsultarSaldoFinalCuenta.leeSaldo());
		theActorInTheSpotlight().should(seeThat(SaldoFinal.saldoFinal()));
		
	}
}
