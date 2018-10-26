package com.mercadolibre.certification.questions;

import static net.serenitybdd.screenplay.questions.Visibility.of;

import com.mercadolibre.certification.ui.MercadoLibreAuthenticationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class AnAuthentication implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {		
		return of(MercadoLibreAuthenticationPage.AUTH_TITLE).viewedBy(actor).asBoolean();
	}

	public static AnAuthentication messageIsVisible() {
		return new AnAuthentication();
	}
}
