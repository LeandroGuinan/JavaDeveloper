package it.com.gm.web;

import it.com.gm.servicio.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//para implementar el patron de diseño sprin MVC, pero la configuracion es muy similar  
@Controller
//para enviar informacion al log, se agrega la libreria:
@Slf4j
public class ControladorInicio {
    
    //con esta anotacion, se guardan inyecta directamente la capa establecida:
    @Autowired
    private PersonaService personaService;
    
    //mapeado del metodo get:
    //al estar vacio el inicio(/) se despliegara este mensaje al inicio de la aplicacion
    @GetMapping("/")
    //con el objeto model podemos enviar datos desde nuestro controlardor al navegador
    public String inicio(Model mode){
        var persona = personaService.listarPersona();
        mode.addAttribute("psp", persona);
        //en este caso nos regresa a una pagina de index.html(formato por default)
        return "index";
    }
}
