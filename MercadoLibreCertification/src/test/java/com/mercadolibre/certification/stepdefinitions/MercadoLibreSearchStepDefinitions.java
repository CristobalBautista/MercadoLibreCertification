package com.mercadolibre.certification.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.openqa.selenium.WebDriver;

import com.mercadolibre.certification.questions.AnAuthentication;
import com.mercadolibre.certification.tasks.ChooseThe;
import com.mercadolibre.certification.tasks.GoTo;
import com.mercadolibre.certification.tasks.OpenTheBrowser;
import com.mercadolibre.certification.tasks.SearchFor;
import com.mercadolibre.certification.tasks.Select;
import com.mercadolibre.certification.ui.MercadoLibreCountryPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class MercadoLibreSearchStepDefinitions {
	
	@Managed (driver = "chrome")
	private WebDriver hisBrowser;
	
	private Actor diego = Actor.named("Diego");
	
	private MercadoLibreCountryPage mercadoLibreCountryPage;
	
	@Before
	public void setUp() {
		diego.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^that Diego wants some products from Mercado Libre in \"([^\"]*)\"$")
	public void thatDiegoWantsSomeProductsFromMercadoLibreIn(String page) {
		diego.wasAbleTo(
				OpenTheBrowser.on(mercadoLibreCountryPage),
				GoTo.theCountry(page));
	}

	@When("^he searches for the \"([^\"]*)\"$")
	public void heSearchesForThe(String product) {
		diego.attemptsTo(SearchFor.the(product));
	}

	@When("^he chooses the product \"([^\"]*)\" from the displayed list$")
	public void heChoosesTheProductFromTheDisplayedList(String number) {
		diego.attemptsTo(ChooseThe.product(number, hisBrowser));
	}

	@When("^he select the \"([^\"]*)\" to proceeds to the shopping car$")
	public void heSelectTheToProceedsToTheShoppingCar(String quantity) {
		diego.attemptsTo(Select.theDesired(quantity));
	}

	@Then("^he should see a notification asking to enter into his account$")
	public void heShouldSeeANotificationAskingToEnterIntoHisAccount() {
		diego.should(seeThat(AnAuthentication.messageIsVisible()));
	}
}