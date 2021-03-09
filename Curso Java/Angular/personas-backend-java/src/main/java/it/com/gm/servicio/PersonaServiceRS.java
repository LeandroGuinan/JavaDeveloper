package it.com.gm.servicio;

import it.com.gm.data.PersonaDao;
import it.com.gm.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.Status;

@Stateless
//para acceder a esta aplicacion:
@Path("/personas")
public class PersonaServiceRS {
    
    //se injecta la capa de datos:
    @Inject
    private PersonaDao personaDao;
    
    /*
    en algunos produce valores tipo json, en otros tambien los consume.
    ademas en algunos metodos se consume el id para generar una respuesta.
    */
    
    // y se construyen los metodos utilizados en este Rest-WS, ya que solo obtiene informacion, se usa get:
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Persona> listarPersonas(){
        List<Persona> personas = personaDao.encontrarTodasPersonas();
        System.out.println("Personas Encontradas: " + personas);
        return personas;
    }
    
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}")//hace referencia al path: /personas/{id}... ej: /personas/1
    public Persona encontrarPersona(@PathParam("id") int id){
        Persona persona = personaDao.encontrarPersona(new Persona(id));
        System.out.println("Persona Encontrada: " + persona);
        return persona;
    }
    
    //ya que agrega un valor se usa post:
    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Persona agregarPersona(Persona persona){
        personaDao.insertarPersona(persona);
        System.out.println("Persona Agregada: " + persona);
        return persona;
    }
    
    //ya que modifica informacion se usa put:
    @PUT
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response ModificarPersona(@PathParam("id") int id, Persona personaModificada){
        Persona persona = personaDao.encontrarPersona(new Persona(id));
        if(persona != null){
         personaDao.actualizarPersona(personaModificada);
            System.out.println("Persona Modificada: " + personaModificada);
            return Response.ok().entity(personaModificada).build();
        }else{
            return Response.status(Status.NOT_FOUND).build();
        }
    }
    
    //ya que elimina informacion se usa delete:
    @DELETE
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response eliminarPersona(@PathParam("id") int id){
        personaDao.eliminarPersona(new Persona(id));
        System.out.println("Persona Eliminada: " + id);
        return Response.ok().build();
    }
}
