package it.com.sga.web;

import it.com.gm.sga.domain.Persona;
import it.com.gm.sga.servicio.PersonaService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.primefaces.event.RowEditEvent;

//esta clase java es un ManagedBean de JSF, por ende se debe usar la anotacion:
@Named("personaBean")
//este bean estara en el alcance:
@RequestScoped
public class PersonaBean {
    Logger log = LogManager.getRootLogger();
    //similar a como se hizo en el servlet se injecta la capa de servicio en la capa web
    @Inject
    private PersonaService personaService;
    
    //este atributo se agrega para cuando se seleccione una persona se aloje en este
    private Persona personaSeleccionada;
    
    //agregamos una lista de personas
    List<Persona> personas;
    
    //constructor vacio:
    public PersonaBean(){
        
    }
    
    //utilizamos una caracteristica de los javaBean, con la anotacion:
    @PostConstruct
    //esto luego de construir el objeto de esta clase se ejecutara este metodo para inicializar las variables
    public void inicializar(){
        //Iniciamos las variables:
        personas = personaService.listarPersona();
        log.debug(personas);
        //asignamos una persona vacia para que se guarden los atributos tipo persona en esta
        personaSeleccionada = new Persona();
    }
    
    //aqui agregamos el evento utilizado en el JSF listaPersonas
    public void editListener(RowEditEvent event){
        //creamos una nueva persona y utilizamos la caracteristica de prime faces para recuperar la persona de este evento
        Persona persona = (Persona) event.getObject();//casteamos a persona
        
        //llamamos el metodo modificar persona, de persona service y proporcionamos la persona seleccionada
        personaService.modificarPersona(persona);
    }
    
    //agregamos los metodos get y set de persona seleccionada y de personas
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
    //debido a que estamos utilizando glassfish 5 debemos agregar la configuracion para indicar que vamos a utilizar la version de JSF 2.3
    
    //metodo para agregar una persona:
    public void agregarPersona(){
        //debido a la persona seleccionada, agregaremos esa persona a la base de datos
        this.personaService.registrarPersona(personaSeleccionada);
        //tambien debemos de repricar esta informacion al listado para que aparezca en el modelo
        this.personas.add(personaSeleccionada);
        //y por ultimo reestablecemos el valor de la persona seleccionada
        this.personaSeleccionada = null;
    }
    
    //metodo para eliminar una persona
    public void eliminarPersona(){
        //esto elimina la persona de la base de datos
        this.personaService.eliminarPersona(personaSeleccionada);
        //con este la eliminamos de la lista en pantalla
        this.personas.remove(this.personaSeleccionada);
        //y reestablecemos la persona seleccionada
        this.personaSeleccionada = null;
    }
    
    //metodo para reiniciar el valor de persona
    public void reiniciarPersonaSeleccionada(){
        this.personaSeleccionada = new Persona();
    }
}
