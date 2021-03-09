package it.com.gm.sga.web;

import it.com.gm.sga.domain.Persona;
import it.com.gm.sga.servicio.PersonaService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.*;
import org.primefaces.event.RowEditEvent;

@Named("personaBean")
@RequestScoped
public class PersonaBean {
    
    @Inject
    private PersonaService personaService;
    
    private Persona personaSeleccionada;
    
    List<Persona> personas;
    
    Logger log = LogManager.getRootLogger();
    public PersonaBean(){
        log.debug("Iniciando El Obejto Persona Bean");
    }
    
    @PostConstruct
    public void inicializar(){
        //Iniciamos las variables
        this.personas = personaService.listarPersonas();
        log.debug("Personas recuperadas en MangagedBean: " +this.personas);
        personaSeleccionada = new Persona();
    }
    
    public void editListener(RowEditEvent event){
        Persona persona = (Persona) event.getObject();
        personaService.modificarPersona(persona);
    }

    public Persona getPersonaSeleccionada() {
        return personaSeleccionada;
    }

    public void setPersonaSeleccionada(Persona personaSeleccionada) {
        this.personaSeleccionada = personaSeleccionada;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    public void agregarPersona(){
        this.personaService.registrarPersona(personaSeleccionada);
        this.personas.add(personaSeleccionada);
        this.personaSeleccionada = null;
    }
    
    public void eliminarPersona(){
        this.personaService.eliminarPersona(personaSeleccionada);
        this.personas.remove(this.personaSeleccionada);
        this.personaSeleccionada = null;
    }
    
    public void reiniciarPersonaSeleccionada(){
        this.personaSeleccionada = new Persona();
    }
}
