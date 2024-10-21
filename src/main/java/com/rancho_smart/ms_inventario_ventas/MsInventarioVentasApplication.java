package com.rancho_smart.ms_inventario_ventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsInventarioVentasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsInventarioVentasApplication.class, args);
	}

}
