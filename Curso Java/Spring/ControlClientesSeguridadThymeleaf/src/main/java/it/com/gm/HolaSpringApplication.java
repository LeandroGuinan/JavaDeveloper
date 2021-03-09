package it.com.gm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaSpringApplication.class, args);
	}
        //Controlador tipo REST: nos permite enviar informacion al navegador
        //utilizaremos el metodo get
        
        //para que spring reconozca las clases java, debe estar dentro del paquete con la anotacion:SpringBootApplication
}
