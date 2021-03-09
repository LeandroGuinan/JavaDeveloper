package it.com.gm.servicio;

import it.com.gm.domain.Persona;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PersonaService {

    public List<Persona> encontrarPersonas();
    
    public Persona encontrarPersonaPorId(Persona persona);
    
    public void insertarPersona(Persona persona);
    
    public void updatePersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
}
