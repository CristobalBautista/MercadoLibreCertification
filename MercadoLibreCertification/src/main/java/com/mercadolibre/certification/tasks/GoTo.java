package com.mercadolibre.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.mercadolibre.certification.ui.MercadoLibreCountryPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class GoTo implements Task{
	
	private String country; // Target con el que se define la pestaña de New Tours a la que se desea ir
	
	public GoTo (String country) { // Constructor de la TAREA para llevar el Target recibido al Target que se maneja internamente en la clase
		this.country = country;
	}

	@Override
	@Step ("")
	public <T extends Actor> void performAs(T actor) {	
		actor.attemptsTo(Click.on(MercadoLibreCountryPage.COUNTRY_SELECTION.of(country)));	
	}
	
	public static GoTo theCountry(String page) {
		return instrumented(GoTo.class, page);
	}

}