package co.com.app.davivienda.ui.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Bienvenida extends PageObject{

	
	public final static Target BTN_PERMIITIR = Target.the("Boton permitir de android").located(By.id("com.android.packageinstaller:id/permission_allow_button"));
	public final static Target BTN_CONTINUAR = Target.the("Bonton continuar en Bienvenida").located(By.className("android.widget.ImageButton"));
	
	
	
}
