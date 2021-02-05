package carnival.prjoject.ZemogaPrueba;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class SearchCruiseSteps {
	private WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait2;

	/**
	 * @name before
	 * @description init driver and JavaScript Executor
	 */
	@cucumber.api.java.Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
	}

	/**
	 * @name goToMainPage
	 * @description Go to carnival page to start test , maximize and refresh the
	 *              page
	 */
	@Given("^I am on carnival main page$")
	public void goToMainPage() {
		driver.get("https://www.carnival.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();

	}

	/**
	 * @name chooseSearhCriteria
	 * @throws InterruptedException
	 * @description Method that search cruises under a criteria
	 */
	@When("^Choose a type of cruises to search$")
	public void chooseSearchCriteria() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.id("cdc-destinations")).click();
		wait2 = new WebDriverWait(driver, 15);

		WebElement sailTo = wait2
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[aria-label='The Bahamas ']")));
		Thread.sleep(1000);
		assertNotNull("Bahamas option does not exist", sailTo);
		sailTo.click();

		driver.findElement(By.id("cdc-durations")).click();

		WebElement duration = wait2
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[aria-label='6 - 9 Days ']")));
		assertNotNull("option 6-9 days does not exist", duration);
		duration.click();

		driver.findElement(By.cssSelector("a[data-tealium='cdc-search-cruises-cta']")).click();
	}

	/**
	 * @name checkResults
	 * @description Check if a grid exist on page, if exist an itinerary grid
	 */
	@Then("^A set of results are visible$")
	public void checkResults() {

		boolean isGridPresent = driver
				.findElements(By.cssSelector("ccl-view-result-grid[itineraries='model.itineraries']")).size() > 0;
		if (isGridPresent) {
			assertTrue(true);
			System.out.println("There is a list of itineraries on a result grid");
		} else {
			assertTrue(false);
		}
	}

	/**
	 * @name movePoint
	 * @throws InterruptedException
	 * @description move a slider point to right side
	 */
	private void movePoint(WebElement slider, int value) throws InterruptedException {

		int minValue = Integer.parseInt(
				driver.findElement(By.cssSelector("span[ng-style='minPointerStyle']")).getAttribute("aria-valuenow"));

		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, value, 0).build().perform();
		Thread.sleep(2000);
	}

	/**
	 * @name checkFilter
	 * @throws InterruptedException
	 * @description Check if the filter works, after moving the filter bar by price,
	 *              comparing the value of the first itinerary and the value of the
	 *              itinerary after filtering
	 */
	@And("^its possible filter by price$")
	public void checkFilter() throws InterruptedException {

		WebElement filterPrice = wait2
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[title='Pricing']")));

		System.out.println("There is a slidebar");

		int valueBefore = Integer.parseInt(driver.findElement(By.xpath(
				"//*[@id='ccl-refresh-homepage']/div/div/div/div/div/ccl-cruise-search/div[3]/ccl-view-result-container/div/ccl-view-result-grid/article[1]/ccl-view-result-grid-item/div/div[1]/ccl-view-result-grid-footer/div/div[1]/div[2]/div/p[2]/span[2]/span[2]"))
				.getText());
		System.out.println(valueBefore);
		filterPrice.click();
		WebElement sliderMinPoint = driver.findElement(By.cssSelector("span[ng-style='minPointerStyle']"));
		movePoint(sliderMinPoint, 400);
		Thread.sleep(5000);

		int valueAfter = Integer.parseInt(driver.findElement(By.xpath(
				"//*[@id='ccl-refresh-homepage']/div/div/div/div/div/ccl-cruise-search/div[3]/ccl-view-result-container/div/ccl-view-result-grid/article[1]/ccl-view-result-grid-item/div/div[1]/ccl-view-result-grid-footer/div/div[1]/div[2]/div/p[2]/span[2]/span[2]"))
				.getText());
		System.out.println(valueAfter);
		assertTrue("Filter not working", valueAfter > valueBefore);

	}

	/**
	 * @name checkOrder
	 * @throws InterruptedException
	 * @description Verify if an order by xValue exist on page
	 */
	@And("^its possible order by price$")
	public void checkOrder() {

		java.util.List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "Order By" + "')]"));
		assertTrue("Order option not found!", list.size() > 0);
		driver.findElement(By.cssSelector("a[title='Pricing']")).click();

	}

	/**
	 * @name chooseACruise
	 * @throws InterruptedException
	 * @description Method that choose one cruise
	 */
	@And("^Choose an especific cruise option$")
	public void chooseACruise() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,200)");

		driver.findElement(By.cssSelector("a[aria-label='Learn more about this sail The Bahamas']")).click();
		Thread.sleep(1);

	}

	/**
	 * @name pageloaded
	 * @throws InterruptedException
	 * @description check if page is loaded
	 */
	@Then("^itinerary page is opened$")
	public void pageloaded() {
		String currentURL = driver.getCurrentUrl();
		assertTrue("Itinerary page did not charge", currentURL.startsWith("https://www.carnival.com/itinerary"));
	}

	/**
	 * @name readDay
	 * @throws InterruptedException
	 * @description check if its possible see each day of cruise
	 */
	@And("^its possible read each day on page$")
	public void readDay() {

		assertNotNull("Its not possible each day", driver.findElement(By.cssSelector("div[class='daily-tiles']")));

		java.util.List<WebElement> days = driver.findElements(By.cssSelector("div[class='itinerary-day-tile']"));
		assertTrue("List of days doesnt exist", days.size() > 0);
		assertNotNull("Its not possible see day 0", driver.findElement(By.cssSelector("div[itinerary-day='0']")));
		assertNotNull("Its not possible see another day", driver.findElement(By.cssSelector("div[itinerary-day='1']")));

	}

	/**
	 * @name buttonBookNow
	 * @throws InterruptedException
	 * @description check if book now button is present on page
	 */
	@And("^button BOOK NOW is present on page$")
	public void buttonBookNow() {
		if (driver.findElement(
				By.xpath("//*[@id=\"sm-booking-btn\"]/booking-button/div/span/span/span[4]/span")) != null) {
			assertTrue(true);
			System.out.println("Esta boton BOOK NOW");
		} else {
			assertTrue("Buttton BOOK NOW doesn't exist", false);
		}
	}

	/**
	 * @name endTest
	 * @throws InterruptedException
	 * @description close all active instances driver
	 */
	@After
	public void endTest() {
		driver.quit();
		System.out.println("Test end");
	}

}
