package pe.com.test.seleniumwd.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pe.com.test.seleniumwd.driver.VisorDriver;

public class IniciarSesionPage {

	private By userField = By.id("user");
	private By passwordField = By.id("password");
	private By loginButton = By.id("login");
	private String urlInicial;
	
	//para poder iniciar se necesita llamar al webdriver lo que dice inicializar 
	//driver puede ser lo q uno desea crear empezar
	private WebDriver webDriver = null;
	
	public IniciarSesionPage(String navegador, String urlInicial, boolean remoto){
		this.webDriver = VisorDriver.inicializarDriver(navegador, remoto);
		this.urlInicial = urlInicial;
	}
	
	public void iniciarSesion(String usuario, String clave) throws Exception{
		//TODO
		
		this.webDriver.get(urlInicial);
		this.webDriver.findElement(userField).clear();
		this.webDriver.findElement(userField).sendKeys(usuario);
		
		this.webDriver.findElement(passwordField).clear();
		this.webDriver.findElement(passwordField).sendKeys(clave);
		
		this.webDriver.findElement(loginButton).click();
	}
	
	public void cerrarPagina(){
		VisorDriver.cerrarPagina(webDriver);
	}
	
	public WebDriver getWebDriver() {
		return webDriver;
	}
	
}
