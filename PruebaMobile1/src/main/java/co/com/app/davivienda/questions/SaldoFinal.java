package co.com.app.davivienda.questions;

import co.com.app.davivienda.utilidades.constantes.Datos;
import co.com.app.davivienda.utils.MostrarSaldo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SaldoFinal implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		double saldoFinal;
		double saldoInicial;
		int montoPagar;
		boolean cero = false;
		saldoInicial= MostrarSaldo.saldoNumero(Datos.saldoInicial);
		saldoFinal = MostrarSaldo.saldoNumero(Datos.saldoFinal);
		montoPagar = Datos.monto_pagar;
		
		double Resta = saldoFinal + montoPagar - saldoInicial;
		System.out.println("Resta: " + Resta);
		
		if (Resta == 0) { 
			cero = true;
			} 				
		return cero;
	}
	
	public static SaldoFinal saldoFinal() {
		return new SaldoFinal();
		
	}

}
