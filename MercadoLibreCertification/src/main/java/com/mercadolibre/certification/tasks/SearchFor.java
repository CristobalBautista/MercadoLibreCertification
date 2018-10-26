package com.mercadolibre.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import com.mercadolibre.certification.ui.MercadoLibreHomePage;

public class SearchFor implements Task {

	private String product;
	
	public SearchFor (String product) {
		this.product = product;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(product).into(MercadoLibreHomePage.SEARCH_AREA).thenHit(Keys.ENTER));
	}
	
	public static SearchFor the (String product) {
		return instrumented(SearchFor.class, product);
	}

}
