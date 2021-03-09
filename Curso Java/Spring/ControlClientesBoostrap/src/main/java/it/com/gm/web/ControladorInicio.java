package it.com.gm.web;

import it.com.gm.domain.Persona;
import it.com.gm.domain.Usuario;
import it.com.gm.servicio.CrearUsuarioService;
import it.com.gm.servicio.PersonaService;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//para implementar el patron de diseño sprin MVC, pero la configuracion es muy similar  
@Controller
//para enviar informacion al log, se agrega la libreria:
@Slf4j
public class ControladorInicio {
    
    //con esta anotacion, se guardan inyecta directamente la capa establecida:
    @Autowired
    private PersonaService personaService;
    
    @Autowired
    private CrearUsuarioService src;
    
    //mapeado del metodo get:
    //al estar vacio el inicio(/) se despliegara este mensaje al inicio de la aplicacion
    @GetMapping("/")
    //con el objeto model podemos enviar datos desde nuestro controlardor al navegador
    public String inicio(Model mode, @AuthenticationPrincipal User user){
        var persona = personaService.listarPersona();
        log.info("Usuario: " + user);
        mode.addAttribute("psp", persona);
        //en este caso nos regresa a una pagina de index.html(formato por default)
        
        var saldoTotal = 0D;
        for(var p: persona){
            saldoTotal += p.getSaldo();
        }
        mode.addAttribute("saldoTotal", saldoTotal);
        mode.addAttribute("totalClientes", persona.size());
        return "index";
    }
    
    //en este caso creamos en memoria un objeto de tipo persona, que sera utilizado por la pagina
    //a la que redirijimos
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "modificar";
    }
    
    //estamos usando el metodo post en este caso, y el objeto persona 
    //que recibimos es el mismo objeto previamene creado por el metodo
    //get, y en ese caso lo llena, persiste y redirije a inicio
    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona, Errors error){
        // con la anotacion valid se hace uso de las validaciones de javax
        //establecidas en la clase dominio
        if(error.hasErrors()){
            //si presenta un error se redirije al formulario y se habilita
            //el span de error
            return "modificar";
        }else{
            personaService.guardar(persona);
        return "redirect:/";
        }
    }
    
    //en esta peticion get, ademas de el path recibe la el id de la persona
    //que automaticamente se le asocia a la variable persona que recibe
    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model mode){
        //por esto no es necesario hacer el setIdPersona, pero
        //si es necesario encontrar el objeto para recibir el resto
        //de atributos:
        persona = personaService.encontrarPersona(persona);
        //se comparte este objeto persona completo a la pagina de modificar:
        mode.addAttribute("persona",persona);
        //y se hace redirije a esta pagina(que recibe siempre un objeto tipo persona):
        return "modificar";
    }
    
    /*
    como recibe la informacion de un objeto de tipo persona simplemente
    la asocia a el objeto de tipo persona que este metodo recibe
    */
    @GetMapping("/eliminar")
    public String eliminar(Persona persona){
        //y al ya tener un id asociado este procede a eliminarse con la capa de servicio:
        personaService.eliminar(persona);
        //y se redirige a la vista:
        return "redirect:/";
    }
    
    @GetMapping("/newUs")
    public String redirect(Usuario usuario){
        return "crearUs";
    }
    
    @PostMapping("/agregarUS")
    public String agregarUS(Usuario usuario){
        src.crearUsuario(usuario);
        return "index";
    }
}
