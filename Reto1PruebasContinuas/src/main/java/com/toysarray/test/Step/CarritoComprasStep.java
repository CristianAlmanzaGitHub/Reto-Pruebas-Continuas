package com.toysarray.test.Step;

import com.toysarray.test.Models.DatosUser;
import com.toysarray.test.PageObjects.Articulo;
import com.toysarray.test.PageObjects.CarritoCompras;
import com.toysarray.test.PageObjects.Principal;
import com.toysarray.test.PageObjects.ProcesoCompra;
import com.toysarray.test.PageObjects.ResultBusqueda;
import com.toysarray.test.Utils.ControlConexion;
import com.toysarray.test.Utils.ControlExcel;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class CarritoComprasStep extends PageObject{
	
	Principal principalPO = new Principal();
	ResultBusqueda resultBusquedaPO = new ResultBusqueda();
	Articulo articuloPO = new Articulo();
	CarritoCompras carritoComprasPO = new CarritoCompras();
	ProcesoCompra procesoCompraPO = new ProcesoCompra();
	
	ControlConexion controlC = new ControlConexion();
	ControlExcel controlEx = new ControlExcel();
	
	@Step
	public void iniciarAplicacion() {
		controlC.validarConexion();
		principalPO.open();
	}
	
	@Step
	public void hacerBusqueda(String articulo) {
		controlC.validarConexion();
		principalPO.buscarArticulo(articulo);
	}
	
	@Step
	public String validarBusquedaExitosa() {
		return resultBusquedaPO.validarBusquedaExitosa();
	}
	
	@Step
	public void SeleccionarArticulo() {
		controlC.validarConexion();
		resultBusquedaPO.seleccionanArticulo();
	}
	
	@Step
	public String validarArticulo() {
		return articuloPO.validarArticulo();
	}
	
	@Step
	public void seleccionCompra() {
		controlEx.ingresarDatos(articuloPO.capturarDatosArticulo());
		articuloPO.seleccionarCompra();
	}
	
	@Step
	public void seleccionarCarritoCompras() {
		controlC.validarConexion();
		articuloPO.clickCarritoCompras();
	}
	
	@Step
	public String validarPrecioTotal() {
		return carritoComprasPO.validarPrecioTotal();
	}
	
	@Step
	public void continuarCompra() {
		controlC.validarConexion();
		carritoComprasPO.seleccionarCheckout();
	}
	
	@Step
	public void ingresarDatos(DatosUser datosUsuarios) {
		procesoCompraPO.ingresarDatosUserUno(datosUsuarios.getCorreo(), datosUsuarios.getNombre(), datosUsuarios.getApellido(), datosUsuarios.getDireccion());
		procesoCompraPO.ingresarDatosUserDos(datosUsuarios.getCasa(), datosUsuarios.getCiudad(), datosUsuarios.getPais(), datosUsuarios.getDepartamento(), datosUsuarios.getPostalCode());
		controlC.validarConexion();
		procesoCompraPO.continuarProcesoToShipping();
	}
	
	@Step
	public void modoEnvio() {
		controlC.validarConexion();
		procesoCompraPO.continuarProcesoToPayment();
	}
	
	@Step
	public String validarPayment() {
		return procesoCompraPO.validarPayment();
	}
}
