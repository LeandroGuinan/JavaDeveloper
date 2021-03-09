package it.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//para que spring reconozca esta aplicacion, debe incluir la anotacion:
@RestController
//para enviar informacion al log, se agrega la libreria:
@Slf4j
public class ControladorInicio {
    
    //mapeado del metodo get:
    //al estar vacio el inicio(/) se despliegara este mensaje al inicio de la aplicacion
    @GetMapping("/")
    public String inicio(){
        log.info("Ejecutando el controlador REST");
        log.debug("Mas detalle del controlador");
        return "Hola Mundo Con Spring Boot";
    }
}
