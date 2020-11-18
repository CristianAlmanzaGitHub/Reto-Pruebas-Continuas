package com.toysarray.test.PageObjects;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import net.serenitybdd.core.pages.PageObject;

public class ProcesoCompra extends PageObject{
	
	By inBoxCorreo = By.xpath("//input[@id='checkout_email_or_phone']");
	By inBoxNombre = By.xpath("//input[@id='checkout_shipping_address_first_name']");
	By inBoxApellido = By.xpath("//input[@id='checkout_shipping_address_last_name']");
	By inBoxDireccion = By.xpath("//input[@id='checkout_shipping_address_address1']");
	By inBoxCasa = By.xpath("//input[@id='checkout_shipping_address_address2']");
	By inBoxCiudad = By.xpath("//input[@id='checkout_shipping_address_city']");
	By inBoxPais = By.xpath("//select[@id='checkout_shipping_address_country']");
	By inBoxDeparta = By.xpath("//select[@id='checkout_shipping_address_province']");
	By inBoxPostal = By.xpath("//input[@id='checkout_shipping_address_zip']");
	By btnContinue = By.xpath("//button[@id='continue_button']");
	By radioMensajeria = By.xpath("//input[@id='checkout_shipping_rate_id_dhl_express-p-59_72']");
	By btnPayment = By.xpath("//button[@id='continue_button']");
	By txtConfirmacion = By.xpath("//h2[@id='main-header']");
	
	public String validarPayment() {
		String text = getDriver().findElement(txtConfirmacion).getText();
		return text;
	}
		
	public void ingresarDatosUserUno(String correo, String nombre, String apellido, String direccion) {
		String elemento = null;
		WebDriverWait esperaElemento = new WebDriverWait(getDriver() , 10);
		try {
			esperaElemento.until(ExpectedConditions.visibilityOfElementLocated(inBoxCorreo));
			elemento = "inbox Correo";
			getDriver().findElement(inBoxCorreo).sendKeys(correo);
			elemento = "inbox Nombre";
			getDriver().findElement(inBoxNombre).sendKeys(nombre);
			elemento = "inbox Apellido";
			getDriver().findElement(inBoxApellido).click();
			getDriver().findElement(inBoxApellido).sendKeys(apellido);
			elemento = "inbox Dirección";
			getDriver().findElement(inBoxDireccion).sendKeys(direccion);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Elemento '" + elemento + "' no encontrado. Por favor, valide el localizador.");
			throw new PendingException();
		}
	}
	
	public void ingresarDatosUserDos(String casa, String ciudad, String pais, String departa, String postal) {
		String elemento = null;
		try {
			elemento = "inbox Casa";
			getDriver().findElement(inBoxCasa).sendKeys(casa);
			elemento = "inbox Ciudad";
			getDriver().findElement(inBoxCiudad).sendKeys(ciudad);
			elemento = "Lista Paises";
			Select listaPaises = new Select(getDriver().findElement(inBoxPais));
			listaPaises.selectByValue(pais);
			elemento = "Lista Departamentos";
			Select listaDeparta = new Select(getDriver().findElement(inBoxDeparta));
			listaDeparta.selectByValue(departa);
			elemento = "inbox Código Postal";
			getDriver().findElement(inBoxPostal).sendKeys(postal);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Elemento '" + elemento + "' no encontrado. Por favor, valide el localizador.");
			throw new PendingException();
		}
	}
	
	public void continuarProcesoToShipping() {
		String elemento = null;
		try {
			elemento = "Botón Continuar Shipping";
			getDriver().findElement(btnContinue).click();
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Elemento '" + elemento + "' no encontrado. Por favor, valide el localizador.");
			throw new PendingException();
		}		
	}
	
	public void continuarProcesoToPayment() {
		String elemento = null;
		WebDriverWait esperaElemento = new WebDriverWait(getDriver() , 10);
		try {
			esperaElemento.until(ExpectedConditions.visibilityOfElementLocated(radioMensajeria));
			elemento = "Botón Radio Mensajería";
			getDriver().findElement(radioMensajeria).click();
			elemento = "Botón Continuar Payment";
			getDriver().findElement(btnPayment).click();
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Elemento '" + elemento + "' no encontrado. Por favor, valide el localizador.");
			throw new PendingException();
		}		
	}
}
