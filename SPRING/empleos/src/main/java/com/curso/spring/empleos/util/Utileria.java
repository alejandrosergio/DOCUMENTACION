package com.curso.spring.empleos.util;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class Utileria {
	
	public static String guardarArchivo( MultipartFile multiPart, String ruta ) {
		
			// Obtenemos el nombre original del archivo.
			String nombreOriginal = multiPart.getOriginalFilename();
			
			// Remplasar espcacios por guiones -
			nombreOriginal = nombreOriginal.replace(" ", "-");
			
			// Generamos una cadena ramdom para evitar duplicados
			String nombreFinal = randomAlphaNumeric(8) + nombreOriginal;
		
		try {
		
			// Formamos el nombre del archivo para guardarlo en el disco duro.
			File imageFile = new File(ruta + nombreFinal); 
			
			// Mostramos el nombre del archivo final por consola
			System.out.println("Archivo: " + imageFile.getAbsolutePath()); 
			
			// Guardamos fisicamente el archivo en HD. multiPart.transferTo(imageFile);
			multiPart.transferTo(imageFile);
			
			// Retornamos el nombre original
			return nombreFinal;
		
		} catch (IOException e) { 
			
			System.out.println("Error " + e.getMessage()); return null;
			
		} 
	}
	
	
	/*
	 * 
	 * Método para generar una cadena aleatoria de longitud N
	 * @param COUNT
	 * @return
	 * 
	 */
	
	public static String randomAlphaNumeric( int count ) {
		
		String CARACTERES =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
		StringBuilder builder = new StringBuilder();
		
		while (count-- != 0) {
			
			int character = (int) (Math.random() * CARACTERES.length());
			builder.append(CARACTERES.charAt(character));
			
		}
		
		return builder.toString();
	}
	
	
}