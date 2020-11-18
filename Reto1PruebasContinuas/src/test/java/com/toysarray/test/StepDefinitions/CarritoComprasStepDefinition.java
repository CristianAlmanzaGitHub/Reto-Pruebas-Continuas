package com.toysarray.test.StepDefinitions;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.Matchers;

import com.toysarray.test.Models.DatosUser;
import com.toysarray.test.Step.CarritoComprasStep;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CarritoComprasStepDefinition {
	
	@Steps
	CarritoComprasStep carritoCS;
	
	@Dado("^que estoy en la pagina de inicio de Toy Sarray$")
	public void queEstoyEnLaPaginaDeInicioDeToySarray() {
	    carritoCS.iniciarAplicacion();
	}

	@Cuando("^busco un articulo en especifico \"([^\"]*)\"$")
	public void buscoUnArticuloEnEspecifico(String articulo) {
		carritoCS.hacerBusqueda(articulo);
	}

	@Entonces("^podre visualizar los diferentes articulos relacionados$")
	public void podreVisualizarLosDiferentesArticulosRelacionados() {
		assertThat(carritoCS.validarBusquedaExitosa(), Matchers.is("Search"));
	}

	@Cuando("^selecciono el articulo deseado$")
	public void seleccionoElArticuloDeseado() {
	    carritoCS.SeleccionarArticulo();
	}

	@Entonces("^podre visualizar las caracteristicas del articulo seleccionado$")
	public void podreVisualizarLasCaracteristicasDelArticuloSeleccionado() {
		assertThat(carritoCS.validarArticulo(), Matchers.is("RC Cars Radio Control"));
	}

	@Cuando("^agrego el articulo al carrito$")
	public void agregoElArticuloAlCarrito() {
	    carritoCS.seleccionCompra();
	}

	@Cuando("^luego valido el carrito de compras$")
	public void luegoValidoElCarritoDeCompras() {
	    carritoCS.seleccionarCarritoCompras();
	}

	@Entonces("^podre visualizar el articulo a comprar y el precio total de \"([^\"]*)\"$")
	public void podreVisualizarElArticuloAComprarYElPrecioTotalDe(String precio) {
		assertThat(carritoCS.validarPrecioTotal(), Matchers.is(precio));
	}
	
	@Cuando("^continuo el proceso de compra, ingreso mis datos personales$")
	public void continuoElProcesoDeCompraIngresoMisDatosPersonales(List<DatosUser> datosUsuario) {
	    carritoCS.continuarCompra();
	    carritoCS.ingresarDatos(datosUsuario.get(0));
	}


	@Cuando("^selecciono modo de envio$")
	public void seleccionoModoDeEnvio() {
	    carritoCS.modoEnvio();
	}

	@Entonces("^podre visualizar el formulario de Forma de Pago$")
	public void podreVisualizarElFormularioDeFormaDePago() {
		assertThat(carritoCS.validarPayment(), Matchers.is("Payment"));
	}
}
