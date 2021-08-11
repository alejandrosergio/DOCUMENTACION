package com.curso.spring.empleos.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer{

	// OBTENEMOS LA RUTA DE LA IMG DESDE APLLICATION:PROPERTIES
	@Value("${ruta.imagenes}")
	private String rutaImagenes;
	
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		registry.addResourceHandler("/logos/**").addResourceLocations("file:" + rutaImagenes); 
		
	}
	
}
