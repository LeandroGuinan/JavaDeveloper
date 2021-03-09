package it.com.gm.sga.servicio;

import it.com.gm.sga.domain.Persona;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

//como es un web service debemos indicarlo con la anotacion:
@WebService
public interface PersonaServiceWs {
    
    //al ser este un metodo WebService expuesto en la pagina web, se debe incluir la anotacion:
    @WebMethod
    public List<Persona> listarPersona();
}
