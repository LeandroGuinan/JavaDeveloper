package it.com.gm.sga.servicio;

import it.com.gm.sga.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.Status;

//ya que vamos a utilizar RestWebServices nececitamos añadir un path al cual hacer referencia
@Path("/personas")
//y ya que es un EJB
@Stateless
public class PersonaServiceRS {

    //debe ser un EJB para poder inyectar el servicio de PersonaService
    @Inject
    private PersonaService personaService;

    //ya que trabajamos con RestWebService, podemos hacer uso de varios metodos del protocolo http(get,put,delete...)
    //se utiliza get cuando solo se requiere la informacion sin modificar, se utiliza la anotacion
    @GET
    //especificamos el tipo de informacion que va a regresar, en este caso un xml y un tipo json
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Persona> listarPersonas() {
        return this.personaService.listarPersona();
    }

    //como solo solicitamos informacion, utilizamos de nuevo:
    @GET
    //y de nuevo:
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    //adicional a esto, añadiremos:
    @Path("id")
    //con esto cuando se llame a este metodo se debe especificar el id para recuperar este objeto
    //la direccion seria : /personas/{id}
    public Persona encontrarPorId(@PathParam("id") int id) {
        //con esta etiqueta hacemos referencia a el parametro que especificamos del objeto
        return this.personaService.encontrarPersonaPorId(new Persona(id));
    }

    //como enviaremos informacion al servidor para agregar una persona usamos:
    @POST
    //como producira una respuesta de este tipo:
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    //pero en este caso tambien puede recibir peticiones de este tipo:
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response agregarPersona(Persona persona) {
        try {
            //persistimos el objeto:
            this.personaService.registrarPersona(persona);
            //y construimos la respuesta, para saber que ocurrio correctamente
            return Response.ok().entity(persona).build();
        } catch (Exception e) {
            //en caso de error:
            e.printStackTrace(System.out);
            return Response.status(Status.INTERNAL_SERVER_ERROR).build();
        }

    }

    //como esta vez modificatemos una persona utilizamos
    @PUT
    //como producira una respuesta de este tipo:
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    //pero en este caso tambien puede recibir peticiones de este tipo:
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    //y como recibiremos un parametro, agregamos:
    @Path("{id}")
    public Response modificarPersona(@PathParam("id") int id, Persona personaModificada) {

        try {
            //recibimos la persona
            Persona persona = this.personaService.encontrarPersonaPorId(new Persona(id));
            //verificamos si el id si existe
            if (persona != null) {
                //para luego modificar la persona
                personaService.modificarPersona(personaModificada);
                //y generamos la respuesta
                return Response.ok().entity(personaModificada).build();
            } else {
                //si no existe esta persona entonces:
                return Response.status(Status.NOT_FOUND).build();
            }
        } catch (Exception e) {

            e.printStackTrace(System.out);
            return Response.status(Status.INTERNAL_SERVER_ERROR).build();
        }

    }

    //en este metodo como eliminaremos una persona utilizamos:
    @DELETE
    //como recibiremos un id a eliminar:
    @Path("{id}")
    public Response eliminarPersona(@PathParam("id") int id) {

        try {
            //utilizamos el persona service para elinar persona:
            personaService.eliminarPersona(new Persona(id));
            //y generamos la respuesta
            return Response.ok().build();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            //con esto generamos directamente el codigo de error http:
            return Response.status(404).build();
        }

    }

}
