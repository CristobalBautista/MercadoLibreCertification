package com.mercadolibre.certification.ui;

import net.serenitybdd.screenplay.targets.Target;

public class MercadoLibreProductListPage {

	public static final Target LIST_ITEM_SELECT = Target.the("Product choice").locatedBy("//*[@id=\"searchResults\"]/li[{0}]/div[1]/div[1]/div");
}
