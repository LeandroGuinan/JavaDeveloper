package it.com.gm.service;

import it.com.gm.dao.PersonaDao;
import it.com.gm.domain.Persona;
import java.util.List;


public class ServicioPersonas {
    
    PersonaDao personaDao;

    public ServicioPersonas() {
        this.personaDao = new PersonaDao();
    }
    
    
    
    public List<Persona> listarPersonas(){
        return this.personaDao.listar();
    }
}
