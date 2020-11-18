package com.toysarray.test.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import cucumber.api.PendingException;

public class ControlExcel {
	
	public void ingresarDatos(String[] datos) {
		String archivoExcel = "Datos articulo.xlsx";
		
		try {
			FileInputStream file = new FileInputStream(new File(archivoExcel));
			XSSFWorkbook libro = new XSSFWorkbook(file);
			XSSFSheet hoja = libro.getSheet("Hoja1");
			
			Row row;
			Cell cell;
			
			row = hoja.createRow(1);
			cell = row.createCell(0);
			cell.setCellValue(datos[0]);
			cell = row.createCell(1);
			cell.setCellValue(datos[1]);
			cell = row.createCell(2);
			cell.setCellValue(datos[2]);
			
			FileOutputStream fos = null;
			File file2;

			file2 = new File(archivoExcel);
			fos = new FileOutputStream(file2);

			libro.write(fos);
			libro.close();
			fos.close();
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "¡Alerta! Archivo Excel no encontrado");
			throw new PendingException();
		}
	}
}
