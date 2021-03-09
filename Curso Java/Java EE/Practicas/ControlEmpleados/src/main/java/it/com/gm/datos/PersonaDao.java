package it.com.gm.datos;

import it.com.gm.domain.Persona;
import java.util.List;


public interface PersonaDao {

    public List<Persona> findAllPersona();
    
    public Persona findPersonaById(Persona persona);
    
    public void insertPersona(Persona persona);
    
    public void updatePersona(Persona persona);
    
    public void deletePersona(Persona persona);
}
