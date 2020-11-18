package com.toysarray.test.PageObjects;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import cucumber.api.PendingException;
import net.serenitybdd.core.pages.PageObject;

public class CarritoCompras extends PageObject{
	
	By valorTotal = By.xpath("//form[@id='cart_form']/div/div/div[2]/p[5]/span");
	By btnCheckout = By.xpath("//input[@id='checkout']");
	
	public String validarPrecioTotal() {
		String text = getDriver().findElement(valorTotal).getText();
		return text;
	}
	
	public void seleccionarCheckout() {
		String elemento = null;
		try {
			elemento = "Botón Checkout";
			getDriver().findElement(btnCheckout).click();
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Elemento '" + elemento + "' no encontrado. Por favor, valide el localizador.");
			throw new PendingException();
		}

	}
																	

}
