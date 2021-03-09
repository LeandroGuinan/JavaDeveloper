package it.com.gm.capadatos;

import it.com.gm.capadatos.domain.Persona;
import java.util.List;

public interface PersonaDao {

    void insertPersona(Persona persona);
    
    void updatePersona(Persona persona);
    
    void deletePersona(Persona persona);
    
    Persona findPersonaById(Integer idPersona);
    
    List<Persona> findAllPersonas();
    
    Integer contadorPersonas();
    
    Persona getPersonaByEmail(Persona persona);
}
/*
ahora creamos una implementacion de esta interface.
que a su vez implementara la tecnologia spring
y jpa para realizar las operaciones.
*/
