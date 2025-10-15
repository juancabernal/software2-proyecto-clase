package co.edu.uco.ucochallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//Esta es la clase principal que arranca la aplicacion
// La anotacion @SpringBootApplication indica que es una aplicacion Spring Boot
// El metodo main es el punto de entrada de la aplicacion
// SpringApplication.run() arranca la aplicacion
@SpringBootApplication
public class UcoChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(UcoChallengeApplication.class, args);
	}

}
