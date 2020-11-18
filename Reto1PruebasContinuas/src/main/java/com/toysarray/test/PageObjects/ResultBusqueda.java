package com.toysarray.test.PageObjects;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;

import cucumber.api.PendingException;
import net.serenitybdd.core.pages.PageObject;

public class ResultBusqueda extends PageObject{
	
	By txtConfirmacion = By.xpath("//h1[contains(text(),'Search')]");
	By txtArticulo = By.xpath("//span[contains(text(),'RC Cars Radio Control')]");
	
	public String validarBusquedaExitosa() {
		String text = getDriver().findElement(txtConfirmacion).getText();
		return text;
	}
	
	public void seleccionanArticulo() {
		String elemento = null;
		try {
			elemento = "Texto artículo";
			getDriver().findElement(txtArticulo).click();
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Elemento '" + elemento + "' no encontrado. Por favor, valide el localizador.");
			throw new PendingException();
		}
	}

}
