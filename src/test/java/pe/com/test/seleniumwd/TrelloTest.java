package pe.com.test.seleniumwd;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pe.com.test.seleniumwd.fuenteDatos.Excel;
import pe.com.test.seleniumwd.page.IniciarSesionPage;



public class TrelloTest {

	private String urlInicial = "https://trello.com/login";
	private IniciarSesionPage iniciarSesionPage;
	
	@BeforeTest
	@Parameters({"navegador", "remoto"})
	public void setUp(String navegador, int remoto) throws Exception {
		this.iniciarSesionPage = new IniciarSesionPage(navegador, this.urlInicial, remoto == 1);
	}
	
	
	@DataProvider(name = "datosEntrada")
	public static Object[][] usuariosTrello(ITestContext context) {
		//TODO en ruta excel se cambia si por ejemplo es de base de datos
		
		Object[][] datos = null;
		String rutaExcel = context.getCurrentXmlTest().getParameter("rutaArchivo");
		
		datos = Excel.leerExcel(rutaExcel);
		
		
		return datos;
	}
	
	
	@Test(dataProvider = "datosEntrada")
	public void insertarProducto(String usuario, String clave, String nombre, String categoria, String precio, String valorEsperado) throws Exception {
		try {
			//TODO 
			
			iniciarSesionPage.iniciarSesion(usuario, clave);
			

		}catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@AfterTest
	public void tearDown() throws Exception {
	}
	
}

