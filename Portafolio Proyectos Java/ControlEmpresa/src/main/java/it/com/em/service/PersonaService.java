package it.com.em.service;

import it.com.em.domain.Persona;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PersonaService {
    
    public List<Persona> getListaDePersonas();
}
