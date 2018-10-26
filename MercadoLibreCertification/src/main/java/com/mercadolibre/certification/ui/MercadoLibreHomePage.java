package com.mercadolibre.certification.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MercadoLibreHomePage extends PageObject {
	
	public static final Target SEARCH_AREA = Target.the("").located(By.name("as_word"));
}
