package avianca.prjoject.AviancaPrueba;

import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import avianca.page.objects.MainPagePO;
import avianca.page.objects.TarifaPagePO;
import cucumber.api.java.en.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class BuscarVueloSteps {

	private WebDriver driver;
	private MainPagePO mainP;
	private TarifaPagePO tarifaP;

	@cucumber.api.java.Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver();
	}

	@Given("^Se ingresa al navegador servicio de avianca$")
	public void ingresoAvianca() {

		driver.get("https://www.avianca.com/co/es/");
		System.out.println("entro a la URL");
		driver.manage().window().maximize();
	}

	@When("^Se seleccionan los parametros del vuelo$")
	public void ingresarusuario() {
		mainP = new MainPagePO(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		mainP.seleccionarTipoVueloSoloIda();

		mainP.seleccionarOrigen("Cali");
		mainP.seleccionarDestino("Lima");
		mainP.seleccionarFecha();
		mainP.seleccionaPasajeros(2, 1, 1);
		mainP.buscarVuelo();
	}

	@And("^se selecciona el vuelo$")
	public void seleccionaVuelo() {
		tarifaP = new TarifaPagePO(driver);
		tarifaP.seleccionarprimerVuelo();
	}

	@Then("^verificar que se soliciten los campos adicionales$")
	public void verificarVuelo() {
		org.junit.Assert.assertTrue(driver.getTitle().contains("Disponibilidad"));
	}

}
