package co.com.app.davivienda.utils;

import net.serenitybdd.core.pages.WebElementFacade;

public class MostrarSaldo {

	public static double imprime(WebElementFacade mensaje) {
		String cadena = mensaje.getText();
		cadena = cadena.replace("Cta. Ahorros Saldo total ****8878 $", "");
		cadena = cadena.replace(",", "");
		Double numero = Double.parseDouble(cadena);
		return numero;
	}
	
	public static double saldoNumero(String cadena) {
		
		cadena = cadena.replace("Cta. Ahorros Saldo total ****8878 $", "");
		cadena = cadena.replace(",", "");
		Double numero = Double.parseDouble(cadena);
		return numero;
	}
	
}
