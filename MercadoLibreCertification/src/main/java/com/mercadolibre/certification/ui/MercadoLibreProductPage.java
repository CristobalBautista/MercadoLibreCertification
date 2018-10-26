package com.mercadolibre.certification.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MercadoLibreProductPage {

	public static final Target QUANTITY_BUTTON = Target.the("Quantity button").located(By.id("dropdown-quantity"));
	public static final Target QUANTITY = Target.the("Quantity").locatedBy("//*[@id=\"dropdown-quantity\"]/div/ul/li[{0}]/button");
	public static final Target PURCHASE_BUTTON = Target.the("Purchase button").located(By.id("BidButtonTop"));
	public static final Target QUANTITY_INPUT = Target.the("Quantity input").locatedBy("//*[@id=\"dropdown-quantity\"]/div/ul/li[7]/div/div/label/div[1]/input");																				
}
