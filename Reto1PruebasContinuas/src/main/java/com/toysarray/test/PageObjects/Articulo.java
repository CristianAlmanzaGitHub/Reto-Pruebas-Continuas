package com.toysarray.test.PageObjects;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import net.serenitybdd.core.pages.PageObject;

public class Articulo extends PageObject{
	
	By txtConfirmacion = By.xpath("//h1[contains(text(),'RC Cars Radio Control')]");
	By listCodigosArticulos = By.xpath("//select[@id='product-select-4945186455690productproduct-template-option-0']");
	By listCantidadArticulos = By.xpath("//input[@id='quantity']");
	By btnAddToCart = By.xpath("//button[@name='add']");
	By btnViewCart = By.xpath("//a[contains(text(),'View Cart')]");
	By txtArticulo = By.xpath("//div[@id='shopify-section-product-template']/div/div/div/div[2]/h1");
	By txtValor = By.xpath("//div[@id='shopify-section-product-template']/div/div/div/div[2]/p/span[2]/span/span");
	By txtDescripcion = By.xpath("//body/div[@id='mm-0']/div[@id='content_wrapper']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/p[1]");
	
	public String validarArticulo() {
		String text = getDriver().findElement(txtConfirmacion).getText();
		return text;
	}
	
	public void seleccionarCompra() {
		String elemento = null;
		try {
			elemento = "Lista Codigo Artículo";
			Select codigoArticulo = new Select(getDriver().findElement(listCodigosArticulos));
			codigoArticulo.selectByValue("2815A");
			elemento = "Lista Cantidad Artículo";
			getDriver().findElement(listCantidadArticulos).clear();
			getDriver().findElement(listCantidadArticulos).sendKeys("2");
			elemento = "Botón Add to Cart";
			getDriver().findElement(btnAddToCart).click();
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Elemento '" + elemento + "' no encontrado. Por favor, valide el localizador.");
			throw new PendingException();
		}
	}
	
	public void clickCarritoCompras() {
		String elemento = null;
		WebDriverWait esperaElemento = new WebDriverWait(getDriver() , 10);
		try {
			esperaElemento.until(ExpectedConditions.visibilityOfElementLocated(btnViewCart));
			elemento = "Botón View Cart";
			getDriver().findElement(btnViewCart).click();
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Elemento '" + elemento + "' no encontrado. Por favor, valide el localizador.");
			throw new PendingException();
		}
	}
	
	public String[] capturarDatosArticulo() {
		String articulo = null;
		String valor = null;
		String descripcion = null;
		
		articulo = getDriver().findElement(txtArticulo).getText();
		valor = getDriver().findElement(txtValor).getText();
		descripcion = getDriver().findElement(txtDescripcion).getText();
		
		String[] datos = {articulo, valor, descripcion};
		return datos;
	}

}
