package com.mercadolibre.certification.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "com.mercadolibre.certification",
		snippets = SnippetType.CAMELCASE
)
public class MercadoLibreRunner {
}