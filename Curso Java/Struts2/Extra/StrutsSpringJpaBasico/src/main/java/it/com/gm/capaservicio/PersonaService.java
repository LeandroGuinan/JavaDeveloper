package it.com.gm.capaservicio;

import it.com.gm.capadatos.domain.Persona;
import java.util.List;

public interface PersonaService {

    public List<Persona> listarPersonas();
    
    public Persona recuperarPersona(Persona persona);
    
    public void agregarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
    
    public Integer contarPersonas();
}
/*
ahora creamos la implementacion de esta interface
*/
