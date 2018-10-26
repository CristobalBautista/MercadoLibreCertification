package com.mercadolibre.certification.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://mercadolibre.com/")
public class MercadoLibreCountryPage extends PageObject {
	
	public static final Target COUNTRY_SELECTION = Target.the("Country selection").locatedBy("//a[contains(text(),\"{0}\")]");
	public static final Target MERCADOLIBRE_LOGO = Target.the("Mercado libre logo").locatedBy("/html/body/header/h1");
	
}
