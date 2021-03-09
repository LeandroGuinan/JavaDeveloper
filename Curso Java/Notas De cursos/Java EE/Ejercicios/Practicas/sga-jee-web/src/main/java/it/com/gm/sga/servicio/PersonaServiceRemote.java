package it.com.gm.sga.servicio;

import it.com.gm.sga.domain.Persona;
import java.util.List;
import javax.ejb.Remote;
//al ser este una interface para acceder a ella desde el cliente se debe especificar con esta anotacion
@Remote
public interface PersonaServiceRemote {
    
    /*
    la idea de esta clase es crear los metodos para interactuar posteriormente con la base de datos con todas las acciones establecidas aqui
    */
    public List<Persona> listarPersona();
    
    public Persona encontrarPersonaPorId(Persona persona);
    
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
}
