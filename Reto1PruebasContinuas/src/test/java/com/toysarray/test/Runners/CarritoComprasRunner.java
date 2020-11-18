package com.toysarray.test.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\resources\\com\\toysarray\\test\\features\\CarritoCompras.feature",
glue="com.toysarray.test.StepDefinitions", snippets = SnippetType.CAMELCASE)


public class CarritoComprasRunner {

}
