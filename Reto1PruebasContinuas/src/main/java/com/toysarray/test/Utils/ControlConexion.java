package com.toysarray.test.Utils;

import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.swing.JOptionPane;

import cucumber.api.PendingException;

public class ControlConexion {

	public void validarConexion() {
		try {
			URL url = new URL("https://www.despegar.com.co/");
			HttpsURLConnection huc = (HttpsURLConnection) url.openConnection();
			huc.connect();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Por favor, valide su conexión a internet y vuelva a ejecutar");
			throw new PendingException();
		}
	}
}
