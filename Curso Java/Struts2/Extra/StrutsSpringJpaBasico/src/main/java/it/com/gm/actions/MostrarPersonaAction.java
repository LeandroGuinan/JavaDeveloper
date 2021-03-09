package it.com.gm.actions;

import com.opensymphony.xwork2.ActionSupport;
import it.com.gm.capadatos.domain.Persona;
import it.com.gm.capaservicio.PersonaService;
import java.util.List;
import org.apache.logging.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;

public class MostrarPersonaAction extends ActionSupport{
    
    private Integer contadorPersonas;
    
    Logger log = LogManager.getLogger(MostrarPersonaAction.class);
    
    @Autowired
    private PersonaService personaService;
    
    private List<Persona> personas;
    
    //agregamos el metodo execute de acciones de struts.

    @Override
    public String execute() throws Exception {
        this.personas = personaService.listarPersonas();
        this.contadorPersonas = personaService.contarPersonas();
        return SUCCESS;
    }
    
    //por ultimo agregamos los getter y setters respectivos:
    public Integer getContadorPersonas() {
        return contadorPersonas;
    }

    public void setContadorPersonas(Integer contadorPersonas) {
        this.contadorPersonas = contadorPersonas;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
/*
ahora pasamos a crear y configurar el archivo: properties, que se debe llamar
igual que esta clase, esta para manejar el comcepto de internacionalizacion.
*/
