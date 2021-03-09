
package it.com.gm.sga.servicio;

import it.com.gm.sga.domain.Persona;
import java.util.List;
import javax.ejb.Local;

// esta interface se encuentra del lado del servidor, por ende debe especificarse que es local para este, con esta anotacion:
@Local
//esto permite hacer llamadas a los servicios en la capa de servicio dentro del mismo servidor de aplicaciones
public interface PersonaService {
    public List<Persona> listarPersona();
    
    public Persona encontrarPersonaPorId(Persona persona);
    
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
}
