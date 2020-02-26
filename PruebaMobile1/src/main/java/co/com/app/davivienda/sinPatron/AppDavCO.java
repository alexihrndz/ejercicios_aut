//package co.com.app.davivienda.sinPatron;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.StaleElementReferenceException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//
//
//
//public class AppDavCO {
//
//	
//public static void main(String[] args) throws MalformedURLException, InterruptedException {
//		
//		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
//		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "MotoG7");
//		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
//		dc.setCapability("appPackage", "com.todo1.dvco.proyecto3");
//		dc.setCapability("appActivity", "com.todo1.davivienda.mobileapp.MainActivity");
//
//		URL url = new URL("http://127.0.0.1:4723/wd/hub");
//		
//		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
//	
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
//		
//		WebElement permitir = driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
//
//		for (int i = 1; i <= 4; i++) {			permitir.click();		}
//		
//		WebElement continuar = driver.findElementByClassName("android.widget.ImageButton");
//		continuar.click();
//		continuar.click();
//
//		WebElement nroDocumento = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='userId']"));
//		WebElement btnIngresar = driver.findElement(By.xpath("//android.view.View[@resource-id='btnLoginInit']"));
//		
//		nroDocumento.sendKeys("13023022");
//		
//		btnIngresar.click();
//
//		WebElement clave = driver.findElementByXPath("//android.widget.EditText[@resource-id='passwordClavevirtual']");
//		WebElement btnClave = driver.findElementByXPath("//android.view.View[@resource-id='btnClavevirtual']");
//		clave.sendKeys("2589");
//		btnClave.click();
//		
//		WebElement lbl_Registrar = driver.findElementByXPath("//android.view.View[@text='SI']");
//		lbl_Registrar.click();
//		
//		WebElement btn_Registro_Continuar = driver.findElementByXPath("//android.view.View[@resource-id='btnVirtualRegisterResult']");
//		btn_Registro_Continuar.click();
//		
//		WebElement lbl_Saldo_Cuentas = driver.findElementByXPath("//android.view.View[contains(@text, 'Saldo')][@index='0']");
//		
//		System.out.println(lbl_Saldo_Cuentas.getText());
//		
//		lbl_Saldo_Cuentas.click();
//		
//		WebElement lbl_Saldo_0391 = driver.findElementByXPath("//android.view.View[contains(@text, '0391')][@index='0']");
//		System.out.println( lbl_Saldo_0391.getText());
//		
//		WebElement flecha_Izquierda = driver.findElementByXPath("//android.view.View[contains(@text, 'fleIzquierda')]");
//		
//		flecha_Izquierda.click();
//		
//		WebElement menu = driver.findElementByXPath("//android.view.View[contains(@text, 'iconmenu')]");
//		
//		menu.click();
//		
//		WebElement opc_Pagos_Recargas = driver.findElementByXPath("//android.view.View[contains(@text, 'Pagos y Recargas')]");
//		
//		opc_Pagos_Recargas.click();
//		
//		WebElement opc_Pagar_Sus_Productos = driver.findElementByXPath("//android.view.View[contains(@text, 'Pagar sus productos')]");
//		
//		opc_Pagar_Sus_Productos.click();
//		
//		WebElement campo_Producto_Pagar = driver.findElementByXPath("//android.view.View[@text='Producto a pagar']");
//		
//		campo_Producto_Pagar.click();
//		
//		
//		WebElement sel_Producto_Pagar = driver.findElementByXPath("//android.view.View[contains(@text ,'****3508')][@index='0']");
//		
//		sel_Producto_Pagar.click();
//		
//		WebElement monto_Pagar = driver.findElementByXPath("//android.view.View[contains(@text ,'Monto Ingrese el monto del pago')]");
//		
//		monto_Pagar.click();
//		
//		WebElement optBtn_Otro_Monto = driver.findElementByXPath("//android.widget.RadioButton[@resource-id='radioPayAmount']");
//		
//		optBtn_Otro_Monto.click();
//		
//		WebElement txtbx_Monto_Mis_Productos = driver.findElementByXPath("//android.widget.EditText[@resource-id='inputPayOwnProductsAmount']");
//		
//		txtbx_Monto_Mis_Productos.sendKeys("1");
//		
//		driver.hideKeyboard();
//		
//		WebElement btn_Continuar_Pagar_Mis_Productos = driver.findElementByXPath("//android.view.View[@resource-id='btnPayOwnProducts02']");
//		
//		btn_Continuar_Pagar_Mis_Productos.click();
//		
//		WebElement btn_Pagar_Mis_Productos= driver.findElementByXPath("//android.view.View[@resource-id='btnPayOwnProducts01']");
//		
//		btn_Pagar_Mis_Productos.click();
//		Thread.sleep(1000);
//		
//		btn_Pagar_Mis_Productos.click();
//		
//		WebElement lbl_Mensaje_Respuesta = driver.findElementByXPath("//android.view.View[contains(@text, 'Pago')][@index='1']");
//		
//		WebElement lbl_Nro_Aprobacion = driver.findElementByXPath("//android.view.View[contains(@text, 'Número de aprobación')]");
//		
//		System.out.println(lbl_Mensaje_Respuesta.getText() + "\n" +  lbl_Nro_Aprobacion.getText());
//		
//		menu.click();
//		
//		WebElement opc_Consultas = driver.findElementByXPath("//android.view.View[@text='Consultas']");
//		
//		opc_Consultas.click();
//	//	Thread.sleep(20000);
//		
//		Boolean st = true;
//		while (st) {
//			
//		
//			try {
//				lbl_Saldo_Cuentas.click();
//				st = false;
//			} catch(StaleElementReferenceException e) {
//				st = true;
//				
//			}
//			
//		}
//		
//		Thread.sleep(2000);
//		System.out.println(lbl_Saldo_0391.getText());
//				
//		//driver.quit();
//	}
//}
