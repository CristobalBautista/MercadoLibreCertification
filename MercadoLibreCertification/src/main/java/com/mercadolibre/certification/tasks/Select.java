package com.mercadolibre.certification.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import org.openqa.selenium.Keys;

import com.mercadolibre.certification.exceptions.InvalidQuantity;
import com.mercadolibre.certification.ui.MercadoLibreProductPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;;

public class Select implements Task {

	private String quantity;
	
	public Select (String quantity) {
		this.quantity = quantity;
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		String quantity_fix = "";
		int quant = Integer.parseInt(quantity);
		if (quant > 6) {
			quantity_fix = "7";
		} else {
			quantity_fix = quantity;
		}
		
		if (quant > 1) {
			actor.should(seeThat(the(MercadoLibreProductPage.QUANTITY_BUTTON) , isEnabled()).
					orComplainWith(InvalidQuantity.class, InvalidQuantity.INVALID_QUANTITY));
			actor.attemptsTo(Click.on(MercadoLibreProductPage.QUANTITY_BUTTON));
			
			actor.should(seeThat(the(MercadoLibreProductPage.QUANTITY.of(quantity_fix)) , isVisible()).
					orComplainWith(InvalidQuantity.class, InvalidQuantity.INVALID_QUANTITY));
			actor.attemptsTo(Click.on(MercadoLibreProductPage.QUANTITY.of(quantity_fix)));
			
			if (quant > 6) {
				actor.attemptsTo(Enter.theValue(quantity).into(MercadoLibreProductPage.QUANTITY_INPUT).thenHit(Keys.ENTER));
			}	
		}		
			actor.attemptsTo(Click.on(MercadoLibreProductPage.PURCHASE_BUTTON));
	}

	public static Select theDesired(String quantity) {
		return instrumented(Select.class, quantity);
	}
}
