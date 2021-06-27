package com.orangesoft.officium;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdPaisNulo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class OfficiumApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfficiumApplication.class, args);
	}

}
