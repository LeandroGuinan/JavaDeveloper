package it.com.gm;

import it.com.gm.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//para implementar el patron de diseño sprin MVC, pero la configuracion es muy similar  
@Controller
//para enviar informacion al log, se agrega la libreria:
@Slf4j
public class ControladorInicio {
    
    //accedemos a la propiedad del archivo properties, de la manera:
    @Value("${index.saludo}")
    //de nuevo, no es expresion language, pero trabaja de manera similar
    private String saludo;
    
    //mapeado del metodo get:
    //al estar vacio el inicio(/) se despliegara este mensaje al inicio de la aplicacion
    @GetMapping("/")
    //con el objeto model podemos enviar datos desde nuestro controlardor al navegador
    public String inicio(Model mode){
        var msj = "Mensaje Con Thymeleaf";
        
        //instanciamos un objeto tipo persona:
        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("JPerez@Mail.com");
        persona.setTelefono("55443322");
        
        var persona2 = new Persona();
        persona2.setNombre("Karla");
        persona2.setApellido("Gomez");
        persona2.setEmail("KGomez@Mail.com");
        persona2.setTelefono("11223344");
        
//        List<Persona> personas = new ArrayList();
//        personas.add(persona);
//        personas.add(persona2);

        var personas = Arrays.asList(persona,persona2);
        //var personas = new ArrayList();
        
        //mode.addAttribute("psp", persona);
        //muy similar al funcionamiento de servlets, con el siguiente metodo agregamos un atributo al alcance de la vista
        mode.addAttribute("msj", msj);
        mode.addAttribute("sld", saludo);
        log.info("Ejecutando el controlador SPRING MVC");
        mode.addAttribute("psp",personas);
        //en este caso nos regresa a una pagina de index.html(formato por default)
        return "index";
    }
}
