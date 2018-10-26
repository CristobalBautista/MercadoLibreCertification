package com.mercadolibre.certification.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.mercadolibre.certification.exceptions.NoConnection;
import com.mercadolibre.certification.ui.MercadoLibreCountryPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;;

public class OpenTheBrowser implements Task {
	
	private PageObject page;
	
	public OpenTheBrowser (PageObject page) {
		this.page = page;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		actor.should(seeThat(the(MercadoLibreCountryPage.MERCADOLIBRE_LOGO),isVisible()).
				orComplainWith(NoConnection.class, NoConnection.PAGE_NOT_LOADED_MESSAGE));
	}
	
	public static OpenTheBrowser on(PageObject page) {
		return instrumented(OpenTheBrowser.class, page);
	}

}
