package com.mercadolibre.certification.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import com.mercadolibre.certification.exceptions.SelectionOutOfBound;
import com.mercadolibre.certification.ui.MercadoLibreProductListPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ChooseThe  implements Task {

	private String number;
	private WebDriver hisBrowser;
	
	public ChooseThe (String number, WebDriver hisBrowser) {
		this.number = number;
		this.hisBrowser = hisBrowser;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.should(seeThat(the(MercadoLibreProductListPage.LIST_ITEM_SELECT.of(number)),isVisible()).
				orComplainWith(SelectionOutOfBound.class, SelectionOutOfBound.SELECTION_OUT_OF_BOUND_MESSAGE));
		
		actor.attemptsTo(
				Click.on(MercadoLibreProductListPage.LIST_ITEM_SELECT.of(number)));
		ArrayList<String> tabs = new ArrayList<String>(hisBrowser.getWindowHandles());
		hisBrowser.switchTo().window(tabs.get(tabs.size()-1));			
	}
	
	public static ChooseThe product (String number, WebDriver hisBrowser) {
		return instrumented(ChooseThe.class, number, hisBrowser);
	}

}
