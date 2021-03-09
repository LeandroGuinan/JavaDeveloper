package test;

import domain.Persona;
import java.util.List;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

public class TestPersonaServiceRs {
    
    //variables a utilizar
    private static final  String URL_BASE ="http://localhost:8080/sga-jee-web10/webservice";
    private static Client cliente;
    private static WebTarget webTarget;
    private static Persona persona;
    private static List<Persona> personas;
    private static Invocation.Builder invocationBuilder;
    private static Response response;
    
    public static void main(String[] args) {
        cliente = ClientBuilder.newClient();
        
        //leer una persona (metodo get)
        
        webTarget = cliente.target(URL_BASE).path("/Personas");
        
        //proporcionamos un id persona valido
        
        persona = webTarget.path("/1").request(MediaType.APPLICATION_XML).get(Persona.class);
    
        System.out.println("Persona recuperada: "+persona);
        
        //Leer todas las personas(get con readEntity de tipo List<>
        
        personas = webTarget.request(MediaType.APPLICATION_XML).get(Response.class).readEntity(new GenericType<List<Persona>>(){});
        
        System.out.println("\nPersonas recuperadas: ");
        imprimirPersonas(personas);
        
        //Agregar una persona
        
        Persona personaNueva = new Persona();
        personaNueva.setNombre("Carlos");
        personaNueva.setApellido("Miranda");
        personaNueva.setEmail("cMiranda3@Mail.com");
        personaNueva.setTelefono("895632472");
        
        invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
        response = invocationBuilder.post(Entity.entity(personaNueva, MediaType.APPLICATION_XML));
        System.out.println("");
        System.out.println(response.getStatus());
        //recuperamos la persona recien agregada para despues modificarla y al final eliminarla
        Persona personaRecuperada = response.readEntity(Persona.class);
        System.out.println("Persona recuperada: " + personaRecuperada);
        
        //modificamos la persona (metodo put) 
        //persona recuperada anteriormenre
        Persona personaModificar = personaRecuperada;
        personaModificar.setApellido("Ramirez");
        String pathId ="/"+personaModificar.getIdPersona();
        
        invocationBuilder = webTarget.path(pathId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.put(Entity.entity(personaModificar, MediaType.APPLICATION_XML));
    
        System.out.println("");
        System.out.println("response: " + response.getStatus());
        System.out.println("Persona Modificada: " +response.readEntity(Persona.class));
    
        //eliminar una persona
        //persona recuperada anteriormente
        Persona personaEliminar = personaRecuperada;
        String pathEliminar = "/"+persona.getIdPersona();
        invocationBuilder = webTarget.path(pathEliminar).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.delete();
        System.out.println("");
        System.out.println("Response: "+response.getStatus());
        System.out.println("Persona Eliminada: " +personaEliminar);
    }

    private static void imprimirPersonas(List<Persona> personas) {
        for(Persona p:personas){
            System.out.println("Persona: "+p);
        }
    }
}
