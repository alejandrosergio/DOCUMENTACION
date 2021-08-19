package com.microservicio.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class MicroservicioZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioZuulGatewayApplication.class, args);
	}

}
