package co.com.app.davivienda.ui.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;



public class Login extends PageObject{

	public static final Target TXT_NRO_DOCUMENTO = Target.the("Numero de Documento").locatedBy("//android.widget.EditText[@resource-id='userId']");
	public static final Target BTN_INGRESAR   = Target.the("Boton ingresar").locatedBy("//android.view.View[@resource-id='btnLoginInit']");
	public static final Target TXT_CLAVE = Target.the("Clave").locatedBy("//android.widget.EditText[@resource-id='passwordClavevirtual']");
	public static final Target BTN_INGRESAR2 = Target.the("Boton ingresar").locatedBy("//android.view.View[@resource-id='btnClavevirtual']");
	public static final Target BTN_REGISTRAR = Target.the("Boton registrar dispositivo").locatedBy("//android.view.View[@text='SI']");
	public static final Target BTN_REGISTRAR_RESULTADO = Target.the("Resultado de registro").locatedBy("//android.view.View[@resource-id='btnVirtualRegisterResult']");
	

	
	
}
