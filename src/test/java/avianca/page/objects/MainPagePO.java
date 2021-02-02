package avianca.page.objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPagePO {

	protected WebDriver driverW;
	private WebElement element;

	public MainPagePO(WebDriver w) {
		this.driverW = w;
	}

	public void seleccionarTipoVueloSoloIda() {
		element = driverW.findElement(By.cssSelector("li[data-tipo-tab='tab-ow']"));
		driverW.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		element.click();
	}

	public void seleccionarOrigen(String origen) {
		element = driverW.findElement(By.cssSelector("input[id^='pbOrigen_2']"));
		element.sendKeys(origen);
		element.click();
	}

	public void seleccionarDestino(String destino) {
		element = driverW.findElement(By.cssSelector("input[id^='pbDestino_2']"));
		element.sendKeys(destino);
		element.sendKeys(Keys.ENTER);
		//driverW.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	//	element.click();
	}

	public void seleccionarFecha() {
		element = driverW.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[3]/div[4]/div[2]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[1]/label/div/input[1]"));
	   //element = driverW.findElement(By.cssSelector("input[id^='pbFechaIda_2']"));
	
		// element = driverW.findElement(By.name("pbFechaIdaISO"));
		
		driverW.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		element.sendKeys("Jue, 28 ene.");
	}

	public void seleccionaPasajeros(int numAdults, int numNinos, int numBebes) {
		element = driverW.findElement(By.cssSelector("input[id^='pbPasajeros_2']"));
		element.click();

		for (int i = 1; i < numAdults; i++) {
			driverW.findElement(By.xpath(
					"/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[3]/div[4]/div[2]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[1]/div[2]/div[2]/div[2]/div[3]/i"))
					.click();
		}
		driverW.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		for (int i = 0; i < numNinos; i++) {
			driverW.findElement(By.xpath(
					"/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[3]/div[4]/div[2]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[1]/div[2]/div[3]/div[2]/div[3]/i"))
					.click();
		}
		driverW.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		for (int i = 0; i < numBebes; i++) {
			driverW.findElement(By.xpath(
					"/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div/section/div[3]/div[4]/div[2]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[1]/div[2]/div[4]/div[2]/div[3]/i"))
					.click();
		}
		JavascriptExecutor js = (JavascriptExecutor) driverW;
		js.executeScript("window.scrollBy(0,50)");
		driverW.findElement(By.cssSelector("button[type='button']")).click();
		System.out.println("CLIC 1 CONT");
	}

	public void buscarVuelo() {
		element = driverW.findElement(By.cssSelector("button[title='Buscar vuelos']"));
		driverW.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		element.submit();
		driverW.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("CLIC 2DO CONT");
	}

}
