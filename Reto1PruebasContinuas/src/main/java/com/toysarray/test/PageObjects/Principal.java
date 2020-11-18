package com.toysarray.test.PageObjects;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.toysarray.com/")

public class Principal extends PageObject {
	
	By btnBuscar1 = By.xpath("//a[@id='search-toggle']");
	By inBoxBarraBusqueda = By.xpath("(//input[@name='q'])[2]");
	By btnBuscar2 = By.xpath("//div[@id='search']/div/div/form/span");
	
	public void buscarArticulo(String articulo) {
		String elemento = null;
		WebDriverWait esperaElemento = new WebDriverWait(getDriver() , 10);
		try {
			elemento = "Boton Buscar 1";
			getDriver().findElement(btnBuscar1).click();
			esperaElemento.until(ExpectedConditions.visibilityOfElementLocated(inBoxBarraBusqueda));
			elemento = "Barra de Busqueda";
			getDriver().findElement(inBoxBarraBusqueda).sendKeys(articulo);
			elemento = "Boton Buscar 2";
			getDriver().findElement(btnBuscar2).click();
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Elemento '" + elemento + "' no encontrado. Por favor, valide el localizador.");
			throw new PendingException();
		}
		
	}
	
}
